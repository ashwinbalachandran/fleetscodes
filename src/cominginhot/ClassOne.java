package cominginhot;

public class ClassOne {
    static boolean checkPrime(long num){
        int nf = 0;
        for(long i=2;i<num;i++){
            if(num%i==0)
                ++nf;
        }
        if(nf==0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        long a = 1000000l;
        long b = 2000000l;
        int ctr =0;
        for(long i=a;i<=b;i++){
            if(checkPrime(i))
                ++ctr;
        }
        System.out.println(ctr);

    }
}
