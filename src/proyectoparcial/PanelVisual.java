
package proyectoparcial;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

//Parte de graficación
import java.awt.BasicStroke;
import java.awt.Color;
import javax.swing.JFrame;

//Librería para graficación (JFreeChart)
/*http://www.vogella.com/tutorials/JFreeChart/article.html#download
https://pastebin.com/UYj91kXkç
http://www.jfree.org/jfreechart/*/
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**@author Miguel Murillo, Johnny Beltrán, Daniel Saigua, Edwin Ullaguari */

public class PanelVisual extends javax.swing.JFrame { //PanelVisual hereda de la biblioteca Swing

    int n; //Número de datos que el usuario quiere poner en el arreglo
    int m; //Número de datos en el archivo
    int[] arregloI = null; //Arreglo para Insertion Sort
    int[] arregloM = null; //Arreglo para Merge Sort
    int[] arregloQ = null; //Arreglo para Quick Sort
    int[] arregloS = null; //Arreglo para Stooge Sort
    File archivo = null; //Archivo de datos con el cual se trabajara
    long instanteInicial;
    long instanteFinal;
    XYSeries funcionInsertionSort = new XYSeries("Insertion Sort"); //Grafica de Insertion Sort
    XYSeries funcionMergeSort = new XYSeries("Merge Sort"); //Grafica de Merge Sort
    XYSeries funcionQuickSort = new XYSeries("Quick Sort"); //Grafica de Quick Sort
    XYSeries funcionStoogeSort = new XYSeries("Stooge Sort"); //Grafica de Stooge Sort
    //Arrays de tiempos de ejecucion para cada algoritmo
    int[] tamaños = null; //Tamaños de los datos probados
    long[] tiempoI = null;
    long[] tiempoM = null;
    long[] tiempoQ = null;
    long[] tiempoS = null;
      
