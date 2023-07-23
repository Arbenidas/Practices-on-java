package org.example;

public class PracticandoExceptiones {
    public static void main(String[] args) {
/*
Crea una función DividePorCero. Esta, debe generar una excepción ("throws")
 a su llamante del tipo ArithmeticException que será capturada por su llamante
 (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje
 "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo
 de código".
 */

        try {
            System.out.println(DividePorCero(1,0));
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
    static int DividePorCero(int dividendo,int divisor)throws ArithmeticException {
    try {
        return dividendo/divisor;
    }catch (ArithmeticException e){
        throw new ArithmeticException("No se puede dividir entre cero");
    }
    }
}
