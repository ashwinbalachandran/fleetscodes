package src.cominginhot;

import java.util.*;

public class Testing {
    public static void main(String[] args) {
//        LinkedList<Integer> ll = new LinkedList<>();
//        Iterator it = ll.iterator();
//        while(it.hasNext()){
//            Integer ints = (Integer)it.next();
//        }
        String [][]wordFreq = new String[5][5];
        wordFreq[0]= new String[]{"One"};
        HashMap<Integer, String> days = new HashMap<>();
        double a = 1234.34D;
        String x = String.valueOf(a);
        System.out.println(x);
        days.put(2,"MONDAY");
        days.put(3,"TUESDAY");
        days.put(4,"WEDNESDAY");
        days.put(5,"THURSDAY");
        days.put(6,"FRIDAY");
        days.put(7,"SATURDAY");
        days.put(1,"SUNDAY");
        Iterator iter = days.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry p = (Map.Entry)iter.next();
            System.out.println(p.getKey()+"eeees"+p.getValue());
        }
        Calendar c = Calendar.getInstance();
        c.set(2013, 5-1, 20);
        //Calendar c = new GregorianCalendar(2015,8,25);
        System.out.println("Day "+days.get(c.get(Calendar.DAY_OF_WEEK)));
//        return days.get(Calendar.DAY_OF_WEEK);
    }
}
