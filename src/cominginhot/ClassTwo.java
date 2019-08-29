package cominginhot;

import java.util.ArrayList;

public class ClassTwo {
    public static void main(String[] args) {
        int a = 0, b = 40;
        ArrayList<Integer> zn = new ArrayList<Integer>();
        ArrayList<Integer> znstar = new ArrayList<Integer>();
        while(a!=b) {
            if(getGCD(a, b)==1) {
                //System.out.println(a);
                znstar.add(a);
            }
            zn.add(a);
            ++a;
        }
        getMultInv(zn,b);

    }
    static void getMultInv(ArrayList<Integer> zn, int n){
        int couter = 0;
        System.out.println("Zn\tInverse");
        for(int num: zn){
            for(int n2:zn){
                if((num*n2)%n == 1) {
                    System.out.println(num+"\t"+n2);
                    ++couter;
                }
            }
        }
        System.out.println("Totient = "+couter);
    }
    static int getGCD(int a, int b){
        if(b==0)
            return a;
        else
            return getGCD(b,(a%b));
    }
}
