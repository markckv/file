import java.io.*;

/**
 * Created by mark on 10.07.17.
 */
public class ProtocolFileRes {
    public File PFR(InputStream is, OutputStream OS, File file) throws IOException {
        DataOutputStream DOS = new DataOutputStream(OS);
        DataInputStream DIS = new DataInputStream(is);
        if(DIS.readUTF().equals("directory")){
            String name = DIS.readUTF();

            file.mkdir();


            return(null);
        }else{
            long DM  = DIS.readLong();
            long FS  = DIS.readLong();
            String name = DIS.readUTF();
            FileReciver FR = new FileReciver();
            return (FR.reciv(is,FS,name));
        }

    }
}
