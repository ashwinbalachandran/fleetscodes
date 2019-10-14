package src.tests;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LockAcquirer {
    // Complete the check_log_history function below.
    static int check_log_history(List<String> events) {
        Stack<Integer> locks = new Stack<>();
        int tempRes = 0;
        for (int i = 0; i < events.size(); i++) {
            String[] eves = events.get(i).split(" ");
            if (eves[0].equals("ACQUIRE")) {
                tempRes = checkPush(locks, eves, i);
            } else if (eves[0].equals("RELEASE")) {
                tempRes = checkPop(locks, eves, i);
            }
            if (tempRes != 0)
                return tempRes;
        }
        int dL = checkDangling(locks, events.size());
        if (dL != 0)
            return dL;
        return 0;

    }

    private static int checkDangling(Stack<Integer> locks, int N) {
        if (locks.size() != 0)
            return N + 1;
        return 0;
    }

    private static int checkPush(Stack<Integer> locks, String[] eves, int index) {
        if (locks.contains(Integer.parseInt(eves[1])))
            return index;
        else {
            //NFE
            locks.push(Integer.parseInt(eves[1]));
            return 0;
        }
    }

    private static int checkPop(Stack<Integer> locks, String[] eves, int index) {
        if (!locks.contains(Integer.parseInt(eves[1]))) {
            return index;
        } else {
            if (locks.peek() != Integer.parseInt(eves[1]))
                return index;
            else {
                locks.pop();
                return 0;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        List<String> events = new ArrayList<String>();
        events.add("ACQUIRE 364");
        events.add("ACQUIRE 84");
        events.add("RELEASE 84");
        events.add("RELEASE 364");
        System.out.println(check_log_history(events));
    }
}