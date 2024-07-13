import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1037 {
  public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        StringTokenizer str = new StringTokenizer(br.readLine());
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            num[i] = Integer.parseInt(str.nextToken());
            if(num[i] > max) max = num[i];
            if(num[i] < min) min = num[i];
        }
        int result = max * min;
        System.out.println(result);
    }
}