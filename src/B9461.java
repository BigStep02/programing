import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9461 {
    static long[] dp;

    static long length(int m){
        dp = new long[m];
        dp[0] = 1;
        if(m >= 2){
            dp[1] = 1;
        }
        if(m >= 3){
            dp[2] = 1;
        }
        for(int i = 3; i < m; i++){
            dp[i] = dp[i - 2] + dp[i - 3];
        }
        return dp[m - 1];
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            int m = Integer.parseInt(br.readLine());
            System.out.println(length(m));
        }
    }
}
