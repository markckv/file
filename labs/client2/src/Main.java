import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by mark on 10.07.17.
 */
public class Main { public static void main(String[] args) throws IOException {
    Socket socket = new Socket("127.0.0.1", 9999);
    OutputStream os = socket.getOutputStream();
    DataOutputStream dos = new DataOutputStream(os);
    InputStream is = socket.getInputStream();
    Scanner SC = new Scanner(System.in);
    int what = SC.nextInt();
    SC.nextLine();
    if(what ==1){
        ProtocolFileRes PFR = new ProtocolFileRes();
        PFR.PFR(is,os);
    }
    if(what ==2){
        ProtocolFileSendler PFS = new ProtocolFileSendler();
        File file = new File(SC.nextLine());
        PFS.PFSD(file,is,os);
    }
    socket.close();
}}
