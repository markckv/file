import java.io.*;

/**
 * Created by mark on 10.07.17.
 */
public class ProtocolFileSendler {
    long size;
    public void PFS(File file, OutputStream OS, InputStream IS) throws IOException {
        DataOutputStream DOS = new DataOutputStream(OS);
       if( file.isDirectory()){
           DOS.writeUTF("directory");
           DOS.writeUTF(file.getAbsolutePath().substring((int) size));
       }else{
           DOS.writeUTF("file");
           DOS.writeLong(file.lastModified());
           DOS.writeLong(file.length());//!!!!!!!!!!!!!
           DOS.writeUTF(file.getAbsolutePath().substring((int) size));
           FileSender FS = new FileSender();
           FS.fileSend(file, OS);

       }

    }
    public void PFSD(File file, InputStream is , OutputStream os) throws IOException {
        File[] files= file.listFiles();
        for(int i = 0; i<files.length; i++){
            PFS(files[i], os, is);
            if (files[i].isDirectory()){
                PFSD(files[i], is,os);

            }
        }
    }
    public void PFSD2(File file, InputStream is , OutputStream os) throws IOException {
      size = file.getAbsolutePath().length();
      PFSD(file,is,os);
    }
}
