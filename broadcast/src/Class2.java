import java.nio.ByteBuffer;
import java.util.InputMismatchException;

/**
 * Created by mark on 06.08.17.
 */
public class Class2 {
    int a,s,d;
    String f  = new String();
    String f1  = new String();
    String f2 = new String();
    public Class2(){
        a=1; s=2; d=3;
        f1="asd1";
        f2="asd2"; f="asd3";
    }
    public byte[] classs(){
       int size = f.getBytes().length+f1.getBytes().length+f2.getBytes().length+Integer.BYTES*6;
    byte[] bytes = new byte[size];
    int pos =0;
    ByteBuffer.allocate(Integer.BYTES).putInt(f.getBytes().length).array();
    System.arraycopy(ByteBuffer.allocate(Integer.BYTES).putInt(f.getBytes().length).array(), 0, bytes,0, Integer.BYTES);
    pos +=Integer.BYTES;
            System.arraycopy(f.getBytes(), 0,bytes,pos,f.getBytes().length);
            pos += f.getBytes().length;
       System.arraycopy(ByteBuffer.allocate(Integer.BYTES).putInt(f1.getBytes().length).array(), 0, bytes, pos, Integer.BYTES );
        pos +=Integer.BYTES;
        System.arraycopy(f1.getBytes(), 0,bytes,pos,f1.getBytes().length);
        pos += f1.getBytes().length;
        System.arraycopy(ByteBuffer.allocate(Integer.BYTES).putInt(f2.getBytes().length).array(), 0, bytes,pos, Integer.BYTES);
        pos += Integer.BYTES;
        System.arraycopy(f2.getBytes(), 0,bytes,pos ,f2.getBytes().length);
        pos += f2.getBytes().length;
        System.arraycopy(ByteBuffer.allocate(Integer.BYTES).putInt(a).array(), 0, bytes,pos, Integer.BYTES);
        pos += Integer.BYTES;
        System.arraycopy(ByteBuffer.allocate(Integer.BYTES).putInt(s).array(), 0, bytes,pos, Integer.BYTES);
        pos += Integer.BYTES;
        System.arraycopy(ByteBuffer.allocate(Integer.BYTES).putInt(d).array(), 0, bytes,pos, Integer.BYTES);
        return (bytes);
    }
    public void deserialize(byte[] bytes){

        ByteBuffer bb = ByteBuffer.wrap(bytes);
       int size = bb.getInt();
       byte[] bytes1 = new byte[size];
       System.arraycopy(bytes, Integer.BYTES, bytes1, 0, size);
       f = new String(bytes1);
       int pos = size + Integer.BYTES;
       bb.position(pos);
         size = bb.getInt();
         pos += Integer.BYTES;
        bytes1 = new byte[size];
        System.arraycopy(bytes, pos, bytes1, 0, size);
        f1 = new String(bytes1);
        pos += size ;
        bb.position(pos);
        size = bb.getInt();
        pos += Integer.BYTES;
        bytes1 = new byte[size];
        System.arraycopy(bytes, pos, bytes1, 0, size);
        f2 = new String(bytes1);
        pos += size ;
        a = bb.getInt();
        s = bb.getInt();
        d = bb.getInt();



    }

}
