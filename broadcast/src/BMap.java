import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by mark on 05.08.17.
 */
public class BMap {
    public void bmap(Map<Integer, Integer> map,DataOutputStream dos, DataInputStream DIS) throws IOException {
        dos.writeLong(map.size());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            dos.writeLong(entry.getKey());
            dos.writeLong(entry.getValue());
        }
    }
}
