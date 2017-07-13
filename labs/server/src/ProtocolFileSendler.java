import java.io.*;

/**
 * Created by mark on 10.07.17.
 */
public class ProtocolFileSendler {
    public void PFS(File file, OutputStream OS, InputStream IS) throws IOException {
        DataOutputStream DOS = new DataOutputStream(OS);
       if( file.isDirectory()){
           DOS.writeUTF("directory");
           DOS.writeUTF(file.getName());
       }else{
           DOS.writeUTF("file");
           DOS.writeLong(file.lastModified());
           DOS.writeLong(file.length());//!!!!!!!!!!!!!
           DOS.writeUTF(file.getName());
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
}
