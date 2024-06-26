import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10807 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] arr = new int[count];
        StringTokenizer str = new StringTokenizer(br.readLine());
        for(int i = 0; i < count; i++){
            arr[i] = Integer.parseInt(str.nextToken());
        }
        int temp = 0;
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < count; i++){
            if(arr[i] == num) temp++;
        }
        System.out.println(temp);
    }
}