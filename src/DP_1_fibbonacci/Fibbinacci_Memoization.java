package DP_1_fibbonacci;

import java.util.Arrays;

public class Fibbinacci_Memoization {
    public static void main(String[] args) {
        int n =6;
        int dp[] =new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fibb(n,dp));
    }

    private static int fibb(int n, int[] dp) {
        if(n<=1)return n;
        if(dp[n]!=-1)return dp[n];
        return dp[n]=fibb(n-1,dp)+fibb(n-2,dp);
    }
}
