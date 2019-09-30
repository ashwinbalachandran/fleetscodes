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
        int nc = 0;
        int prev = number % 10;
        int oneCount = 0;
        int onescore = 0;
        int consecLength = 1;
        int evenDigScore = 0;
        int conscore = 0;
        int i=0;
        while (m != 0) {
            r = m % 10;
            if (r == 9)
                ++nc;
            if (prev == 1 && r == 1 && oneCount > 2) {
                onescore += 5;
                oneCount++;
            } else if (prev == 1 && r == 1 && oneCount==1) {
                onescore += 5;
                oneCount++;
            } else if (r == 1) {
                oneCount++;
            } else
                oneCount = 0;
            if (r == prev - 1) {
                ++consecLength;
                flag = false;
            } else {
                flag = true;
                conscore += consecLength*consecLength;
                consecLength = 1;
            }
            if (r % 2 == 0) {
                ++evenDigScore;
            }
            prev = r;
            m /= 10;
            ++i;
        }

        System.out.println("Conse"+consecLength+" and "+conscore);
        if(!flag)
            conscore += consecLength*consecLength -1;
        return onescore + (evenDigScore * 2) + conscore + (nc * 4);
    }

    public static int compute_number_score(int number) {
        int score = 0;
        score += getDigScore(number);
        score += number % 7 == 0 ? 1 : 0;
        return score;
    }
}
