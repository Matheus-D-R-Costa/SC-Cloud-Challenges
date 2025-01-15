import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

    private PrimeNumbers() { }

    public static List<Integer> findPrimesRecursive(int n) {
        validateIn(n);
        return findPrimesRecursiveHelper(n, new ArrayList<>());
    }

    private static List<Integer> findPrimesRecursiveHelper(int n, List<Integer> primes) {
        if (n < 2) return primes;
        if (isPrime(n)) primes.add(0, n);

        return findPrimesRecursiveHelper(n - 1, primes);

    }

    public static List<Integer> findPrimesLinear(int n) {
        validateIn(n);
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) primes.add(i);
        }

        return primes;

    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0) return false;
        }

        return true;

    }

    private static void validateIn(int n) {
        if (n < 0) throw new IllegalArgumentException("Número inválido!");
    }


}
