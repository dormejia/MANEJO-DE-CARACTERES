
package editor;
import java.awt.Desktop;
import java.io.*;
public class clsArchivos {
    // crear un archivo si no existe
     public static void escribir(String Narchivo,String contenido){
    File  archivo = new File(Narchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo,true));
            salida.println(contenido);
            salida.close();
        } catch (FileNotFoundException ex) {
          ex.printStackTrace(System.out);
        } catch (IOException ex) {
           ex.printStackTrace(System.out);
        }
    }
     public static void borrar(String Narchivo){
     
     File archivo = new File(Narchivo);
     archivo.delete();
     
     }   
}