    public PanelVisual() { //Metodo constructor del PanelVisual
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkInsertionSort = new javax.swing.JCheckBox();
        labelTitulo = new javax.swing.JLabel();
        checkMergeSort = new javax.swing.JCheckBox();
        checkQuickSort = new javax.swing.JCheckBox();
        textNumElem = new javax.swing.JLabel();
        numElementos = new javax.swing.JTextField();
        ordenar = new javax.swing.JButton();
        abreFile = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        checkStoogeSort = new javax.swing.JCheckBox();
        graficar = new javax.swing.JButton();
        aboutUs = new javax.swing.JButton();
        generaDatos = new javax.swing.JButton();
        procesandoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 51));
        setResizable(false);

        checkInsertionSort.setForeground(new java.awt.Color(255, 0, 0));
        checkInsertionSort.setSelected(true);
        checkInsertionSort.setText("Insertion Sort");
        checkInsertionSort.setToolTipText("");
        checkInsertionSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInsertionSortActionPerformed(evt);
            }
        });

        labelTitulo.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 0, 0));
        labelTitulo.setText("Comparación de Algoritmos de Ordenamiento");

        checkMergeSort.setForeground(new java.awt.Color(0, 0, 204));
        checkMergeSort.setSelected(true);
        checkMergeSort.setText("Merge Sort");

        checkQuickSort.setForeground(new java.awt.Color(204, 0, 153));
        checkQuickSort.setSelected(true);
        checkQuickSort.setText("Quick Sort");

        textNumElem.setText("Escoja el número máximo de elementos que desea colocar en el arreglo:");

        numElementos.setEditable(false);
        numElementos.setName(""); // NOI18N
        numElementos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numElementosActionPerformed(evt);
            }
        });

        ordenar.setText("Ordenar");
        ordenar.setEnabled(false);
        ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarActionPerformed(evt);
            }
        });

        abreFile.setText("Abrir archivo");
        abreFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abreFileActionPerformed(evt);
            }
        });// comentario de prueba.....

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        checkStoogeSort.setForeground(new java.awt.Color(51, 51, 51));
        checkStoogeSort.setSelected(true);
        checkStoogeSort.setText("Stooge Sort");

        graficar.setText("Graficar");
        graficar.setEnabled(false);
        graficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graficarActionPerformed(evt);
            }
        });

        aboutUs.setText("Acerca de");
        aboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutUsActionPerformed(evt);
            }
        });

        generaDatos.setText("Generar datos");
        generaDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generaDatosActionPerformed(evt);
            }
        });

        procesandoLabel.setFont(new java.awt.Font("Cooper Black", 1, 18)); // NOI18N
        procesandoLabel.setForeground(new java.awt.Color(204, 0, 0));
        procesandoLabel.setText("ORDENANDO...");

        procesandoLabel.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(generaDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(abreFile)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ordenar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(graficar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(checkQuickSort, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textNumElem))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(aboutUs)
                                .addGap(7, 7, 7)
                                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(checkStoogeSort, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(numElementos, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(checkInsertionSort, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(checkMergeSort, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(procesandoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(labelTitulo)
                .addGap(29, 29, 29)
                .addComponent(procesandoLabel)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkMergeSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkQuickSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkStoogeSort)
                    .addComponent(checkInsertionSort, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNumElem)
                    .addComponent(numElementos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ordenar)
                    .addComponent(abreFile)
                    .addComponent(salir)
                    .addComponent(graficar)
                    .addComponent(aboutUs)
                    .addComponent(generaDatos))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkInsertionSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInsertionSortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkInsertionSortActionPerformed

    private void numElementosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numElementosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numElementosActionPerformed

    private void ordenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarActionPerformed
        //Valida si almenos un checkbox esta activo
        if(checkInsertionSort.isSelected()==false && checkQuickSort.isSelected()==false && checkMergeSort.isSelected()==false && checkStoogeSort.isSelected()==false){
            JOptionPane.showMessageDialog(this,"¡No ha escogido ningun algoritmo de ordenamiento!","Error",JOptionPane.ERROR_MESSAGE);
        }
        else{ 
            //Crea los arreglos con el número de elementos y los llena
            try{ //Atrapa la excepción si es que el cuadro de texto está en blanco
                n = Integer.parseInt(numElementos.getText()); //Guarda el numero de elementos
                                                          //que el usuario quiere usar en la variable n
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(this, "La información en el cuadro de texto está ausente o no es numérica", "Error",JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(n>m){ //Validando que el valor de n no exceda al valor de m
                //this pasa la referencia del padre o sea el JFrame
                JOptionPane.showMessageDialog(this, "El número de datos excede al de los datos en el archivo","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                procesandoLabel.setVisible(true);
                //this pasa la referencia del padre o sea el JFrame
                JOptionPane.showMessageDialog(this, "Se procederá a realizar los ordenamientos con los algoritmos","Ordenamiento",JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(this, "El ordenamiento se realizará iniciando con diez elementos, e incrementando cada vez su tamaño en diez hasta llegar al valor final de " + n + ".","Crecimiento del arreglo",JOptionPane.INFORMATION_MESSAGE);
                int tamano_arreglos_de_tiempo = n/10; //Este es el tamaño de los arreglos de tiempo para los algoritmos
                //Ordenamiento en progreso
                tamaños = new int[tamano_arreglos_de_tiempo]; //Generando y llenando array de tamaños de datos
                    for(int i=0;i<tamano_arreglos_de_tiempo;i++){
                        tamaños[i]=0;
                    }
                
                //A continuación se llenan los arreglos y se ejecutan los algoritmos para aquellos que esten activos
                if(checkInsertionSort.isSelected()==true){
                    tiempoI = new long[tamano_arreglos_de_tiempo];
                    for(int i=0;i<tamano_arreglos_de_tiempo;i++){
                        tiempoI[i]=0;
                    }
                    int k = 0; //Contador de arreglo de tiempo
                    for(int i=10;i<=n;i+=10){
                        arregloI = new int[i]; //Arreglo para Insertion Sort
                        try {
                        ArrayHandler.llenaArreglo(arregloI,archivo.getName());
                        } catch (IOException ex) {
                            Logger.getLogger(PanelVisual.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        long totalI = Sorter.insertionSort(arregloI);      
                        ArrayHandler.imprimeArreglo(arregloI);
                    
                        //Agregando tiempo al arreglo de tiempo
                        tiempoI[k]=totalI;
                        tamaños[k]=i; //Ineficiente pero necesario
                        k++;
                        
                        //Agregando coordenadas a la gráfica de Insertion Sort
                        funcionInsertionSort.add(i, totalI);
                                         
                        arregloI = null;
                    }
                }
            
                if(checkMergeSort.isSelected()==true){
                    tiempoM = new long[tamano_arreglos_de_tiempo];
                    for(int i=0;i<tamano_arreglos_de_tiempo;i++){
                        tiempoM[i]=0;
                    }
                    int k = 0; //Contador de arreglo de tiempo
                    for(int i=10;i<=n;i+=10){
                        arregloM = new int[i]; //Arreglo para Merge Sort
                        try {
                        ArrayHandler.llenaArreglo(arregloM,archivo.getName());
                        } catch (IOException ex) {
                            Logger.getLogger(PanelVisual.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println("\n");
                        System.out.println("Ordenaremos el arreglo a través de Merge Sort");
                        instanteInicial = System.nanoTime();
                        Sorter.mergeSort(arregloM, 0, i-1);
                        instanteFinal = System.nanoTime();
                        long totalM = instanteFinal-instanteInicial;
                        System.out.println("El tiempo de ejecución del Merge Sort fue de " + totalM + " nanosegundos");
                        System.out.println("Los resultados se muestran a continuación:");
                        ArrayHandler.imprimeArreglo(arregloM);
                    
                        //Agregando tiempo al arreglo de tiempo
                        tiempoM[k]=totalM;
                        tamaños[k]=i; //Ineficiente pero necesario
                        k++;
                        
                        //Agregando coordenadas a la gráfica de Merge Sort
                        funcionMergeSort.add(i, totalM);
                           
                        arregloM = null;
                    }
                    
                }
            
                if(checkQuickSort.isSelected()==true){
                    tiempoQ = new long[tamano_arreglos_de_tiempo];
                    for(int i=0;i<tamano_arreglos_de_tiempo;i++){
                        tiempoQ[i]=0;
                    }
                    int k = 0; //Contador de arreglo de tiempo
                    for(int i=10;i<=n;i+=10){
                        arregloQ = new int[i]; //Arreglo para Quick Sort          
                        try {
                            ArrayHandler.llenaArreglo(arregloQ,archivo.getName());
                        } catch (IOException ex) {
                            Logger.getLogger(PanelVisual.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println("\n");
                        System.out.println("Ordenaremos el arreglo a través de Quick Sort");
                        instanteInicial = System.nanoTime();
                        Sorter.quickSort(arregloQ, 0, i-1);
                        instanteFinal = System.nanoTime();
                        long totalQ = instanteFinal-instanteInicial;
                        System.out.println("El tiempo de ejecución del Quick Sort fue de " + totalQ + " nanosegundos");
                        System.out.println("Los resultados se muestran a continuación:");
                        ArrayHandler.imprimeArreglo(arregloQ);
                    
                        //Agregando tiempo al arreglo de tiempo
                        tiempoQ[k]=totalQ;
                        tamaños[k]=i; //Ineficiente pero necesario
                        k++;
                        
                        //Agregando coordenadas a la gráfica de Quick Sort
                        funcionQuickSort.add(i, totalQ);
       
                        arregloQ = null;
                    }
                }       
          
                if(checkStoogeSort.isSelected()==true){ 
                    tiempoS = new long[tamano_arreglos_de_tiempo];
                    for(int i=0;i<tamano_arreglos_de_tiempo;i++){
                        tiempoS[i]=0;
                    }
                    int k = 0; //Contador de arreglo de tiempo
                    for(int i=10;i<=n;i+=10){
                        arregloS = new int[i]; //Arreglo para Stooge Sort
                        try {
                            ArrayHandler.llenaArreglo(arregloS,archivo.getName());
                        } catch (IOException ex) {
                            Logger.getLogger(PanelVisual.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        System.out.println("\n");
                        System.out.println("Ordenaremos el arreglo a través de Stooge Sort");
                        instanteInicial = System.nanoTime();
                        Sorter.stoogeSort(arregloS, 0, i-1);
                        instanteFinal = System.nanoTime();
                        long totalS = instanteFinal-instanteInicial;
                        System.out.println("El tiempo de ejecución del Stooge Sort fue de " + totalS + " nanosegundos");
                        System.out.println("Los resultados se muestran a continuación:");
                        ArrayHandler.imprimeArreglo(arregloS);
                    
                        //Agregando tiempo al arreglo de tiempo
                        tiempoS[k]=totalS;
                        tamaños[k]=i; //Ineficiente pero necesario
                        k++;
                        
                        //Agregando coordenadas a la gráfica de Stooge Sort
                        funcionStoogeSort.add(i, totalS);
                   
                        arregloS = null;
                    }
                }
                
                ResultsGenerator.generaResultados(n,tamaños,tiempoI,tiempoM,tiempoQ,tiempoS);
                procesandoLabel.setText("¡FINALIZADO!");
                
                //Verifica si el usuario quiere seguir ordenando con un número de datos distintos
                int botonDialog = JOptionPane.YES_NO_OPTION; //Creando botones de opcion
                int resultadoDialog = JOptionPane.showConfirmDialog(null, "¿Desea realizar el ordenamiento con un número de datos distinto a " + n + "?","Confirmación",botonDialog); //Metiendo botones a ventana de mensaje
                if(resultadoDialog == JOptionPane.NO_OPTION){ //Validando boton escogido
                    ordenar.setEnabled(false);
                    graficar.setEnabled(true);
                    checkInsertionSort.setEnabled(false);
                    checkMergeSort.setEnabled(false);
                    checkQuickSort.setEnabled(false);
                    checkStoogeSort.setEnabled(false);
                    numElementos.setText("");
                    numElementos.setEnabled(false);
                }
                else{
                    numElementos.setText("");
                    checkInsertionSort.setEnabled(false);
                    checkMergeSort.setEnabled(false);
                    checkQuickSort.setEnabled(false);
                    checkStoogeSort.setEnabled(false);
                    procesandoLabel.setText("ORDENANDO...");
                    procesandoLabel.setVisible(false);
                }
                
            }
        }
       
        
    }//GEN-LAST:event_ordenarActionPerformed

    private void abreFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abreFileActionPerformed
        JOptionPane.showMessageDialog(this, "Por favor, escoja un archivo para trabajar", "Escoger archivo",JOptionPane.INFORMATION_MESSAGE);
        // Muestra el cuadro de diálogo de archivos, para que el usuario pueda elegir el archivo a abrir

        JFileChooser selectorDeArchivo = new JFileChooser();
        selectorDeArchivo.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int resultado = selectorDeArchivo.showOpenDialog(this);// Indica cual fue la accion de usuario sobre el jfilechooser
        archivo = selectorDeArchivo.getSelectedFile(); // Se obtiene el archivo seleccionado
        // Validación de archivo inválido
         if ((archivo == null) || (archivo.getName().equals("")) || (archivo.isFile()==false)) {
            JOptionPane.showMessageDialog(this, "Necesita escoger un archivo válido", "Error", JOptionPane.ERROR_MESSAGE);
         }
        //Cuenta el número de líneas del archivo y lo guarda en la variable m
        else{
            try { //Atrapa la excepción
                m = ArrayHandler.cuentaLineas(archivo.getName());
            } catch (IOException ex) {
                Logger.getLogger(PanelVisual.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(m<10){
                JOptionPane.showMessageDialog(this,"Este archivo tiene menos de 10 elementos","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
            ordenar.setEnabled(true);
            JOptionPane.showMessageDialog(this, "¡Usted ha seleccionado correctamente el archivo con el cual trabajará!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(this, "Usted ha seleccionado un archivo de " + m + " elementos","Número de elementos del archivo",JOptionPane.INFORMATION_MESSAGE);
            abreFile.setEnabled(false); 
            generaDatos.setEnabled(false);
            numElementos.setEditable(true);
            }
        }
    }//GEN-LAST:event_abreFileActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        JOptionPane.showMessageDialog(this,"¡Hasta pronto!", "Programa terminado",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void graficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graficarActionPerformed
        
        XYSeriesCollection dataset = new XYSeriesCollection();
        
        JFreeChart xylineChart = ChartFactory.createXYLineChart("Funciones de tiempo para los algoritmos de ordenamiento",
        "Tamaño del arreglo (en números enteros)","Tiempo de ejecución (en nanosegundos)",dataset,PlotOrientation.VERTICAL, true, true, false);
 
        XYPlot plot = xylineChart.getXYPlot();
                
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        
        if(checkInsertionSort.isSelected()==true){  
            dataset.addSeries(funcionInsertionSort);
            renderer.setSeriesPaint(0, Color.RED);
            renderer.setSeriesStroke(0, new BasicStroke(4.0f));
        }
    
        if(checkMergeSort.isSelected()==true){  
            dataset.addSeries(funcionMergeSort);
            renderer.setSeriesPaint(1, Color.BLUE);
            renderer.setSeriesStroke(0, new BasicStroke(3.0f));
        }
                
        if(checkQuickSort.isSelected()==true){  
            dataset.addSeries(funcionQuickSort);
            renderer.setSeriesPaint(2, Color.MAGENTA);
            renderer.setSeriesStroke(0, new BasicStroke(2.0f));
        }
                
        if(checkStoogeSort.isSelected()==true){  
            dataset.addSeries(funcionStoogeSort);
            renderer.setSeriesPaint(3, Color.DARK_GRAY);
            renderer.setSeriesStroke(0, new BasicStroke(1.0f));
        }
        
        plot.setRenderer(renderer);
        plot.setBackgroundPaint(Color.CYAN); //Color de fondo de la función graficada
               
        ChartPanel panel = new ChartPanel(xylineChart);
 
        // Creamos la ventana
        JFrame ventana = new JFrame("Gráficas de tiempos de ejecución");
        ventana.setVisible(true);
        ventana.setSize(800, 600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        ventana.add(panel);
        
        ventana.setLocationRelativeTo(null);

        this.setVisible(false); //Haciendo que la ventana PADRE se haga invisible
        
    }//GEN-LAST:event_graficarActionPerformed

    private void aboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutUsActionPerformed
        JOptionPane.showMessageDialog(this, "Esta aplicación fue desarrollada por: \n"
                + "- Miguel Murillo\n" + "- Daniel Saigua\n" + "- Edwin Ullaguari\n" + "- Johnny Beltrán\n"
                + "Análisis de Algoritmos - 2018-2S","Acerca de la aplicación",JOptionPane.INFORMATION_MESSAGE);
        aboutUs.setEnabled(false);
    }//GEN-LAST:event_aboutUsActionPerformed

    private void generaDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generaDatosActionPerformed
       
       int dato=0;
       String respuesta = JOptionPane.showInputDialog(this,"¿Cuántos datos desea que tenga su archivo?","Generar datos",JOptionPane.INFORMATION_MESSAGE); //ventana para elegir cuantos numeros aleatorios quiero en el archivo que voy a crear
       try{
            dato=Integer.parseInt(respuesta); //Convierte de String a int el número que se ingresó en la ventana.
       }
       catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this,"No ha colocado un número de datos válido", "¡Error!",JOptionPane.ERROR_MESSAGE);
            return;
       }
       ArrayHandler.escrituraArchivo(dato); // Se llama a la función para escribir numeros aleatorios en el archivo creado
       JOptionPane.showMessageDialog(this,"Se ha creado el archivo con " + dato + " datos", "¡Éxito!",JOptionPane.INFORMATION_MESSAGE);
            
    }//GEN-LAST:event_generaDatosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PanelVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                PanelVisual panel = new PanelVisual(); //PanelVisual hereda de JFRAME
                panel.setVisible(true);
                panel.setTitle("Algoritmos de Ordenamiento");
                panel.setLocationRelativeTo(null);
            }
        });
        
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutUs;
    private javax.swing.JButton abreFile;
    private javax.swing.JCheckBox checkInsertionSort;
    private javax.swing.JCheckBox checkMergeSort;
    private javax.swing.JCheckBox checkQuickSort;
    private javax.swing.JCheckBox checkStoogeSort;
    private javax.swing.JButton generaDatos;
    private javax.swing.JButton graficar;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField numElementos;
    private javax.swing.JButton ordenar;
    private javax.swing.JLabel procesandoLabel;
    private javax.swing.JButton salir;
    private javax.swing.JLabel textNumElem;
    // End of variables declaration//GEN-END:variables
}
