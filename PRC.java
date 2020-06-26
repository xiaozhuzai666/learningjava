import java.util.Scanner;

public class PRC {
    public static void main(String[] args) {
        PRC prc = new PRC();
        Scanner sc1 = new Scanner(System.in);
        String str1;
        str1 = sc1.nextLine();


        String str2;
        str2 = sc1.nextLine();
        String str = prc.getPRC(str1, str2);
        System.out.println(str);
    }

    private String getPRC(String str1, String str2) {
        int[][] dp = new int[50][50];
        int index = 0;
        int longstr = 0;
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    }

                    if (dp[i][j] > longstr) {
                        longstr = dp[i][j];
                        index = j;
                    }
                }


            }
        }
        index += 1;
        if (longstr == 0){
            System.out.println("No Answer");}

         return   str2.substring(index - longstr, index);
    }}
