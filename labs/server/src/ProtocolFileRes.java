import java.io.*;

/**
 * Created by mark on 10.07.17.
 */
public class ProtocolFileRes {
    public File PFR(InputStream is, OutputStream OS) throws IOException, Exception {
        DataOutputStream DOS = new DataOutputStream(OS);
        DataInputStream DIS = new DataInputStream(is);
       String what = DIS.readUTF();
        if(what.equals("directory")){
            String name = DIS.readUTF();
            File file = new File(System.getProperty("user.dir")+"/file"+name);
            file.mkdirs();
            return(null);
        }else{
            if(what.equals("stop")){
throw new Exception("stop");
            }
            long DM  = DIS.readLong();
            long FS  = DIS.readLong();
            String name = DIS.readUTF();
            FileReciver FR = new FileReciver();
            File file = new File(System.getProperty("user.dir")+"/file");
            file.mkdir();
            String name2 = System.getProperty("user.dir")+"/file/"+name;
            return (FR.reciv(is,FS,name2));
        }

    }
}
