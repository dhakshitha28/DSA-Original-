class PrimeSolution {

    static boolean isPrime(int n) {
        int count = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                if ((n / i) != i) {
                    count++;
                }
            }
        }

        return count == 2;
    }
}

public class PrimeNumber {

    public static void main(String[] args) {

        int n = 7;

        boolean result = PrimeSolution.isPrime(n);

        if (result) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is Not Prime");
        }
    }
}