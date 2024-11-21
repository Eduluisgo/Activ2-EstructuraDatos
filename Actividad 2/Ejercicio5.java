//Verificar si un arreglo de números enteros está ordenado de manera ascendente.

public class Ejercicio5 {
    public static void main(String[] args) {

        int[] numeros = { 1, 2, 3, 4, 5 };

        boolean estaOrdenado = true;

        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] > numeros[i + 1]) {
                estaOrdenado = false;
                break;
            }
        }

        if (estaOrdenado) {
            System.out.println("Esta ordenado de manera ascendente.");
        } else {
            System.out.println("No esta ordenado de manera ascendente.");
        }
    }
}
