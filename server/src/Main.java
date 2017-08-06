import org.omg.CORBA.*;

import java.io.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Inet4Address;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Set;

/**
 * Created by mark on 03.07.17.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Dersiter dersiter = new Dersiter();
        ServerSocketChannel ss = ServerSocketChannel.open();
        ss.socket().bind(new InetSocketAddress(9999));
        Selector selector = Selector.open();
        SocketChannel socket = ss.accept();
        InputStream is = socket.socket().getInputStream();
        OutputStream os = socket.socket().getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        DataInputStream DIS = new DataInputStream(is);
        ProtocolFileRes PFR = new ProtocolFileRes();
        socket.configureBlocking(true);
        ProtocolFileSendler PFS = new ProtocolFileSendler();

        while (true){

            if(DIS.readBoolean()){
                while (true){
                    try{
                        PFR.PFR(is,os);
                    }
                    catch (Exception r){
                        break;
                    }

                }
                continue;
            }
           File file = new File(System.getProperty("user.dir")+"/file");
           // File file = new File( "/home/mark/IdeaProjects/server/file");
            if(!dersiter.modificationDate(file)){
                dos.writeBoolean(true);
                PFS.PFSD2(file,is,os);
                dos.writeUTF("stop");

            }else {
                dos.writeBoolean(false);
                System.out.println(file.canRead()+"!"+file.getAbsolutePath()+"!"+file.isDirectory()+"111111111111111111");
            }

}
    }
}