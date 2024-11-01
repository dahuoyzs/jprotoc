package io.github.dahuoyzs;

import com.alibaba.fastjson.JSON;
import io.github.dahuoyzs.jprotoc.protobuf3.Protobuf3Lexer;
import io.github.dahuoyzs.jprotoc.protobuf3.Protobuf3Parser;
import io.github.dahuoyzs.parse.ProtoListener;
import io.github.dahuoyzs.parse.bo.ProtoInfo;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * <p>
 *     秋千水，竹马道，一眼见你，万物不及。<br>
 *     春水生，春林初胜，春风十里不如你。
 * </p>
 *
 * <p>
 *     JProtoc 是一个java版本的protoc编译工具类库，通过antlr4编译protobuf2.g4和protobuf3.g4生成词法分析和语法分析器。
 *     提供Visitor和Listener两种访问方式。方便java开发者 根据.proto文件编写代码生成器。和proto语法高亮插件等。
 * </p>
 *
 * antlr Visitor模式 和 Listener的用法 可以参考这两篇博客
 * 使用Antlr4的Visitor模式实现一个简单的整数计算器
 * <a href="https://blog.csdn.net/u014454538/article/details/129340412">...</a>
 * 使用Antlr4的Listener模式实现一个简单的整数计算器
 * <a href="https://blog.csdn.net/u014454538/article/details/129543561">...</a>
 *
 * @author dahuoyzs
 */
public class JProtoc {

   private JProtoc(){}

   public static ProtoInfo parseProtoStr(String protoStr) {
      //lexer parser
      CodePointCharStream input = CharStreams.fromString(protoStr);
      Protobuf3Lexer lexer = new Protobuf3Lexer(input);
      CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
      Protobuf3Parser parser = new Protobuf3Parser(commonTokenStream);
      ParseTreeWalker walker = new ParseTreeWalker();
      ProtoListener protoListener = new ProtoListener();
      walker.walk(protoListener, parser.proto());
      return protoListener.getProtoInfo();
   }

   public static ProtoInfo parseProtoFile(File file) {
      try {
         String content = new String(Files.readAllBytes(Paths.get(file.getAbsolutePath())));
         return parseProtoStr(content);
      } catch (IOException e) {
         e.printStackTrace();
      }
      return new ProtoInfo();
   }

   public static void main(String[] args) {

      String name = "wzdj.proto";
      ProtoInfo protoInfo = parseProtoFile(new File(name));
      System.out.println(JSON.toJSONString(protoInfo));


   }

}