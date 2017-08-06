import java.io.*;

/**
 * Created by mark on 10.07.17.
 */
public class FileReciver {
    public File reciv(InputStream is, long size, String name) throws IOException {
        byte[] bytes = new byte[256];
        int o = 0;
File file = new File(name);
        FileOutputStream FIS = new FileOutputStream(file);
        for (int i = 0; i < size; i = i + o) {
            o = is.read(bytes);
            FIS.write(bytes, 0, o);

        }
        return (file);
}}
