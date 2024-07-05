import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B13242 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        long num1 = Long.parseLong(str.nextToken());
        long num2 = Long.parseLong(str.nextToken());
        long temp3;
        long temp1 = Long.max(num1, num2);
        long temp2 = Long.min(num1, num2);
        while (temp2 != 0) {
            temp3 = temp1 % temp2;
            temp1 = temp2;
            temp2 = temp3;
        }
        long result = (num1 * num2) / temp1;
        System.out.println(result);
    }
}