import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1193 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int check = 1;
        int test = 1;
        while(true){
            if(test >= n){
                break;
            }
            check++;
            test += check;
        }
        test += 1;
        int result1 = 0;
        int result2 = 0;
        for(int i = 0; i <= check; i++){
            if(check % 2 == 0){
                result1 = check - i;
                result2 = 1 + i;
                test--;
                if(test == n) break;
            }
            else{
                result1 = 1 + i;
                result2 = check - i;
                test--;
                if(test == n) break;
            }
        }
        System.out.println(result1 + "/" + result2);
    }
}
