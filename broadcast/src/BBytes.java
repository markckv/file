import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * Created by mark on 05.08.17.
 */
public class BBytes {
    public void bbytes(byte[] bytes, DataOutputStream dos, DataInputStream DIS) throws IOException {
        dos.writeLong(bytes.length);
        for(int i = 0; i<bytes.length; i++){
            dos.writeByte(bytes[i]);
        }
    }
}
