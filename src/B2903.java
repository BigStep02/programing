import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2903 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int first = 1;
        int count = 1;
        int result = 0;
        for(int i = 0; i < n + 1; i++){
            result = (first * count + 1) * (first * count + 1);
            count *= 2;
        }
        System.out.println(result);
    }
}