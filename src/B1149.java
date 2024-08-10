import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1149 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =  Integer.parseInt(br.readLine());
        int[][] dp = new int[n][3];
        int[] num = new int[3];
        StringTokenizer str;
        for(int i = 0; i < n; i++) {
            str = new StringTokenizer(br.readLine());
            num[0] = Integer.parseInt(str.nextToken());
            num[1] = Integer.parseInt(str.nextToken());
            num[2] = Integer.parseInt(str.nextToken());
            if(i == 0) {
                dp[0][0] = num[0];
                dp[0][1] = num[1];
                dp[0][2] = num[2];
            }
            else {
                dp[i][0] = num[0] + Math.min(dp[i - 1][1], dp[i - 1][2]);
                dp[i][1] = num[1] + Math.min(dp[i - 1][0], dp[i - 1][2]);
                dp[i][2] = num[2] + Math.min(dp[i - 1][0], dp[i - 1][1]);
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < 3; i++){
            if(dp[n - 1][i] < min) min = dp[n - 1][i];
        }
        System.out.println(min);
    }
}