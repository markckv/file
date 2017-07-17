import java.io.*;
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
        ServerSocketChannel ss = ServerSocketChannel.open();
        ss.socket().bind(new InetSocketAddress(9999));
        Selector selector = Selector.open();
        SocketChannel socket = ss.accept();
        InputStream is = socket.socket().getInputStream();
        OutputStream os = socket.socket().getOutputStream();
        ProtocolFileRes PFR = new ProtocolFileRes();
        socket.configureBlocking(true);
        while (true){
            try{
                PFR.PFR(is,os);
            }
            catch (Exception r){
                break;
            }

        }
        socket.configureBlocking(false);
        SelectionKey SK = socket.register(selector, SelectionKey.OP_READ);
        while (true){
            int number = selector.select();
            SK.cancel();
            socket.configureBlocking(true);
            while (true){
                try{
                    PFR.PFR(is,os);
                }
                catch (Exception r){
                    break;
                }
            }
            socket.configureBlocking(false);
            SK = socket.register(selector, SelectionKey.OP_READ);


}
    }
}