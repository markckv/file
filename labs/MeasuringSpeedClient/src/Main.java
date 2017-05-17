import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Main { public static void main(String[] args) throws IOException, IOException {
    Socket socket = new Socket("127.0.0.1",2017);
    OutputStream is = socket.getOutputStream();
    DataOutputStream dis = new DataOutputStream(is);
    for(int i = 0; i<10;i++){
        int k = 0;
        long time = System.currentTimeMillis();
        time += 1000;
        while (time> System.currentTimeMillis()){
            dis.write(1);
            k++;
        }
        System.out.println("Client 127.0.0.1 speed:  "+k*0.001 +"kb/sec");
    }



}
}