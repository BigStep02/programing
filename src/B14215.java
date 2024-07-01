import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B14215 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int[] num = new int[3];
        int max = Integer.MIN_VALUE;
        int temp = 0;
        for(int i = 0; i < 3; i++){
            num[i] = Integer.parseInt(str.nextToken());
            if(num[i] > max) max = num[i];
            temp += num[i];
        }
        temp -= max;
        while(true){
            if(max < temp){
                System.out.println(temp + max);
                break;
            }
            max--;
        }
    }
}