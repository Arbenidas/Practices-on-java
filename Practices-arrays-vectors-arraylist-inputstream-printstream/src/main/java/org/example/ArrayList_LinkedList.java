package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList_LinkedList {
    public static void main(String[] args) {
        /*Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
        Recorre ambos mostrando únicamente el valor de cada elemento.
         */
        //Creamos el arraylist y agregamos datos
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("pepe");
        arrayList.add("marlon");
        arrayList.add("juan");
        arrayList.add("pedro");
        //creamos una linked list y le pasamos un arraylist para que copie
        //exactamente hacia la linkedlist
        LinkedList<String> linkedList = new LinkedList<>(arrayList);

        System.out.println("elementos del arraylist : "+arrayList);
        System.out.println("elementos del Linkedlist : "+linkedList);
    }

}
