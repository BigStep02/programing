import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class B11047 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());
        Integer[] num = new Integer[n];
        int result = 0;
        for(int i = 0; i < n; i++){
            num[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(num, Collections.reverseOrder());
        for(int i = 0; i < n; i++){
            if(num[i] <= m){
                result += m / num[i];
                m %= num[i];
                if(m == 0) break;
            }
        }
        System.out.println(result);
    }
}
