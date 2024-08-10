import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1932 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] num = new int[n][];
        StringTokenizer str;
        int count = 1;
        for(int i = 0; i < n; i++){
            str = new StringTokenizer(br.readLine());
            num[i] = new int[count];
            for(int j = 0; j < count; j++){
                num[i][j] = Integer.parseInt(str.nextToken());
            }
            count++;
        }
        count = 2;
        int[][] dp = new int[n][n + 1];
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp.length; j++){
                dp[i][j] = 0;
            }
        }
        dp[0][0] = num[0][0];
        for(int i = 1; i < n; i++){
            for(int j = 0; j < count; j++){
                if(j == 0) {
                    dp[i][j] = num[i][j] + dp[i - 1][j];
                }
                else {
                    if(j == i) {
                        dp[i][j] = num[i][j] + dp[i - 1][j - 1];
                        continue;
                    }
                    dp[i][j] = Math.max(num[i][j] + dp[i - 1][j - 1], num[i][j] + dp[i - 1][j]);
                }
            }
            count++;
        }
        int max = 0;
        for(int i = 0; i < n; i++){
            if(max < dp[n - 1][i]) max = dp[n - 1][i];
        }
        System.out.println(max);
    }
}