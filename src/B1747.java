import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1747 {
    static int[] num;
    static Boolean bool;

    static void eratos(int n){
        num = new int[10000000];
        for(int i = 2; i < num.length; i++){
            num[i] = i;
        }
        for(int i = 2; i < Math.sqrt(num.length); i++){
            if(num[i] != i) continue;
            for(int j = i * i; j < num.length; j += i){
                num[j] = 0;
            }
        }
    }

    static boolean pallin(int[] num, int i){
        String word = Integer.toString(num[i]);
        char[] c = word.toCharArray();
        bool = true;
        for(int j = 0; j < c.length; j++){
            if(c[j] != c[c.length - j - 1]){
                bool = false;
                break;
            }
        }
        return bool;
    }


    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        eratos(n);
        for(int i  = n; i < num.length; i++){
            if(num[i] != 0){
                if(pallin(num, i)){
                    System.out.println(num[i]);
                    break;
                }
            }
        }
    }
}