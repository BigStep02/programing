import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B11653 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n == 1) return;
        int[] check = new int[n + 1];
        for(int i = 2; i <= n; i++) {
            check[i] = i;
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(check[i] != i){
                continue;
            }
            for(int j = i * i; j < check.length; j = j + i){
                check[j] = 0;
            }
        }
        int i = 2;
        while(n > 0 && i <= n){
            if(check[i] == 0){
                i++;
                continue;
            }
            if(n % check[i] == 0){
                n /= check[i];
                result.add(check[i]);
            }
            else if(n % check[i] != 0) {
                i++;
            }
        }
        for(int j = 0; j < result.size(); j++){
            System.out.println(result.get(j));
        }
    }
}