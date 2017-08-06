import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by mark on 05.08.17.
 */
public class AMap {
    public Map<Integer, Integer> amap(DataOutputStream dos, DataInputStream DIS) throws IOException {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int size = (int) DIS.readLong();
        for(int i = 0; i<size;i++){
            map.put( (int)DIS.readLong(), (int)DIS.readLong());
        }
        return(map);
    }
}
