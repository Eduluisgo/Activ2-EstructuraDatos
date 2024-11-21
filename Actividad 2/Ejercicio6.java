// Multiplicar cada elemento de un arreglo de números enteros por un número dado.

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamaño = scanner.nextInt();

        int[] numeros = new int[tamaño];

        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Ingrese el número por el cual multiplicar: ");
        int multiplicador = scanner.nextInt();

        System.out.println("El arreglo multiplicado es:");
        for (int i = 0; i < tamaño; i++) {
            numeros[i] = numeros[i] * multiplicador;
            System.out.print(numeros[i] + " ");
        }
    }
}
