import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B2563 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int result = 100 * count;
        int[][] Sqr = new int[count][count];
        int[] Wsqr = new int[count];
        int[] Lsqr = new int[count];
        StringTokenizer str;
        for(int i = 0; i < count; i++){
            str = new StringTokenizer(br.readLine());
            for(int j = 0; j < 2; j++) {
                Sqr[i][j] = Integer.parseInt(str.nextToken());
            }
        }
        for(int i = 0; i < count; i++){
            Wsqr[i] = Sqr[i][0];
            Lsqr[i] = Sqr[i][1];
        }
        for(int i = 0; i < count - 1; i++){
            for(int j = 0; j < count; j++){

            }
        }
    }
}