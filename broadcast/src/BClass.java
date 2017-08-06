import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * Created by mark on 06.08.17.
 */
public class BClass {
    public void bclass(Class2 cl2, DataOutputStream dos, DataInputStream DIS) throws IOException {
        dos.writeUTF("Class2");
        byte[] bytes = cl2.classs();
        dos.writeLong(bytes.length);
        for(int i = 0; i<bytes.length; i++){
            dos.writeByte(bytes[i]);
        }
    }
}
