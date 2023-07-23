package org.example;

import java.util.Scanner;
import java.util.Vector;

public class RecorridoDeUnVector {
    public static void main(String[] args) {
        //Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
        Scanner scanner = new Scanner(System.in);
        Vector <String> vector = new Vector<>();
        //pedimos por consola los datos
      for(int i =0; i<5;i++){
          System.out.println("Ingresa un nombre: ");
          String dato = scanner.nextLine();
          //ingresamos lo datos al vector
          add(dato,vector);
      }
      //Muestra los datos ingresados inicialmente
        System.out.println("datos ingresados: ");
        print(vector);
        //muestra las alteraciones al vector
        System.out.println("Eliminando los datos 2 y 3 del vector");
        vector.remove(1);
        vector.remove(1);
        print(vector);

    }
    static void add(String dato, Vector vector){
        vector.add(dato);
    }
    static void print(Vector vector){
        for (Object vector1: vector){
            System.out.println(vector1);
        }
    }
}
