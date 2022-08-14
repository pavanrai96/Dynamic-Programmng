package DP_27_Print_Longest_Common_SubString;

public class DP_27_Print_Longest_Common_SubString_tabulation {
    public static void main(String[] args) {
        String s1 = "cbbaaxxaabcd";
        String s2 = "caaxxcaabzd";

        System.out.println("The Longest Common SubString is ");
        lcs(s1, s2);
    }

    static void lcs(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        int dp[][] = new int[n + 1][m + 1];
//        for (int i = 0; i <= n; i++) {
//            dp[i][0] = 0;
//        }
//        for (int i = 0; i <= m; i++) {
//            dp[0][i] = 0;
//        }
        int len = 0;
        int row = 0, col = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    if (len < dp[i][j]) {
                        len = dp[i][j];
                        row = i;
                        col = j;
                    }
                }else dp[i][j] =0;
            }
        }
        String str = "";

        while (dp[row][col] != 0) {
            str+=s1.charAt(row - 1);
            len--;
            row--;
            col--;
        }

        StringBuilder ans = new StringBuilder(str);

        System.out.println(ans.reverse());
    }
}

