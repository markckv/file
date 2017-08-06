import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/**
 * Created by mark on 06.08.17.
 */
public class Abyfer {
    public String abyfer(DataOutputStream dos, DataInputStream DIS) throws IOException {
        int size = (int) DIS.readLong();
        ByteBuffer bb = ByteBuffer.allocate(size);
        for(int i =0;i<size;i++){
            bb.put(DIS.readByte());
        }
        String string = new String(bb.array());

        return(string);

    }
}
