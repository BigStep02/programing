import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B19532 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(str.nextToken());
        int b = Integer.parseInt(str.nextToken());
        int c = Integer.parseInt(str.nextToken());
        int d = Integer.parseInt(str.nextToken());
        int e = Integer.parseInt(str.nextToken());
        int f = Integer.parseInt(str.nextToken());
        int X = 0;
        int Y = 0;
        for (int i = -999; i < 1000 ; i++) {
            for (int j = -999; j < 1000; j++) {
                if ((a * i) + (b * j) == c && (d * i) + (e * j) == f){
                  X = i;
                  Y = j;
                  break;
                }
            }

        }
        System.out.print(X + " ");
        System.out.println(Y);
    }
}