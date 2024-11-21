//Encontrar la posición de un elemento dado en un arreglo de números enteros.

public class Ejercicio7 {
    public static void main(String[] args) {

        int[] numeros = { 2, 4, 6, 8, 10 };

        int elementoB = 10;

        int posicion = -1;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == elementoB) {
                posicion = i;
                break;
            }
        }

        if (posicion != -1) {
            System.out.println("El elemento " + elementoB + " se encuentra en la posición: " + posicion);
        } else {
            System.out.println("El elemento " + elementoB + " no se encuentra en el arreglo.");
        }
    }
}
