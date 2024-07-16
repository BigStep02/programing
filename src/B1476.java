import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1476 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int E = Integer.parseInt(str.nextToken());
        int S = Integer.parseInt(str.nextToken());
        int M = Integer.parseInt(str.nextToken());
        int E1 = 1;
        int S1 = 1;
        int M1 = 1;
        int count = 1;
        while(true){
            if(E == E1 && S == S1 && M == M1){
                break;
            }
            E1++;
            S1++;
            M1++;
            if(E1 > 15) E1 = 1;
            if(S1 > 28) S1 = 1;
            if(M1 > 19) M1 = 1;
            count++;
        }
        System.out.println(count);
    }
}
