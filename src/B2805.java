import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B2805 {
    static long binary(long[] num, long top, long bottom, int m) {
        long result = 0;
        while (bottom <= top) {
            long count = 0;

            long mid = (top + bottom) / 2;

            for(int i = 0; i < num.length; i++){
                if(num[i] <= mid) continue;
                count += num[i] - mid;
            }

            if(count >= m){
                bottom = mid + 1;
                result = mid;
            }
            else top = mid - 1;
        }

        return result;
    }


    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());

        str = new StringTokenizer(br.readLine());

        long[] num = new long[n];

        for(int i = 0; i < n; i++){
            num[i] = Integer.parseInt(str.nextToken());
        }

        Arrays.sort(num);
        long top = num[n - 1];
        long bottom = 1;
        System.out.println(binary(num, top, bottom, m));
    }
}