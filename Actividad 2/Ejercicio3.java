//Contar la cantidad de elementos pares en un arreglo de números enteros.

import java.util.Arrays;

public class Ejercicio3 {
    public static void main(String[] args) {
        int[] numeros = { 1, 8, 10, 5, 48, 32, 22, 35, 67, 40, 120, 111, 320 };

        /*
         * Use Streams para contar los números pares, porque usamos Streams, en mi
         * caso porque nos da varias ventajas,
         * especialmente cuando trabajo con colecciones de datos.
         */
        long contadorPares = Arrays.stream(numeros)
                .filter(num -> num % 2 == 0)
                .count();
        System.out.println("La cantidad de numeros pares es: " + contadorPares);
    }
}
