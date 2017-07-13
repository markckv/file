import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by mark on 03.07.17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(9999);
        Socket socket = ss.accept();
        InputStream is = socket.getInputStream();
        OutputStream os = socket.getOutputStream();
        ProtocolFileRes PFR = new ProtocolFileRes();
        while (true){
           PFR.PFR(is,os);
        }
    }
}