import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1010 {
    public static int[][] num = new int[30][30];

    public static int result(int m, int n){
        if(num[m][n] > 0){
            return(num[m][n]);
        }
        if(n == m || n == 0) return num[m][n] = 1;
        return num[m][n] = result(m - 1, n - 1) + result(m - 1, n);
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer str;
        for(int i = 0; i < T; i++){
            str = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(str.nextToken());
            int m = Integer.parseInt(str.nextToken());

            System.out.println(result(m, n));
        }

    }
}