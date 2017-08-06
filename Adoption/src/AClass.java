import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * Created by mark on 06.08.17.
 */
public class AClass {
    public Class2 aclass(DataOutputStream dos, DataInputStream DIS) throws IOException {
String nameClass = DIS.readUTF();
        int size = (int) DIS.readLong();
        byte[] bytes = new byte[size];
        for(int i =0;i<size;i++){
            bytes[i]= DIS.readByte();
        }
Class2 cl2 = new Class2();
        cl2.deserialize(bytes);
return (cl2);
    }
}
