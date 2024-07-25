import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11659 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());
        int[] num = new int[n];
        str = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            num[i] = Integer.parseInt(str.nextToken());
        }
        for(int i = 1; i < n; i++){
            num[i] = num[i - 1] + num[i];
        }
        for(int i = 0; i < m; i++){
            str = new StringTokenizer(br.readLine());
            int temp1 = Integer.parseInt(str.nextToken());
            int temp2 = Integer.parseInt(str.nextToken());
            if(temp1 == 1){
                System.out.println(num[temp2 - 1]);
            }
            else System.out.println(num[temp2 - 1] - num[temp1 - 2]);
        }
    }
}