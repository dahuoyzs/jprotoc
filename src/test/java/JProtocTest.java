import io.github.dahuoyzs.JProtoc;
import io.github.dahuoyzs.jprotoc.parse.bo.ProtoInfo;

import java.io.File;

public class JProtocTest {

    public static void main(String[] args) {
        String name = "wzdj.proto";
        JProtoc.genJavaBeanByProtoFile(new File(name), new File("D:\\desktop\\fastdesk\\temp\\test\\"));

    }

}
