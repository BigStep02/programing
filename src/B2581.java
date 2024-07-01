import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2581 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int plus = 0;
        int min = Integer.MAX_VALUE;
        for(int i = m; i <= n; i++){
            int count = 0;
            if(i == 1) continue;
            for(int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                plus += i;
                if(i < min) min = i;
            }
        }
        if(plus != 0){
            System.out.println(plus);
            System.out.println(min);
        }
        else System.out.println(-1);
    }
}