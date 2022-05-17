package Ex1N1;
import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[]args) {

        String ruta = "C:\\";
        File file = new File(ruta); //----> se instancia el obj de la clase File y como parametro se pone la ruta del directorio

        String[] listado = file.list(); //----> se crea una lista de array de Strings de la clase File
        Arrays.sort(listado);   //---> se ordena alfabeticamente el listado

        for(String element : listado) {  //------> se recorre la lista para extraer e imprimir cada elemento de ella
            System.out.println(element);
        }
    }
}
