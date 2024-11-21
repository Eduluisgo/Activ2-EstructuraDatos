//Eliminar elementos impares de un arreglo de números enteros.

import java.util.Arrays;

public class Ejercicio8 {
    public static void main(String[] args) {

        int[] numeros = { 1, 3, 8, 4, 66, 89, 45, 28, 0, 10 };

        int[] resultado = Arrays.stream(numeros)
                .filter(num -> num % 2 == 0)
                .toArray();

        System.out.println("Sin impares: " + Arrays.toString(resultado));
    }
}
