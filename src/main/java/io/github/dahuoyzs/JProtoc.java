package io.github.dahuoyzs;

import io.github.dahuoyzs.jprotoc.protobuf2.Protobuf2Lexer;
import io.github.dahuoyzs.jprotoc.protobuf2.Protobuf2Parser;
import io.github.dahuoyzs.jprotoc.protobuf3.Protobuf3Lexer;
import io.github.dahuoyzs.jprotoc.protobuf3.Protobuf3Parser;
import io.github.dahuoyzs.jprotoc.parse.Proto2Listener;
import io.github.dahuoyzs.jprotoc.parse.Proto3Listener;
import io.github.dahuoyzs.jprotoc.parse.bo.ProtoInfo;
import io.github.dahuoyzs.util.GenJavaBean;
import io.github.dahuoyzs.util.Utils;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 秋千水，竹马道，一眼见你，万物不及。<br>
 * 春水生，春林初胜，春风十里不如你。
 * </p>
 *
 * <p>
 * JProtoc 是一个java版本的protoc编译工具类库，通过antlr4编译protobuf2.g4和protobuf3.g4生成词法分析和语法分析器。
 * 提供Visitor和Listener两种访问方式。方便java开发者 根据.proto文件编写代码生成器。和proto语法高亮插件等。
 * </p>
 * <p>
 * antlr Visitor模式 和 Listener的用法 可以参考这两篇博客
 * 使用Antlr4的Visitor模式实现一个简单的整数计算器
 * <a href="https://blog.csdn.net/u014454538/article/details/129340412">...</a>
 * 使用Antlr4的Listener模式实现一个简单的整数计算器
 * <a href="https://blog.csdn.net/u014454538/article/details/129543561">...</a>
 *
 * @author dahuoyzs
 */
public class JProtoc {

    private JProtoc() {
    }


   public static ProtoInfo loadByStr(String protoStr) {
       //Protocol Buffers (proto文件) 的默认语法版本是 proto2。如果你的.proto文件中没有明确指定syntax字段，那么编译器会默认该文件遵循proto2语法。
      List<String> proto3List = new ArrayList<>();
      proto3List.add("syntax=\"proto3\"");
      proto3List.add("syntax =\"proto3\"");
      proto3List.add("syntax= \"proto3\"");
      proto3List.add("syntax = \"proto3\"");
      boolean isProto3 = false;
      for (String proto3 : proto3List) {
          if (protoStr.contains(proto3)) {
              isProto3 = true;
              break;
          }
      }
      if (isProto3) {
         return loadProto3ByStr(protoStr);
      } else {
         return loadProto2ByStr(protoStr);
      }
   }

   public static ProtoInfo loadByFile(File protoFile) {
      ProtoInfo protoInfo = loadByStr(Utils.readFileStr(protoFile));
      protoInfo.setPbName(protoFile.getName());
      return protoInfo;
   }

    public static ProtoInfo loadProto2ByStr(String protoStr) {
        //lexer parser
        CodePointCharStream input = CharStreams.fromString(protoStr);
        Protobuf2Lexer lexer = new Protobuf2Lexer(input);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        Protobuf2Parser parser = new Protobuf2Parser(commonTokenStream);
        ParseTreeWalker walker = new ParseTreeWalker();
        Proto2Listener proto2Listener = new Proto2Listener();
        walker.walk(proto2Listener, parser.proto());
        return proto2Listener.getProtoInfo();
    }


    public static ProtoInfo loadProto2ByFile(File protoFile) {
        ProtoInfo protoInfo = loadProto2ByStr(Utils.readFileStr(protoFile));
        protoInfo.setPbName(protoFile.getName());
        return protoInfo;
    }


    public static ProtoInfo loadProto3ByStr(String protoStr) {
        //lexer parser
        CodePointCharStream input = CharStreams.fromString(protoStr);
        Protobuf3Lexer lexer = new Protobuf3Lexer(input);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        Protobuf3Parser parser = new Protobuf3Parser(commonTokenStream);
        ParseTreeWalker walker = new ParseTreeWalker();
        Proto3Listener proto3Listener = new Proto3Listener();
        walker.walk(proto3Listener, parser.proto());
        return proto3Listener.getProtoInfo();
    }


    public static ProtoInfo loadProto3ByFile(File protoFile) {
        ProtoInfo protoInfo = loadProto3ByStr(Utils.readFileStr(protoFile));
        protoInfo.setPbName(protoFile.getName());
        return protoInfo;
    }

    public static void genJavaBeanByProtoStr(String protoStr, File javaBeanDir) {
        GenJavaBean.gen(loadByStr(protoStr), javaBeanDir);
    }

    public static void genJavaBeanByProtoFile(File protoFile, File javaBeanDir) {
        GenJavaBean.gen(loadByFile(protoFile), javaBeanDir);
    }



}
