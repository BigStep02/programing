import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B11650 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr1 = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedWriter wr2 = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] X = new int[N];
        int[] Y = new int[N];
        StringTokenizer str;
        for(int i = 0; i < N; i++){
            str = new StringTokenizer(br.readLine());
            X[i] = Integer.parseInt(str.nextToken());
            Y[i] = Integer.parseInt(str.nextToken());
        }
        Arrays.sort(X);
        Arrays.sort(Y);
        for(int i = 0; i < N; i++){
            wr1.write(Integer.toString(X[i]));
            wr2.write(Integer.toString(Y[i]));
            System.out.println();
            wr1.flush();
            System.out.print(" ");
            wr2.flush();
        }
        wr1.close();
        wr2.close();
    }
}
