import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10950 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            StringTokenizer str = new StringTokenizer(br.readLine());
            System.out.println(Integer.parseInt(str.nextToken()) + Integer.parseInt(str.nextToken()));
        }
    }
}
