import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B15439 {
    public static int result(int n){
        return n * (n - 1);
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(result(n));
    }
}