import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by mark on 17.07.17.
 */
public class Dersiter {Map<String, Long> checking = new HashMap<>();
    Map<String, Long> DM = new HashMap<>();
    public boolean modificationDate(File file) throws IOException {
        DersterDirectory DD = new DersterDirectory();
        checking = DD.dersterDirectory(file);
        DD.nullit();
        if(!DM.equals(checking)){
            DM = checking;

            return(false);
        }else{
            return(true);

        }
    }}
