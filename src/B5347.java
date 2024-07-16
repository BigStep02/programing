import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B5347 {
    public static long common(long x, long y){
        long temp = 0;
        long min = Math.max(x, y);
        long max = Math.min(x, y);
        while(max % min != 0){
            temp = max % min;
            max = min;
            min = temp;
        }
        return min;
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        StringTokenizer str;
        for(int i = 0; i < n; i++){
            str = new StringTokenizer(br.readLine());
            long x = Long.parseLong(str.nextToken());
            long y = Long.parseLong(str.nextToken());
            long result = x * y / common(x, y);
            System.out.println(result);
        }
    }
}