import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B24416 {
    static int[] dp;
    static int count1 = 0;
    static int count2 = 0;

    public static int fibo(int n){
        if(n == 1 || n == 2){
            count1++;
            return 1;
        }
        else return fibo(n - 1) + fibo(n - 2);
    }

    public static int fibodp(int n){
        dp = new int[n];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i < n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
            count2++;
        }
        return dp[n - 1];
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        fibo(n);
        fibodp(n);
        System.out.println(count1 + " " + count2);
    }
}