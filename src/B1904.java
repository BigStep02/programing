import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1904 {
    static int[] dp;

    public static int tile(int n){
        dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 2;
        for(int i = 2; i < n; i++){
            dp[i] = (dp[i - 1] + dp[i - 2]) % 15746;
        }
        return dp[n - 1];
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(tile(n));

    }
}
