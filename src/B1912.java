import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1912 {
    static int max;
    static int[] dp;
    static void numcheck(int[] num, int n){
        dp = new int[n];
        dp[0] = num[0];
        max = dp[0];
        int temp = 0;
        for(int i = 1; i < n; i++){
            temp += dp[i - 1] + num[i];
            dp[i] = Math.max(temp, num[i]);
            max = Math.max(dp[i], max);
            temp = 0;
        }
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        StringTokenizer str = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            num[i] = Integer.parseInt(str.nextToken());
        }
        numcheck(num, n);
        System.out.println(max);
    }
}