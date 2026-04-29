package Traning;
import java.util.*;
public class recursion2 {
    static int count(int n,int[] dp){
        if(n==0)
            return 0;
        if(dp[n] != -1) return dp[n];
        dp[n] =1 +count(n/10,dp);
        return dp[n];
    }
    // Add a Numbers
    static int sum(int n){
        if(n == 0)
            return 0;
        return (n % 10) + sum(n / 10);
    }

    public static void main(String[] args) {
        int n = 2233;
        int[]dp = new int [n+1];
        Arrays.fill(dp,-1);
        System.out.println(count(n,dp));
        System.out.println( sum(n));
    }
}

    