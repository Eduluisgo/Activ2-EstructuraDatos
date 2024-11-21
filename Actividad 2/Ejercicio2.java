//Encontrar el segundo elemento más grande en un arreglo de números enteros.

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] numeros = { 45, 5, 110, 250, 80 };

        if (numeros.length < 2) {
            return;
        }

        // Inicializamos los dos mayores

        int mayor = Math.max(numeros[0], numeros[1]);
        int segundoMayor = Math.min(numeros[0], numeros[1]);

        // Ahora vamos a recorrer con length el arreglo comenzando desde el tercer
        // elemento

        for (int i = 2; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                segundoMayor = mayor;
                mayor = numeros[i];
            } else if (numeros[i] > segundoMayor) {
                segundoMayor = numeros[i];
            }
        }

        System.out.println("El segundo elemento mmas grande es: " + segundoMayor);
    }
}
