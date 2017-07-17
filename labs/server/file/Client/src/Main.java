import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by mark on 03.07.17.
 */
public class Main  { public static void main(String[] args) throws IOException {
    Socket socket = new Socket("127.0.0.1",9999);
    OutputStream os = socket.getOutputStream();
    DataOutputStream dos = new DataOutputStream(os);
    InputStream is = socket.getInputStream();
    DataInputStream dis = new DataInputStream(is);
    dos.writeUTF("dummy_test");
    long error = dis.readLong();
    if (error != 0 ){
    System.out.print("error "+error);
    System.exit(1);
    }
    Scanner SC = new Scanner(System.in);
    int what = SC.nextInt();
    dos.writeLong(what);
    if(what == 1){
        SC.nextLine();
String nameFile = SC.nextLine();
dos.writeUTF(nameFile);
        long DM, size;

        nameFile = dis.readUTF();
        size = dis.readLong();
        DM = dis.readLong();
        if (size == 0) {
            dos.writeLong(1);
            socket.close();
            System.exit(1);
        }
        if (DM == 0) {
            dos.writeLong(1);
            socket.close();
            System.exit(1);
        }
        if (nameFile.equals("")) {
            dos.writeLong(1);
            socket.close();
            System.exit(1);
        }
        String root = System.getProperty("user.dir");
        File fileFile = new File(root + "/" +"dummy_test"+ "/" + nameFile);
        if (fileFile.exists() != true) {
            fileFile.createNewFile();
        }
        if (DM == fileFile.lastModified()) {
            dos.writeLong(3);
            socket.close();
            System.exit(1);
        }
        FileOutputStream dos2 = new FileOutputStream(fileFile);

        dos.writeLong(0);
        byte[] bytes = new byte[256];
        int o = 0;

        for (int i = 0; i < size; i = i + o) {
            o = dis.read(bytes);
            dos2.write(bytes, 0, o);

        }
        fileFile.setLastModified(DM);
        System.exit(1);

    }
    File file = new File("/home/mark/fff");
    dos.writeUTF(file.getName());
    dos.writeLong(file.length());
    dos.writeLong(file.lastModified());
 error = dis.readLong();
    if (error != 0 ){
        System.out.print("error "+error);
        System.exit(1);
    }
    byte[] bytes = new byte[256];
    error = dis.readLong();
    if (error != 0 ){
        System.out.print("error "+error);
        System.exit(1);
    }
    FileInputStream fis = new FileInputStream(file);
   for(int i = 0 ; i< file.length(); i= i+256){
       fis.read(bytes);
       dos.write(bytes);
   }

socket.close();
}}
 != 0 ){
        System.out.print("error "+error);
        System.exit(1);
    }
    FileInputStream fis = new FileInputStream(file);
   for(int i = 0 ; i< file.length(); i= i+256){
       fis.read(bytes);
       dos.write(bytes);
   }
