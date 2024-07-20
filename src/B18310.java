import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B18310 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] temp = new int[n];
        StringTokenizer str = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            temp[i] = Integer.parseInt(str.nextToken());
        }
        int arr = Integer.MAX_VALUE;
        int result = 0;
        int index = 0;
        Arrays.sort(temp);
        for(int i = 1; i <= temp[temp.length - 1]; i++) {
            for (int j = 0; j < temp.length - 1; j++) {
                if(i < temp[j]){
                    result += temp[j] - i;
                    continue;
                }
                result += i - temp[j];
            }
            if(result < arr){
                arr = result;
                index = i;
            }
            result = 0;
        }
        System.out.println(index);
    }
}
