package projecteuler;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        long num = 600851475143l;
        getLargestPrimeFactor(num);
    }

    public static void getLargestPrimeFactor(long num) {
        long i = num / 2;
        while (i > 0) {
            if (num % i == 0) {
                if (isPrime(i)) {
                    System.out.println("Largest prime factor is:" + i);
                    break;
                }
            }
            --i;
        }
        System.out.println("No large prime factor wtf?");
    }

    public static boolean isPrime(long n) {
        int nf = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                ++nf;
            if(nf>0)
                return false;
        }
        if (nf == 0)
            return true;
        return false;
    }
}
