package Ex5N1;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[]args) throws IOException {
        String [] names = {"Charlie","Sean","Lusso"};
        int [] age = null;

        try {
            String archive = "trySerializable.txt"; //----> a file is created that will collect data
            FileOutputStream file = new FileOutputStream(archive); //--->creates a file unless it exists and is read-only
            ObjectOutputStream f = new ObjectOutputStream(file);  // ---> An ObjectOutputStream object is created from a FileOutputStream object associated with the file.
            f.writeObject(names); // --->
            f.close();  // --->

        }
        catch (Exception e) {
            e.getMessage();
        }


        try {
            String archive = "trySerializable.txt"; // ---> the file is collected at the root
            FileInputStream arch = new FileInputStream(archive) ;
            ObjectInputStream a = new ObjectInputStream(arch) ;

            age = (int[]) a.readObject(); // ---> the data is taken from the file and added to the new age variable
            System.out.println(age);
            a.close();
            arch.close();

        }
        catch (Exception e) {
            e.getMessage();
        }
    }
}