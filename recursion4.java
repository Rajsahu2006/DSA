package Traning;
import java.util.*;
public class recursion4 {
    static int countZero(int n) {
        if (n == 0) return 1;  // special case

        return countHelper(n);
    }

    static int countHelper(int n) {
        if (n == 0) return 0;

        int count = (n % 10 == 0) ? 1 : 0;
        return count + countHelper(n / 10);
    }

    public static void main(String[] args) {
        int n = 102030;
        System.out.println(countZero(n));
    }
}
