import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B8393 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num = 0;
        for(int i = 1; i <= n; i++) {
            num += i;
        }
        System.out.println(num);
    }
}