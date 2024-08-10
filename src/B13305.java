import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B13305 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] len = new long[n - 1];
        long[] cost = new long[n];
        StringTokenizer str = new StringTokenizer(br.readLine());
        for(int i = 0; i < len.length; i++){
            len[i] = Integer.parseInt(str.nextToken());
        }
        str = new StringTokenizer(br.readLine());
        for(int i = 0; i < cost.length; i++){
            cost[i] = Integer.parseInt(str.nextToken());
        }
        long result = len[0] * cost[0];
        for(int i = 1; i < n - 1; i++){
            cost[i] = Math.min(cost[i], cost[i - 1]);
            result += cost[i] * len[i];
        }
        System.out.println(result);
    }
}
