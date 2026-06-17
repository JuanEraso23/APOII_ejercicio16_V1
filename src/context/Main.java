package context;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);

        //Cantidad de Calificaciones
        System.out.print("Ingrese el número de calificaciones: ");
        int lim = sc.nextInt();

        //Arreglo
        int[] notas = new int[lim];

        double suma = 0;

        //Ingreso de Datos
        for (int i = 0; i < lim; i++) {
            System.out.print(
                    "Ingrese la calificación #" + (i + 1) + ": "
            );

            notas[i] = sc.nextInt();
            suma += notas[i];
        }

        //Inicialización
        int max = notas[0];
        int min = notas[0];

        //Búsqueda de Nota Máxima y Mínima
        for (int i = 1; i < lim; i++) {
            if (notas[i] > max) {
                max = notas[i];
            }

            if (notas[i] < min) {
                min = notas[i];
            }
        }

        //Promedio
        double prom = suma / lim;

        //Resultados
        System.out.println("\nRESULTADOS");
        System.out.println("Nota Máxima: " + max);
        System.out.println("Nota Mínima: " + min);
        System.out.println("Promedio: " + prom);

        //Cierre Scanner
        sc.close();
    }
}