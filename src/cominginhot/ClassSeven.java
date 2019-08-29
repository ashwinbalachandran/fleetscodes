package cominginhot;

public class ClassSeven {
    public static void main(String[] args)
    {
        int a =1, b = 0;
        int val1 = 0, val2 = 0;
        for(int i = a;i<13;i++)
            for(int j = b;j<13;j++)
            {
                val1 = (7*i+j)%13;
                val2 = (6*i+j)%13;
                if(val1 == 6 && val2 == 4)
                    System.out.println("The values are:"+i+" and "+ j);

            }
    }
}
