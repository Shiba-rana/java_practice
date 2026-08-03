import java.io.File;
import java.io.*;

public class FileInfo {

    public static void main(String args[]) {
        File f =new File("C:\\Users\\silur\\OneDrive\\Documents\\File\\Shiva.text");


            if(f.exists()) {
                
                System.out.print("\n\tFile Name :"+f.getName());
                System.out.print("\n\tFile Location :"+f.getAbsolutePath());
                System.out.print("\n\tFile Writable :"+f.canWrite());
                System.out.print("\n\tFile Readable :"+f.canRead());
                System.out.print("\n\tFile Size :"+f.length());
            }
            else {
                System.out.print("File Doesn't Exist.");
            }

    }
}
