import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class B1427 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        String change = br.readLine();
        int len = change.length();
        char[] c = new char[len];
        c = change.toCharArray();
        int[] num = new int[len];
        for(int i = 0; i < len; i++){
            num[i] = Integer.parseInt(String.valueOf(c[i]));
        }

        Arrays.sort(num);
        for(int i = 0; i < len / 2; i++){
            int temp = num[i];
            num[i] = num[len - i - 1];
            num[len - i - 1] = temp;
        }
        for(int i = 0; i < len; i++){
            wr.write(Integer.toString(num[i]));
        }
        wr.flush();
        wr.close();
    }
}
