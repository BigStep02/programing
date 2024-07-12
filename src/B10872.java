import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//
public class B10872 {
    public static int pact(int n){
        if(n == 0) return 1;
        else if(n == 1) return n;
        else return pact(n - 1) * n;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(pact(n));
    }
}
