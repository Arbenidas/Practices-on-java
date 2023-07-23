package org.example;

import java.util.ArrayList;

public class ArrayListBucle {
    public static void main(String[] args) {
        /*Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo
         con elementos 1..10. A continuación, con otro bucle, recórrelo y
         elimina los numeros pares. Por último, vuelve a recorrerlo y muestra
          el ArrayList final. Si te atreves, puedes hacerlo en menos pasos,
          siempre y cuando cumplas el primer "for" de relleno.
         */
        ArrayList<Integer> arrayEntero =new ArrayList<>();
        for (int i =1; i<11;i++){
            arrayEntero.add(i);
        }

        System.out.println("array lleno : "+arrayEntero);
        for (int i =0; i<6;i++){
            if (arrayEntero.get(i)%2 ==0){
                arrayEntero.remove(i);
            }
        }
        System.out.println("array sin pares: "+arrayEntero);
    }
}
