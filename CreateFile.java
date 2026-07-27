import java.io.*;
public class CreateFile {
    public static void main(String args[]) {
        File f =new File("C:\\Users\\silur\\OneDrive\\Documents\\File\\Shiva.text");
        try {
            if (f.createNewFile()) {
                System.out.print("File Successfully Created.");
            } else {
                System.out.print("Already Exits.");
            }
        }
            catch(IOException i){
                System.out.print("Shiva");
            }


    }
}
