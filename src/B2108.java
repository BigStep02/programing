import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2108 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        int plus = 0;
        for(int i = 0; i < n; i++){
            num[i] = Integer.parseInt(br.readLine());
            plus += num[i];
        }
        Arrays.sort(num);
        if(n == 1){
            System.out.println(num[0]);
            System.out.println(num[0]);
            System.out.println(num[0]);
            System.out.println(0);
        }
        else {
            double db = (double) plus / n;
            System.out.println(Math.round(db));
            System.out.println(num[n / 2]);
            int count = 0;
            int countmax = -1;
            int mod = num[0];
            boolean bool = false;
            for(int i = 0; i < n - 1; i++){
                if(num[i] == num[i + 1]){
                    count++;
                }
                else count = 0;
                if(count > countmax){
                    countmax = count;
                    mod = num[i];
                    bool = true;
                }
                else if(countmax == count && bool){
                    mod = num[i];
                    bool = false;
                }
            }
            System.out.println(mod);
            System.out.println(num[n - 1] - num[0]);
        }
    }
}