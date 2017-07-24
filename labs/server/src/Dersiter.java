import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by mark on 17.07.17.
 */
public class Dersiter {
    Map<String, Long> der = new HashMap<>();
    public boolean modificationDate(File file) throws IOException {
        Map<String, Long> der1 = new HashMap<>();

        File[] files= file.listFiles();
        for(int i = 0; i<files.length; i++){
            if (files[i].isDirectory()){

                der1.put(files[i].getAbsolutePath(), files[i].lastModified() );
                modificationDate(files[i]);

            }
        }
        if(!der.equals(der1)){
           der = der1;
           return(false);
        }else{
            return(true);
        }
    }
}
