public class Fibonacci {

    private Fibonacci() { };

    public static int findRecursive(int n) {
        validateIn(n);
        if (n == 0 || n == 1) return n;
        return findRecursive(n -1) + findRecursive(n - 2);
    }

    public static int findLinear(int n) {
        validateIn(n);
        double phi = (1 + Math.sqrt(5)) / 2;
        double result = (Math.pow(phi, n) - Math.pow(-phi, -n)) / Math.sqrt(5);
        return (int) Math.round(result);
    }

    private static void validateIn(int n) {
        if (n < 0) throw new IllegalArgumentException("Número inválido!");
    }

}
