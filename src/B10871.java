import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10871 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(str.nextToken());
        int X = Integer.parseInt(str.nextToken());
        int[] num = new int[N];
        str = new StringTokenizer(br.readLine());
        int result = 0;
        for(int i = 0; i < N; i++){
            num[i] = Integer.parseInt(str.nextToken());
            if(num[i] < X){
                result = num[i];
                System.out.print(result + " ");
            }
        }

    }
}