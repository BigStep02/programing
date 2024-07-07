import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4134 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        for(int i = 0; i < n; i++){
            boolean check = true;
            long num = Long.parseLong(br.readLine());
            if(num == 1 || num == 0){
                System.out.println(2);
                continue;
            }
            while(true){
                for(int j = 2; j <= Math.sqrt(num); j++){
                    if(num % j == 0) {
                        check = false;
                        break;
                    }
                }
                if(!check){
                    num++;
                }
                if(check){
                    System.out.println(num);
                    break;
                }
                check = true;
            }
        }
    }
}