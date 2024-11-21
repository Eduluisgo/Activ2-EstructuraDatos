//Calcular la suma de los elementos de una diagonal de una matriz cuadrada.

public class Ejercicio9 {
    public static void main(String[] args) {
        // Hacemos la matriz
        int[][] matriz = {
                { 20, 2, 3 },
                { 8, 8, 40 },
                { 7, 8, 50 }
        };

        int sumaDiagonalPrincipal = 0;

        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonalPrincipal += matriz[i][i];
        }

        //
        System.out.println("Suma de la diagonal principal: " + sumaDiagonalPrincipal);
    }
}
