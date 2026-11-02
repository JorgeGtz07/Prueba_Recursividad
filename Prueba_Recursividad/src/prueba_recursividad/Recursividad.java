package prueba_recursividad;

public class Recursividad {
    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int mcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return mcd(b, a % b);
    }

    public static int count(Object datos[], int n, Object o) {
        if (n == 0) {
            return 0;
        }

        if (datos[n - 1].equals(o)) {
            return 1 + count(datos, n - 1, o);
        }

        return count(datos, n - 1, o);
    }

    public static void reverse(Object datos[], int inicio, int fin) {
        if (inicio >= fin) {
            return;
        }

        Object aux = datos[inicio];
        datos[inicio] = datos[fin];
        datos[fin] = aux;

        reverse(datos, inicio + 1, fin - 1);
    }
}