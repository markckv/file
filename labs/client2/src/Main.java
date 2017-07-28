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
    DataInputStream DIS = new DataInputStream(is);
    Scanner SC = new Scanner(System.in);
    File file;
    long DM;
    if(true){
        ProtocolFileSendler PFS = new ProtocolFileSendler();
       //  file = new File(SC.nextLine());
        file = new File("/home/mark/IdeaProjects/sss/");
        while (true){
            if(!dersiter.modificationDate(file)){
                dos.writeBoolean(true);
                PFS.PFSD2(file,is,os);
                dos.writeUTF("stop");
continue;
            }else {
                dos.writeBoolean(false);
            }
            if(DIS.readBoolean()){
                while (true){
                    try{
                        PFR.PFR(is,os,file);
                    }
                    catch (Exception r){
                        break;
                    }

                }
                continue;
            }

        }
    }


    socket.close();

}}
///home/mark/IdeaProjects/sss
