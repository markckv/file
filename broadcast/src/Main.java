import java.io.*;
import java.net.Socket;
import java.util.*;

/**
 * Created by mark on 04.08.17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 9999);
        OutputStream os = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        InputStream is = socket.getInputStream();
        DataInputStream DIS = new DataInputStream(is);
        Scanner SC = new Scanner(System.in);
        Random random = new Random();
        System.out.println("1- список");
        System.out.println("2- map");
        System.out.println("3- string ");
        System.out.println("4- byte[]");
        int what = SC.nextInt();
        SC.nextLine();
        dos.writeLong(what);
        if (what == 1) {
            BList blist = new BList();
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < random.nextInt(10); i++) {
                System.out.println(i + "|" + list.size());
                list.add(random.nextInt());
            }
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
            blist.List(list, dos, DIS);
        }
        if (what == 2) {
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            for (int i = 0; i < random.nextInt(10); i++) {
                map.put(random.nextInt(), random.nextInt());
            }
            BMap bmap = new BMap();
            bmap.bmap(map, dos, DIS);
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey());
                System.out.println(entry.getValue());
            }
        }
        if(what==3){
            String string = SC.nextLine();
            BByfer bByfer = new BByfer();
            bByfer.bbyfer(string, dos, DIS);
        }
        if (what == 4) {
            byte[] bytes = new byte[10];

               random.nextBytes(bytes);

            BBytes bBytes = new BBytes();
            bBytes.bbytes(bytes,dos,DIS);


        }
        if(what==5){
            Class2 cl2 = new Class2();
            BClass bClass= new BClass();
            bClass.bclass(cl2, dos , DIS);
        }
    }
}
