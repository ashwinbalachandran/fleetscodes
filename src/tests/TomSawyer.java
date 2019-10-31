package src.tests;

public class TomSawyer {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 1, 0, 1 };
        int n = arr.length;
        System.out.println(getAnswer(arr, n));
    }
    static long getAnswer(int arr[], int n)
    {
        int[] locations = new int[n];
        int p = 0, i;

        // for loop for saving the
        // positions of all 1s
        for (i = 0; i < n; i++)
        {
            if (arr[i] == 1)
            {
                locations[p] = i + 1;
                p++;
            }
        }

        // If array contains only 0s
        if (p == 0)
            return 0;

        long ans = 1;
        for (i = 0; i < p - 1; i++)
        {
            ans *= locations[i + 1] - locations[i];
        }

        // Return the total ans
        return ans;
    }
}
