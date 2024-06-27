import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B2751 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        int[] num = new int[count];
        for (int i = 0; i < count; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            num[i] = Integer.parseInt(str.nextToken());
        }
        Arrays.sort(num);
        for(int i = 0; i < count; i++){
            wr.write(Integer.toString(num[i]));
            System.out.println();
            wr.flush();
        }
        wr.close();
    }
}