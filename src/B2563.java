import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2563 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] xy = new int[n][2];
        int[][] paint = new int[100][100];
        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 100; j++){
                paint[i][j] = 0;
            }
        }
        StringTokenizer str;
        for(int i = 0; i < n; i++){
            str = new StringTokenizer(br.readLine());
            for(int j = 0; j < 2; j++){
                xy[i][j] = Integer.parseInt(str.nextToken());
            }
        }
        int temp = 0;
        while(temp != n){
            int x = xy[temp][0];
            int y = xy[temp][1];
            for(int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if(paint[x + i][y + j] <= 100){
                        paint[x + i][y + j] += 1;
                    }
                }
            }
            temp++;
        }
        int result = 0;
        for(int i = 0; i < 100; i++){
            for(int j = 0; j < 100; j++){
                if(paint[i][j] >= 1) result++;
            }
        }
        System.out.println(result);
    }
}