import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B10773 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stc = new Stack<>();
        int result = 0;
        int temp;
        for(int i = 0; i < n; i++){
            temp = Integer.parseInt(br.readLine());
            if(temp > 0){
                stc.push(temp);
                result += temp;
            }
            else result -= stc.pop();
        }
        System.out.println(result);
    }
}
