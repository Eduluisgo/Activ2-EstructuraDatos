
//Calcular la media de los elementos de un arreglo de números enteros.

public class Ejercicio1 {
    public static void main(String[] args) {

        int[] numerosEnteros = { 5, 21, 10, 35, 20 };
        // comenzamos con un valor inicial de 0 para la suma.
        int suma = 0;
        // recorremos uno a uno los números de la lista y los va colocando a la suma
        for (int numero : numerosEnteros) {
            suma += numero;
        }

        double media = (double) suma / numerosEnteros.length;
        System.out.println("La media de los elementos es: " + media);
    }
}