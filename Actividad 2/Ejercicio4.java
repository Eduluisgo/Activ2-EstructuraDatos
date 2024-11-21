// Eliminar elementos duplicados de un arreglo de cadenas.

import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Aqui tengo la cadenas con elementos duplicados para el ejercicio
        String[] cadenas = { "unidad1", "unidad1", "unidad2", "unidad3", "unidad4", "unidad1" };

        // Creo una lista para almacenar los elementos únicos
        ArrayList<String> listaSinDuplicados = new ArrayList<>();

        // aqui recorro el arreglo y agregar solo los elementos únicos
        for (String cadena : cadenas) {
            if (!listaSinDuplicados.contains(cadena)) {
                listaSinDuplicados.add(cadena);
            }
        }

        String[] arregloSinDuplicados = listaSinDuplicados.toArray(new String[0]);

        // Muestro el arreglo sin duplicados
        System.out.println("No tiene duplicados: " + Arrays.toString(arregloSinDuplicados));
    }
}
