import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B25501 {
    static int count = 0;
    public static int Palin(String S, int l, int len){
        count++;
        if(l >= len) return 1;
        else if(S.charAt(l) != S.charAt(len)) return 0;
        else return Palin(S, l + 1, len - 1);
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            count = 0;
            String S = br.readLine();
            System.out.print(Palin(S, 0, S.length() - 1) + " ");
            System.out.println(count);
        }
    }
}