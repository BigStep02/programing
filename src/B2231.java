import java.io.*;

public class B2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int j = 1;

        int result = 0;
        for (int i = 1; i <= n; i++) {
            j = i;
            int temp = 0;
            while (j != 0) {
                temp += j % 10;
                j /= 10;
            }
                if (temp + i == n) {
                    result = i;
                    break;
                }
            }
        wr.write(Integer.toString(result));
        wr.flush();
        wr.close();
    }
}