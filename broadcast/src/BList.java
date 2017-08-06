import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * Created by mark on 04.08.17.
 */
public class BList {
    public void List(List<Integer> list, DataOutputStream dos, DataInputStream DIS) throws IOException {

        dos.writeLong(list.size());
        for (int i = 0; i < list.size(); i++) {
            dos.writeLong(list.get(i));
            System.out.println("вывод отправки:" + list.get(i));
        }

    }
}
