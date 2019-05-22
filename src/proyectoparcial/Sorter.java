
package proyectoparcial;

/**@author Miguel Murillo, Johnny Beltrán, Daniel Saigua, Edwin Ullaguari */

public class Sorter {
    
    public Sorter(){
        
    }
      
    //El Sorter ordena a través del Insertion Sort
    public static long insertionSort(int[] arr){ //Implementacion obtenida de https://www.geeksforgeeks.org/insertion-sort/
        System.out.println("Ordenaremos el arreglo a través de Insertion Sort");
        long instanteInicial = System.nanoTime(); //Toma el tiempo actual en nanosegundos
        int n = arr.length; 
        for (int i=1; i<n; ++i){ 
            int key = arr[i]; 
            int j = i-1; 

            while (j>=0 && arr[j] > key){ 
                arr[j+1] = arr[j]; 
                j = j-1; 
            } 
            arr[j+1] = key; 
        }
        long instanteFinal = System.nanoTime(); //Toma el tiempo actual en nanosegundos
        long total = instanteFinal-instanteInicial;
        System.out.println("El tiempo de ejecución del Insertion Sort fue de " + total + " nanosegundos");
        System.out.println("Los resultados se muestran a continuación:");
        return total;
    } 
    
    //El Sorter ordena a través del Merge Sort
    public static void mergeSort(int arr[], int l, int r){ //Implementacion obtenida de https://www.geeksforgeeks.org/merge-sort/
        if (l < r){
            int m = (l+r)/2; 
  
            mergeSort(arr, l, m); //Llamada recursiva a la primera mitad
            mergeSort(arr , m+1, r); //Llamada recursiva a la segunda mitad
   
            merge(arr, l, m, r); //Llama a Merge quien Realiza el sort
        }
    } 
    
    //Una vez que se llame al Merge Sort, el mismo método llamará a Merge
    public static void merge(int arr[], int l, int m, int r){ 
        
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
        int i = 0, j = 0; 
  
        int k = l; 
        while (i < n1 && j < n2){ 
            if (L[i] <= R[j]){ 
                arr[k] = L[i]; 
                i++; 
            } 
            else{ 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        while (i < n1){ 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        while (j < n2){ 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    }
    
    //El Sorter ordena a través del Quick Sort
    public static void quickSort(int arr[], int low, int high){ //Implementacion obtenida de https://www.geeksforgeeks.org/quick-sort/
        if (low < high){ 
            int pi = partition(arr, low, high); 
  
            quickSort(arr, low, pi-1); 
            quickSort(arr, pi+1, high); 
        } 
    } 
    
    //Una vez que se llame al Quick Sort, él mismo llamará a Partition
    public static int partition(int arr[], int low, int high){ 
        int pivot = arr[high];  
        int i = (low-1); 
        for (int j=low; j<high; j++){ 
           
            if (arr[j] <= pivot){ 
                i++; 
  
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i + 1;
    } 
  
    //El Sorter ordena a través del Stooge Sort
    public static void stoogeSort(int arr[], int l, int h) //Implementacion obtenida de https://www.geeksforgeeks.org/stooge-sort/
    { 
        if (l >= h) 
            return; 
   
        if (arr[l] > arr[h]) { 
            int t = arr[l]; 
            arr[l] = arr[h]; 
            arr[h] = t; 
        } 
  
        if (h - l + 1 > 2) { 
            int t = (h - l + 1) / 3; 
  
            // Recursivamente ordena los primeros 2/3 elementos 
            stoogeSort(arr, l, h - t); 
  
            // Recursivamente ordena los ultimos 2/3 elementos 
            stoogeSort(arr, l + t, h); 
  
            // Recursivamente ordena los primeros 2/3 elementos 
            stoogeSort(arr, l, h - t); 
        } 
    } 
  
             
}
