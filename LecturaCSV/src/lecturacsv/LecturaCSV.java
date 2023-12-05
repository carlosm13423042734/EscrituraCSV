
package lecturacsv;
import java.io.*;
public class LecturaCSV {

   
    public static void main(String[] args) {
       String archivo = "alumnosNotas.txt";
       int nota1, nota2, nota3;
       double media;
       String alumno, nombre;
       String vector[];
       try {
           //Leemos el archivo 
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            //Mientras que existan líneas va a seguir leyendo el archivo
            while ((alumno = br.readLine()) != null) {    
                //Divide el vector cuando hay ":" para separar cada valor
                vector = alumno.split(":");
                //Coge los valores por orden
                nombre = vector[0];
                //Cogemos las notas como tipo integer
                nota1 = Integer.parseInt(vector[1]);
                nota2 = Integer.parseInt(vector[2]);
                nota3 = Integer.parseInt(vector[3]);
                //Calcula la nota media haciendo la suma de las 3 notas y dividiendolo entre 3
                media = (nota1 + nota2 + nota3) / 3;
                System.out.println(nombre + ":" + media);
            }
            //Si no hay un archivo de entrada te mostrara un error
        } catch (FileNotFoundException e) {
            System.out.println("Error, archivo no encontrado");
            //Coge cualquier otra excepción
        } catch (Exception e) {
            System.out.println("Error");
        }
      
    }
    
}
