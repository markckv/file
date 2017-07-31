import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by mark on 31.07.17.
 */
public class DersterTest {
    Map<String, Long> checking = new HashMap<>();
    Map<String, Long> DM = new HashMap<>();
    public boolean modificationDate(File file) throws IOException {
        DersterDirectory DD = new DersterDirectory();
        checking = DD.dersterDirectory(file);
        if(!DM.equals(checking)){
            DM = checking;

            return(false);
        }else{
            return(true);
        }
    }}
