---INFORMACIÓN DEL PROGRAMA---
Este programa es un comparador de tiempos de ejecución desarrollado por Miguel Murillo, Johnny Beltrán, Daniel Saigua y Edwin Ullaguari para los algoritmos:
- Insertion Sort
- Merge Sort
- Quick Sort
- Stooge Sort

El mismo fue desarrollado en el lenguaje JAVA y consta de 4 clases:
- PanelVisual.java el cual es el programa principal, desarrollado con la librería gráfica Swing. En esta clase se maneja el main así como los eventos relacionados a botones de interacción y entrada de texto.
- Sorter.java que contiene los métodos estáticos referentes a los algoritmos, cada método realiza cada uno de los algoritmos de comparación, las implementaciones de estos algoritmos fueron tomadas de la página https://www.geeksforgeeks.org/
- ArrayHandler.java que contiene métodos estáticos referentes a manejo de arrays auxiliares
- ResultsGenerator.java que contiene un método encargado de generar el archivo de resultados, en este archivo está el tiempo empleado por cada algoritmo escogido para arreglos que empiezan con 10 elementos y que aumentan progresivamente de 10 en 10 hasta llegar al número de elementos que el usuario desee. Los tiempos dados están en unidades físicas de nanosegundos.

Para ejecutar el programa se puede utilizar un IDE (por ejemplo NetBeans) y dar click izquierdo en la flechita verde (RUN).
Por otro lado si NO disponde de un IDE o no sabe como utilizar uno, puede usar directamente el ejecutable .JAR, para ello vaya a la carpeta llamada "dist" y abra el ejecutable "ProyectoParcial". Atención a algo muy importante, el ejecutable solo funcionará con archivos de datos que se encuentran en la misma carpeta "dist", caso contrario leerá cualquier otro archivo como si estuviese vacío. Para probar el programa ya le viene en la carpeta "dist" un archivo llamado "datosParaArreglo", aunque usted puede generar otro a través del programa mismo, el cual se guardará en la misma carpeta "dist". Esta consideración solo se toma cuando se ejecuta el .RAR, si trabaja en el IDE puede abrir un archivo ubicado en cualquier localización de su computador.

---DEPENDENCIAS---
Para poder realizar la graficación se utilizó la librería gráfica JFreechart.
La librería tiene varios archivos .JAR, sin embargo solo se usaron dos de ellos, los mismos se encuentran en la carpeta llamada "libreria grafica JFreeChart".
Para poder agregar estos archivos al proyecto, vaya al IDE y haga click derecho sobre el proyecto, luego click en properties. Posteriormente seleccionar "Libraries" y luego "Add JAR/Folder"; una vez hecho esto escoger los dos archivos .JAR de la carpeta "libreria grafica JFreeChart" y agregarlos. Dar click en OK y listo.

---IMPORTANTE---
Para poder trabajar con el programa debe escoger los algoritmos a usar (por defecto vienen todos seleccionados), luego de eso es necesario que escoja un archivo de datos ya existente o generarlo, una vez abierto el archivo se deshabilitarán las opciones de generar archivo y abrir archivo, mientras que la opción de ordenar se habilitará. Ingrese en la casilla de texto un número menor o igual al número de elementos del archivo escogido y de click en ordenar. Una vez terminado el proceso, el programa le preguntará si desea ordenar con un número de datos distintos, si da click en NO el botón de ordenar se inhabilitará y finalmente se habilitará la opción de graficar. De click sobre esta última para que vea las gráficas. Además de esto se generará un archivo llamado resultados.tzt en el cual podrá ver los tiempos de ejecución de los algoritmos escogidos.

---REFERENCIAS ÚTILES PARA EL PROYECTO---
Implementaciones de los algoritmos: https://www.geeksforgeeks.org/

Librería gráfica JFreeChart: http://www.vogella.com/tutorials/JFreeChart/article.html#download
https://pastebin.com/UYj91kXkç
http://www.jfree.org/jfreechart/

Librería Swing: https://www.javatpoint.com/java-swing

Repositorio del proyecto en Bitbucket: https://bitbucket.org/mianmuri1991/proyectoparcialalgoritmos/src/master/
*El repositorio es privado, si desea tener acceso contactar al dueño del mismo: mianmuri@espol.edu.ec

