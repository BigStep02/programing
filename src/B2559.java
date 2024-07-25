import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2559 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());
        int[] num = new int[n];
        str = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            num[i] = Integer.parseInt(str.nextToken());
        }
        for(int i = n - 1; i >= m - 1; i--){
            for(int j = i - 1; j >= i - m + 1; j--){
                num[i] += num[j];
            }
        }
        int result = Integer.MIN_VALUE;
        for(int i = m - 1; i < num.length; i++){
            if(num[i] > result) result = num[i];
        }
        System.out.println(result);
    }
}