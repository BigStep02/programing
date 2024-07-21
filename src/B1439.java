import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1439 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int zero = 0;
        int one = 0;
        boolean flag = true;
        if(S.charAt(0) == '0') zero = 1;
        else one = 1;
        if(zero != 0){
            for(int i = 1; i < S.length(); i++){
                if(S.charAt(i) != S.charAt(i - 1) && flag){
                   flag = false;
                   one++;
                   continue;
                }
                if(S.charAt(i) != S.charAt(i - 1) && !flag){
                    flag = true;
                    zero++;
                }
            }
        }
        else {
            for (int i = 1; i < S.length(); i++) {
                if (S.charAt(i) != S.charAt(i - 1) && flag) {
                    flag = false;
                    zero++;
                    continue;
                }
                if (S.charAt(i) != S.charAt(i - 1) && !flag) {
                    flag = true;
                    one++;
                }
            }
        }
        System.out.println(Math.min(zero, one));
    }
}
