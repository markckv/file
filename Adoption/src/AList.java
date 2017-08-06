import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mark on 04.08.17.
 */
public class AList {
    public List<Integer> alist(DataOutputStream dos, DataInputStream DIS) throws IOException {
        int size = (int) DIS.readLong();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            list.add((int) DIS.readLong());
            System.out.println(i + "|" + list.size() + "|"+list.get(i));
        }
        return (list);
    }
}
