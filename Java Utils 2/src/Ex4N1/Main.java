package Ex4N1;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {

        File fl = new File("Test_1.txt");  //---> the obj of the File class is created and the name of the txt file that we want to open is passed through parameter
        FileReader fr = new FileReader(fl);  //---> the obj of the filereader class is created looks for the file where it is prompted
        BufferedReader br = new BufferedReader(fr);   //---> the obj of the bufferedreader class is created that is used to read the entry of a file
        String line = br.readLine();   //---> through the buffer, the .readLine() function is used to read a single line of text from the console
        System.out.println();

        while(line != null) {           //----> if the line is not null it enters the while
            System.out.println(line);   //---> prints each line of the file
            line = br.readLine();      //---> .readLine() used to read a single line of text from the console
        }

        br.close();     //---> is to close the buffer.


    }
}