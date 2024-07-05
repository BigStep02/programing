import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1735 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int firstnum1 = Integer.parseInt(str.nextToken());
        int firstnum2 = Integer.parseInt(str.nextToken());
        str = new StringTokenizer(br.readLine());
        int secondnum1 = Integer.parseInt(str.nextToken());
        int secondnum2 = Integer.parseInt(str.nextToken());
        int max = Math.max(firstnum2, secondnum2);
        int min = Math.min(firstnum2, secondnum2);
        int temp;
        while(max % min != 0){
            temp = max % min;
            max = min;
            min = temp;
        }
        temp = firstnum2 * secondnum2 / min;
        firstnum1 *= temp / firstnum2;
        secondnum1 *= temp / secondnum2;
        int result = firstnum1 + secondnum1;

        int big = Integer.MAX_VALUE;
        int tmp;
        while(big > 1){
            max = Math.max(result, temp);
            min = Math.min(result, temp);
            while(max % min != 0){
                tmp = max % min;
                max = min;
                min = tmp;
            }
            big = min;
            if(min != 1){
                temp /= big;
                result /= big;
            }
            else if(min == Math.min(result, temp)){
                break;
            }
        }
        System.out.println(result + " " + temp);
    }
}