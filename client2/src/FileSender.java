import java.io.*;

/**
 * Created by mark on 10.07.17.
 */
public class FileSender {
    public void fileSend(File file, OutputStream OS) throws IOException {
        byte[] bytes = new byte[256];
        FileInputStream FIS  = new FileInputStream(file);
        for(int i = 0 ; i<file.length(); i = i + 256){
            FIS.read(bytes);
            OS.write(bytes);
        }
FIS.close();
    }
}

