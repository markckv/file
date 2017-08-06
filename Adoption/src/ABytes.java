import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * Created by mark on 05.08.17.
 */
public class ABytes {
    public byte[] abytes(DataOutputStream dos, DataInputStream DIS) throws IOException {
        int size = (int) DIS.readLong();
        byte[] bytes = new byte[size];
        for(int i =0;i<size;i++){
            bytes[i]= DIS.readByte();
        }
        return(bytes);
    }
}
