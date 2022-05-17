package Ex3N1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Arrays;


public class Main {

    public static void main(String[]args) throws IOException {
        FileWriter fw = new FileWriter("Test_1.txt");   //---> the obj of the filewriter class is created to create a txt
        PrintWriter pw = new PrintWriter(fw);           //---> that txt is printed

        findAtDirectory(new File("C:\\"),pw);  //---> the method is called and as a parameter the obj File is created with the path and second parameter the PrintWriter
    }

    public static void findAtDirectory(File directory,PrintWriter pw) throws IOException {
        System.out.println("D: " + directory);
        File[] listado = directory.listFiles();
        Arrays.sort(listado);
        if (listado!=null) {
            for(File file:listado) {
                if (file.isDirectory())
                    findAtDirectory(file,pw);
                else {
                    pw.println("F: "+file+"***"+new Date(file.lastModified())); //---> the names of the files of the chosen path and the date of the last modification are printed in the txt
                    System.out.println("F: "+file+"***"+new Date(file.lastModified()));
                }
            }
        }else {
            pw.println("F "+directory);  //-----> the names of the folders of the chosen path are printed in the txt
            System.out.println("F: "+directory);
        }
    }

}