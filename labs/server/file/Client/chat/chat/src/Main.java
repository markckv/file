import javax.print.DocFlavor;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/mark/fff");
        Reader r = new FileReader(file);
        DatagramSocket DS = new DatagramSocket(2017);
        ByteBuffer bytes = ByteBuffer.allocate(256);
        ByteBuffer bytes2 = ByteBuffer.allocate(256);
        long time = System.currentTimeMillis();
        long time2 = System.currentTimeMillis();
        time += 1000;
        DS.setBroadcast(true);
        Map<InetAddress, Long> IL = new HashMap<>();
        Map<InetAddress, Long> IL2 = new HashMap<>();
        while (true) {
            time2 = System.currentTimeMillis();


            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String s2 = new String(s.getBytes(), "UTF-8");
            DatagramPacket DP = new DatagramPacket(s2.getBytes() , s2.getBytes().length);
            DP.setAddress(InetAddress.getByName("255.255.255.255"));
            DP.setPort(2017);
            DS.send(DP);

        }
    }
}s.getBytes(), "UTF-8");
            DatagramPacket DP = new DatagramPacket(s2.getBytes() , s2.getBytes().length);
            DP.setAddress(InetAddress.getByName("255.255.255.255