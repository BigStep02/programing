import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1316 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String wordcount;
        char[] word = new char[N];
        for(int i = 0; i < N; i++){
            wordcount = br.readLine();
            word = wordcount.toCharArray();

        }
    }
}
