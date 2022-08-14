package DP_1_fibbonacci;

public class Fibbinacci {
    public static void main(String[] args) {
        int n =6;
        System.out.println(fibb(n));
    }

    private static int fibb(int n) {
        if(n<=1)return n;
        return fibb(n-1)+fibb(n-2);
    }
}
