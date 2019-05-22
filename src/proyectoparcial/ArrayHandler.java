
package proyectoparcial;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**@author Miguel Murillo, Johnny Beltrán, Daniel Saigua, Edwin Ullaguari */

public class ArrayHandler {
    
    public ArrayHandler(){
        
    }
    
    //ArrayHandler cuenta el número de líneas de un archivo y lo devuelve
    public static int cuentaLineas(String archivo) throws FileNotFoundException, IOException{
        String cadena = null;
        FileReader f = new FileReader(archivo);
        int i;
        try (BufferedReader b = new BufferedReader(f)) {
            cadena = b.readLine();
            i = 0;
            while(cadena!=null){
                i++;
                cadena = b.readLine();
            }
        }
        return i;
    }
    
    //ArrayHandler abre el archivo de datos y llena el arreglo
    public static void llenaArreglo(int arr[],String archivo) throws FileNotFoundException, IOException{
        int tamaño = arr.length;
        String cadena = null;
        FileReader f = new FileReader(archivo);
        try (BufferedReader b = new BufferedReader(f)) {
            cadena = b.readLine();
            int i = 0;
            while(cadena!=null){
                if(i<tamaño){
                    arr[i]=Integer.parseInt(cadena);
                    cadena = b.readLine();
                    i++;
                }
                else
                    break;
            }
        }
    }
          
    //ArrayHandler imprime el arreglo ya ordenado en la consola
    public static void imprimeArreglo(int arr[]){
        int i;
        System.out.println("El arreglo ordenado es: ");
        for(i=0;i<arr.length-1;i++){
            System.out.print(arr[i] + ",");
        }
        System.out.println(arr[i]);
    }

    //ArrayHandler crea un archivo y lo llena con numeros aleatorios
    public static void escrituraArchivo(int numerodato)
    {
        try(BufferedWriter outputStream = new BufferedWriter(new FileWriter("datosgenerados.txt"))) 
        {
            
            Random aleatorio = new Random(System.nanoTime()); //Toma el tiempo en nanosegundos
            for (int count = 1; count <= numerodato; count++)
            {
                
                
                int intAletorio = aleatorio.nextInt(1000);
                System.out.println(intAletorio);
                String numero = Integer.toString(intAletorio);
                
                outputStream.write(numero);
                outputStream.newLine();
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error al abrir el archivo "+ e.getMessage());
        }
        catch(IOException e){
            System.out.println("IOException."+ e.getMessage());
        }
    }
 

}

    
   





