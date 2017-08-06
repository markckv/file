import java.io.*;
import java.net.InetSocketAddress;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by mark on 04.08.17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ServerSocketChannel ss = ServerSocketChannel.open();
        ss.socket().bind(new InetSocketAddress(9999));
        Selector selector = Selector.open();
        SocketChannel socket = ss.accept();
        InputStream is = socket.socket().getInputStream();
        OutputStream os = socket.socket().getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        DataInputStream DIS = new DataInputStream(is);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
long what = DIS.readLong();
        if (what == 1) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            AList alist = new AList();
            list = (ArrayList<Integer>) alist.alist(dos, DIS);

        }
        if(what==2){
            {

                AMap amap = new AMap();
                map = amap.amap(dos,DIS);
            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey());
                System.out.println(entry.getValue());
            }
        }
        if(what==4){
            ABytes aBytes = new ABytes();
            byte[] bytes = aBytes.abytes(dos,DIS);
        }
        if(what==3){
            Abyfer abyfer = new Abyfer();
            String string = abyfer.abyfer(dos,DIS);
            System.out.print(string);
        }
if(what==5){
            AClass aClass = new AClass();
            aClass.aclass(dos,DIS);
}
    }
}
