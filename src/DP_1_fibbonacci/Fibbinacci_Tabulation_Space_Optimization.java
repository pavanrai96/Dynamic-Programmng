package DP_1_fibbonacci;

public class Fibbinacci_Tabulation_Space_Optimization {
    public static void main(String[] args) {
        int n = 6;

        int prev2 = 0;
        int prev = 1;

        for (int i = 2; i <= n; i++) {
            int curri = prev + prev2;
            prev2 = prev;
            prev = curri;
        }
        System.out.println(prev);
    }
}
