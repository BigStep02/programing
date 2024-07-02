import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// 2839 설탕배달

public class B2839 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int smallbag = 3;
        int bigbag = n / 5;
        int result = 0;
        while(bigbag >= 0){
            if((n - (bigbag * 5)) % smallbag == 0){
                smallbag = (n - (bigbag * 5)) / smallbag;
                result = bigbag + smallbag;
                break;
            }
            bigbag--;
        }
        if(result == 0) result = -1;
        System.out.println(result);
    }
}