import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by mark on 31.07.17.
 */
public class DersterDirectory {

    //Map<String, Long> DM = new HashMap<>();
    Map<String, Long> checking = new HashMap<>();
    public Map<String, Long> dersterDirectory(File file){
        File[] files= file.listFiles();
        for(int i = 0; i<files.length; i++){
            if (files[i].isDirectory()){

                checking.put(files[i].getAbsolutePath(), files[i].lastModified() );
                dersterDirectory(files[i]);

            }
        }

return (checking);
    }
    public void nullit(){
        Map<String, Long> newmap = new HashMap<>();
        checking = newmap;
    }


}
