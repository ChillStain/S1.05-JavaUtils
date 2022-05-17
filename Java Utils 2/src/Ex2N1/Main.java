package Ex2N1;

import java.io.File;
import java.util.Date;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {


        findAtDirectory(new File("C:\\"));  //----> call to the method and as a parameter receives the instance of the obj File with the path

    }

    public static void findAtDirectory(File directory) {
        System.out.println("D: " + directory);   //-----> the directory name is printed
        File[] listado = directory.listFiles();  //-----> the array list of the file class is created
        Arrays.sort(listado);                    //------> the array is sorted
        if (listado!=null) {
            for(File file:listado) {     //----> the list is traversed
                if (file.isDirectory())   //----> if it is a directory (folder), go to find in the directory the folders and files it contains
                    findAtDirectory(file);  //-----> recursion = calling ownself
                else {
                    System.out.println("F: "+file+"***"+new Date(file.lastModified()));  //------> all files are printed with the last modification date
                }
            }
        }else {
            System.out.println("F: "+directory);
        }
    }

}