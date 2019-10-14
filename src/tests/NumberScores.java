package src.tests;

import java.util.Scanner;

public class NumberScores {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        System.out.println(compute_number_score(number));
    }

    private static int getDigScore(int number) {
        int m = number;
        int r = 0;
        boolean flag = false;
        int fc = 0;
        int prev = number % 10;
        int threeCount = 0;
        int threeScore = 0;
        int consecLength = 1;
        int oddDigScore = 0;
        int conscore = 0;
        int i=0;
        while (m != 0) {
            r = m % 10;
            if (r == 5)
                fc+=2;
            if (prev == 3 && r == 3 && threeCount >= 2) {
                threeScore += 4;
                threeCount++;
            } else if (prev == 3 && r == 3 && threeCount==1) {
                threeScore += 4;
                threeCount++;
            } else if (r == 3) {
                threeCount++;
            } else
                threeCount = 0;
            if (r == prev - 1) {
                ++consecLength;
                flag = false;
            } else {
                flag = true;
                conscore += consecLength*consecLength;
                consecLength = 1;
            }
            if (r % 2 != 0) {
                ++oddDigScore;
            }
            prev = r;
            m /= 10;
            ++i;
        }

        System.out.println("Conse"+consecLength+" and "+conscore);
        if(!flag)
            conscore += consecLength*consecLength -1;
        int mulSix = 0;
        if(number%5==0)
            mulSix=6;
        System.out.println("Three score = "+threeScore+"Odd"+oddDigScore+"Consec"+conscore+"Five="+fc+"Sixmul"+mulSix);
        return threeScore + (oddDigScore) + conscore + (fc)+mulSix;
    }

    public static int compute_number_score(int number) {
        int score = 0;
        score += getDigScore(number);
//        score += number % 7 == 0 ? 1 : 0;
        return score;
    }
}
