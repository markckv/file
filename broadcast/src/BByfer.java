import com.sun.corba.se.pept.transport.ByteBufferPool;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/**
 * Created by mark on 06.08.17.
 */
public class BByfer {
    public void bbyfer(String string , DataOutputStream dos, DataInputStream DIS) throws IOException {
        dos.writeLong(string.getBytes().length);
        ByteBuffer bb = ByteBuffer.allocate(string.getBytes().length);
        bb.put(string.getBytes());
        for(int i = 0; i<string.getBytes().length; i++){
            dos.writeByte(bb.array()[i]);
        }
    }
}
