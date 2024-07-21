import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1789 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long temp = 0;
        int result = 1;
        int i = 1;
        while(temp != n){
            temp += i;
            i++;
            if(temp + i > n){
                break;
            }
            result++;
        }
        System.out.println(result);
    }
}
