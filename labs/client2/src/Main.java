import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by mark on 10.07.17.
 */
public class Main { public static void main(String[] args) throws IOException, InterruptedException {
    Socket socket = new Socket("127.0.0.1", 9999);
    //Socket socket = new Socket("192.168.100.10", 9999);
    Dersiter dersiter = new Dersiter();
    OutputStream os = socket.getOutputStream();
    ProtocolFileRes PFR = new ProtocolFileRes();
    DataOutputStream dos = new DataOutputStream(os);
    InputStream is = socket.getInputStream();
    Scanner SC = new Scanner(System.in);
    int what = SC.nextInt();
    SC.nextLine();
    if(what ==1){
        ProtocolFileRes PFR = new ProtocolFileRes();
        PFR.PFR(is,os);
    }
    File file;
    long DM;
    if(what ==2){
        ProtocolFileSendler PFS = new ProtocolFileSendler();
         file = new File(SC.nextLine());
         DM = file.lastModified();
        PFS.PFSD2(file,is,os);
        dos.writeUTF("stop");
        while (true){
            //Thread.sleep(5000);
            if(!dersiter.modificationDate(file)){
                PFS.PFSD2(file,is,os);
                dos.writeUTF("stop");

            }
            try{
                PFR.PFR(is,os);
            }
            catch (Exception r){
                break;
            }
        }
    }


    socket.close();

}}
