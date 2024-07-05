import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1934 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer str;
        int temp3;
        for (int i = 0; i < n; i++) {
            str = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(str.nextToken());
            int num2 = Integer.parseInt(str.nextToken());
            int temp1 = Integer.max(num1, num2);
            int temp2 = Integer.min(num1, num2);
            while (temp2 != 0) {
                temp3 = temp1 % temp2;
                temp1 = temp2;
                temp2 = temp3;
            }
            int result = (num1 * num2) / temp1;
            System.out.println(result);
        }
    }
}
