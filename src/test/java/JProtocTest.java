import io.github.dahuoyzs.JProtoc;
import io.github.dahuoyzs.jprotoc.parse.bo.ProtoInfo;

import java.io.File;

public class JProtocTest {

    public static void main(String[] args) {
        String name = "wzdj.proto";
        ProtoInfo protoInfo = JProtoc.loadByFile(new File(name));

        System.out.println("pbName:"+protoInfo.getPbName());
        System.out.println("syntax:"+protoInfo.getSyntax());
        System.out.println("packageName:"+protoInfo.getPackageName());

        System.out.println("optionSize:"+protoInfo.getOptionMap().size());
        System.out.println("messageSize:"+protoInfo.getMessageMap().size());
        System.out.println("enumSize:"+protoInfo.getEnumMap().size());
//        System.out.println(JSON.toJSONString(protoInfo));
    }

}
