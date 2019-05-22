
package proyectoparcial;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**@author Miguel Murillo, Johnny Beltrán, Daniel Saigua, Edwin Ullaguari */

public class ResultsGenerator {
    
    public ResultsGenerator(){ //Método constructor de ResultsGenerator
        
    }
    
    /*Este método escribe en el archivo resultados.txt el número de elementos de cada arreglo y los tiempos
    tomados por cada algoritmo para cada uno de esos tiempos*/
    public static void generaResultados(int tamaño, int[] tama, long[] insertion, long[] merge, long[] quick, long[] stooge){
        try(BufferedWriter outputStream = new BufferedWriter(new FileWriter("resultados.txt"))) 
        {
            outputStream.write("Numero de datos: "); //Escribe el número de datos
            String tam = Integer.toString(tamaño); //Casting de integer a String
            outputStream.write(tam); //Escribe el tamaño
            outputStream.newLine();// GENERA UNA NUEVA LINEA
            outputStream.write("Los resultados están dados en nanosegundos");
            outputStream.newLine(); //Genera una nueva línea
            
            //outputStream.write("n");
            outputStream.write("\t");//INGRESA EN LA LINEA DE TEXTO UN TAB
            outputStream.write("Insertion Sort");
            outputStream.write("   ");
            outputStream.write("Merge Sort");
            outputStream.write("      ");
            outputStream.write("Quick Sort");
            outputStream.write("      ");
            outputStream.write("Stooge Sort");
            outputStream.newLine(); // GENERA UNA NUEVA LINEA
            
            for(int i=0;i<tama.length;i++){ //Los tab sirven para alinear el documento resultados.txt
                
                outputStream.write(Integer.toString(tama[i]));
                if(tama[i]>999){ //Si son mayores a 999 aplica un solo TAB aquí
                    outputStream.write("\t"); //INGRESA EN LA LINEA DE TEXTO UN TAB
                }
                else{
                    outputStream.write("\t");//INGRESA EN LA LINEA DE TEXTO UN TAB
                    outputStream.write("\t");//INGRESA EN LA LINEA DE TEXTO UN TAB
                }
                    
                    try{//ANALIZÁ EXCEPTION EN CASO NO ESCOGER EL ORDENAMIENTO POR INSERTION Y ESCRIBE UN TIEMPO DE 0000 EN EL ARCHIVO DE RESULTADO
                        outputStream.write(Long.toString(insertion[i]));
                    }catch (java.lang.NullPointerException e){
                        outputStream.write("0000");
                    }
                    
                    outputStream.write("\t");//INGRESA EN LA LINEA DE TEXTO UN TAB
                    outputStream.write("\t");//INGRESA EN LA LINEA DE TEXTO UN TAB
                    outputStream.write("\t");//INGRESA EN LA LINEA DE TEXTO UN TAB
                    try{//ANALIZÁ EXCEPTION EN CASO NO ESCOGER EL ORDENAMIENTO POR MERGE Y ESCRIBE UN TIEMPO DE 0000 EN EL ARCHIVO DE RESULTADO
                        outputStream.write(Long.toString(merge[i]));
                    }catch (java.lang.NullPointerException e){
                        outputStream.write("0000");
                    }
                    
                    outputStream.write("\t");//INGRESA EN LA LINEA DE TEXTO UN TAB
                    outputStream.write("\t");//INGRESA EN LA LINEA DE TEXTO UN TAB
                    outputStream.write("\t");//INGRESA EN LA LINEA DE TEXTO UN TAB
                    try{//ANALIZÁ EXCEPTION EN CASO NO ESCOGER EL ORDENAMIENTO POR QUICK Y ESCRIBE UN TIEMPO DE 0000 EN EL ARCHIVO DE RESULTADO
                        outputStream.write(Long.toString(quick[i]));
                    }catch (java.lang.NullPointerException e){
                        outputStream.write("0000");
                    }
                    
                    outputStream.write("\t");//INGRESA EN LA LINEA DE TEXTO UN TAB
                    outputStream.write("\t");//INGRESA EN LA LINEA DE TEXTO UN TAB
                    outputStream.write("\t");//INGRESA EN LA LINEA DE TEXTO UN TAB
                    try{//ANALIZÁ EXCEPTION EN CASO NO ESCOGER EL ORDENAMIENTO POR STOOGE Y ESCRIBE UN TIEMPO DE 0000 EN EL ARCHIVO DE RESULTADO
                        outputStream.write(Long.toString(stooge[i]));
                    }catch (java.lang.NullPointerException e){
                        outputStream.write("0000");
                    }
                    
                    outputStream.newLine();// GENERA UNA NUEVA LINEA
                }
            }            
        catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage() + "Error al abrir el archivo ");
        }
        catch(IOException e){
            System.out.println("IOException."+ e.getMessage());
        }
    }
    
}
