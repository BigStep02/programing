import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1292 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());
        int[] num = new int[1000];
        int countzero = 0;
        int count = 1;
        for(int i = 0; i < 1000; i++){
            num[i] = count;
            countzero++;
            if(countzero == count){
                countzero = 0;
                count++;
            }
        }
        int result = 0;
        for(int i = n - 1; i < m; i++){
            result += num[i];
        }
        System.out.println(result);
    }
}
