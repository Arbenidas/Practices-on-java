package org.example;

public class RecorridoDeUnArrayBidimensional {
    public static void main(String[] args) {
        //Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
        int array[][] = {{1,3,4,23,4,2,1,4,2},{2,3,2,4,21,3,4,2,1}};

        for (int i=0;i<2;i++){
            for (int j = 0; j<9;j++){
                System.out.print(" ["+i+"]["+j+"]="+array[i][j]);
            }
            System.out.println();
        }
    }
}
