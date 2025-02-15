import java.util.*;

public class Sumatoria1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            System.out.printf("%.2f%n", calcularSumatoria(n, x));
        }
        scanner.close();
    }

    private static double calcularSumatoria(int n, int x) {
        List<Integer> fibonacci = generarFibonacci(n);
        List<Integer> primos = generarPrimos(n);
        
        double suma = 0;
        for (int i = 0; i < n; i++) {
            suma += (double) fibonacci.get(i) / (primos.get(i) * x);
        }
        return suma;
    }

    private static List<Integer> generarFibonacci(int n) {
        List<Integer> fibonacci = new ArrayList<>(Arrays.asList(1, 1));
        while (fibonacci.size() < n) {
            int size = fibonacci.size();
            fibonacci.add(fibonacci.get(size - 1) + fibonacci.get(size - 2));
        }
        return fibonacci.subList(0, n);
    }

    private static List<Integer> generarPrimos(int n) {
        List<Integer> primos = new ArrayList<>();
        int num = 2;
        while (primos.size() < n) {
            if (esPrimo(num)) {
                primos.add(num);
            }
            num++;
        }
        return primos;
    }

    private static boolean esPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

