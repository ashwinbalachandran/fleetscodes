package sorters;

import java.util.ArrayList;

public class InsertionSort {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(11);
        numbers.add(21);
        numbers.add(13);
        numbers.add(41);
        numbers.add(15);
        numbers.add(61);
        numbers.add(17);
        numbers.add(81);
        numbers.add(19);
        insertionSort(numbers);
        for(int x:numbers)
            System.out.println(x);
    }
    public static void insertionSort(ArrayList<Integer> nums){
        int i, pos, j;
        for(i=1;i<nums.size();i++){
            pos = nums.get(i);
            j = i-1;
            while(j>=0 && nums.get(j)>pos){
                nums.set(j+1,nums.get(j));
                j= j-1;
            }
            nums.set(j+1,pos);
        }
    }
}
