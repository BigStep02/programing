import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1929 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());

        if(m == 1) return;
        int[] check = new int[m + 1];
        for(int i = 2; i <= m; i++) {
            check[i] = i;
        }
        for (int i = 2; i <= Math.sqrt(m); i++) {
            if (check[i] != i) {
                continue;
            }
            for (int j = i * i; j < check.length; j = j + i) {
                check[j] = 0;
            }
        }
        for(int i = n; i <= m; i++){
            if(check[i] != 0){
                System.out.println(check[i]);
            }
        }
    }
}