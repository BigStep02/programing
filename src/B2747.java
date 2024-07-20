import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2747 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] temp = new int[n + 1];
        temp[1] = 1;
        for(int i = 2; i <= n; i++){
            temp[i] = temp[i - 2] + temp[i - 1];
        }
        System.out.println(temp[temp.length - 1]);
    }
}