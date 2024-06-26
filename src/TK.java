
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TK {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int N = Integer.parseInt(br.readLine());
        s = s + "석진";
        System.out.println(s);
        System.out.println(N);
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i;
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}