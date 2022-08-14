package DP_26_Print_Longest_Common_Subsequence;

public class DP_26_Print_Longest_Common_Subsequence_tabulation {
    public static void main(String[] args) {
        String s1= "abcde";
        String s2= "bdgek";

        System.out.print("The Longest Common Subsequence is ");
        lcs(s1,s2);
    }

    static void lcs(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        int dp[][] = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i <= m; i++) {
            dp[0][i] = 0;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = 0 + Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        int len =dp[n][m];
        String str = "";

        int i=n;
        int j=m;

        while(i>0&&j>0){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                str+=s1.charAt(i-1);
                i--;
                j--;
            } else if (dp[i-1][j]>dp[i][j-1]) {
                i=i-1;
            }else {
                j=j-1;
            }
        }

        StringBuilder ans = new StringBuilder(str);

        System.out.println(ans.reverse());
    }
}
