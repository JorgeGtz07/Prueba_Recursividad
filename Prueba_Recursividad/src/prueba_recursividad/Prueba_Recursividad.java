package prueba_recursividad;

import java.util.Arrays;

public class Prueba_Recursividad {

    public static void main(String[] args) {
        // Fibonacci
        System.out.println("Fibonacci de 5: " + Recursividad.fibonacci(5));
        System.out.println("Fibonacci de 40: " + Recursividad.fibonacci(40));

        // Maximo comun divisor
        System.out.println("MCD de 45 y 75: " + Recursividad.mcd(45, 75));
        System.out.println("MCD de 47 y 91: " + Recursividad.mcd(47, 91));

        // Contar ocurrencias
        Object datos1[] = {1, 2, 3, 3, 2, 3, 1};
        System.out.println("Ocurrencias del 3: " + Recursividad.count(datos1, datos1.length, 3));

        Object datos2[] = {1, 2, 3, 3, 2, 3, 1};
        System.out.println("Ocurrencias del 1: " + Recursividad.count(datos2, datos2.length, 1));

        Object datos3[] = {'A', 'B', 'C', 'B', 'A', 'B', 'D'};
        System.out.println("Ocurrencias de C: " + Recursividad.count(datos3, datos3.length, 'C'));

        Object datos4[] = {'A', 'B', 'C', 'B', 'A', 'B', 'D'};
        System.out.println("Ocurrencias de E: " + Recursividad.count(datos4, datos4.length, 'E'));

        // Invertir arreglos
        Object datos5[] = {1, 2, 3, 4, 5};
        Recursividad.reverse(datos5, 0, datos5.length - 1);
        System.out.println("Arreglo invertido: " + Arrays.toString(datos5));

        Object datos6[] = {'A', 'B', 'C', 'D'};
        Recursividad.reverse(datos6, 0, datos6.length - 1);
        System.out.println("Arreglo invertido: " + Arrays.toString(datos6));
    }
}