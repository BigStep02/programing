import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2960 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());
        int[] temp = new int[n + 1];
        for(int i = 1; i <= n; i++){
            temp[i] = i;
        }
        int count = 0;
        int result = 0;
        for(int i = 2; i <= n; i++){
            if(temp[i] != i) continue;
            for(int j = i; j <= n; j += i){
                if(temp[j] != 0) {
                    temp[j] = 0;
                    count++;
                    if (count == m) {
                        result = j;
                        break;
                    }
                }
            }
        }
        System.out.println(result);
    }
}