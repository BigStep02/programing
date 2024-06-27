import java.io.*;
        import java.util.Arrays;
import java.util.StringTokenizer;

public class B2750 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];
        for(int i = 0; i < N; i++){
            StringTokenizer str = new StringTokenizer(br.readLine());
            num[i] = Integer.parseInt(str.nextToken());
        }
        Arrays.sort(num);
        for(int i = 0; i < N; i++){
            System.out.println(num[i]);
        }
    }
}