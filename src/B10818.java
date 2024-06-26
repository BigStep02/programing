import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10818 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] arr = new int[count];
        StringTokenizer str = new StringTokenizer(br.readLine());
        int min = 0;
        int max = 0;
        for (int i = 0; i < count; i++) {
            arr[i] = Integer.parseInt(str.nextToken());
        }
        min = arr[0];
        max = arr[0];
        for (int i = 0;  i < count; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
            if(max < arr[i]){
                max = arr[i];
            }
        }
        br.close();
        System.out.println(min + " " + max);
    }
}