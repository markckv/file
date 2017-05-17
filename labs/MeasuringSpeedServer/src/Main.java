import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by mark on 13.05.17.
 */
public class Main  { public static void main(String[] args) throws IOException {
    ServerSocket ss = new ServerSocket(2017);
    Socket socket =  ss.accept();
    InputStream is = socket.getInputStream();
    OutputStream os = socket.getOutputStream();
    DataInputStream dis = new DataInputStream(is);
    int[][] mas = new int[20][20];
   while (true){
       int i = dis.readInt();
   }

}
}