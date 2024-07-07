import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4948 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n == 0) break;
            else if(n == 1){
                System.out.println(1);
                continue;
            }
            int[] num = new int[n * 2];
            for(int i = 0; i < num.length; i++){
                num[i] = i;
            }
            for(int i = 2; i < Math.sqrt(num.length); i++){
                if(num[i] != i) continue;
                for(int j = i * i; j < n * 2; j += i){
                    num[j] = 0;
                }
            }
            int count = 0;
            for(int i = n + 1; i < num.length; i++){
                if(num[i] == i) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}