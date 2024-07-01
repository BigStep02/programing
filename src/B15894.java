import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B15894 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = n * 4;
        String k = Integer.toUnsignedString(result);
        System.out.println(k);
    }
}