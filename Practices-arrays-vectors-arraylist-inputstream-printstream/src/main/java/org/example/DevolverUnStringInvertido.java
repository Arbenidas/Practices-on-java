package org.example;

public class DevolverUnStringInvertido {
    public static void main(String[] args) {
        //Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
        System.out.println(reverse("hola mundo"));
    }
    public static String reverse(String texto) {
        //definimos un array con la longitud del texto
        String invertida = "";
        //bucle donde itera los elemento de forma inversa y muestra los elementos
        for (int i =texto.length()-1;i >=0; i--) {
            invertida += String.valueOf(texto.charAt(i));
        }
        return invertida;
    }

}