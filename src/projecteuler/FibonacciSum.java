package projecteuler;

public class FibonacciSum {
    public static void main(String[] args) {
        long a = 1, b = 2;
        long c;
        long sum = b;
        while(a<4000000 && b<4000000){
            c = a+b;
            if(c%2 == 0)
            {
                sum += c;
            }
            a= b;
            b = c;
        }
        System.out.println(sum);
    }
}
