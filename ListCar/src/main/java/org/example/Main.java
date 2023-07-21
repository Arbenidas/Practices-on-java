package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creamos un arraylist donde iremos introduciendo los coches
        List<CocheCRUDImpl> coches = new ArrayList<>();
        //Esta bandera es para asegurarnos que el programa siga corriendo
        int bandera = 0;
        //variable Scanner para poder ingresar datos
        Scanner scanner =new Scanner(System.in);

        do {
            //menu del programa
            System.out.println("---------------Menu---------------");
            System.out.println("1-Agregar un coche");
            System.out.println("2-Mostrar los coches");
            System.out.println("3-Eliminar algun coche ");
            System.out.println("4-salir");
            //seleccion del menu
            bandera = Integer.parseInt(scanner.nextLine());
            switch (bandera){
                case 1:
                    System.out.println("PROGRAMA DE ADMINISTRACION DE COCHES");
                    CocheCRUDImpl cocheN = new CocheCRUDImpl();
                    System.out.println("Ingrese el nombre del coche: \n");
                    cocheN.setNombre(scanner.nextLine());
                    System.out.println("Ingrese el modelo del auto: \n");
                    cocheN.setModelo(scanner.nextLine());
                    System.out.println("Ingrese la matricula: \n");
                    cocheN.setMatricula(scanner.nextLine());
                    coches.add(cocheN);
                    System.out.println("El coche se agrego correctamente");
                    break;
                case 2:
                    int j=0;
                    for (CocheCRUDImpl coche: coches){
                        System.out.println("coche #"+(j+1));
                        coche.imprimir(coche);
                        j++;
                    }
                    break;
                case 3:
                    int i =0;
                    for (CocheCRUDImpl coche: coches){
                        System.out.println("coche #"+(i+1));
                        coche.imprimir(coche);
                        i++;
                    }
                    System.out.println("Cual es el Coche a eliminar?");
                    int input = Integer.parseInt(scanner.nextLine());
                    coches.remove(input);
                    System.out.println("El elemento a sido eliminado correctamente");
                    break;
                case 4:
                    System.out.println("Vuelva pronto");
                    bandera =7;
                    break;
            }

        }while (bandera!=7);
    }
}