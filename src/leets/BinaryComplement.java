package leets;

public class BinaryComplement {
    public static void main(String[] args) {
        System.out.println(getComplement(5));
    }

    public static int getComplement(int N) {
        int ctr =0;
        int m = N;
        int ans=0;
        while (m != 0) {
            if(m%2 ==0)
               ans += (int)Math.pow(2,ctr);
            ++ctr;
            m = m / 2;
        }

        return ans;
    }
}
