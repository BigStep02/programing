import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B12789 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stc = new Stack<>();
        StringTokenizer str = new StringTokenizer(br.readLine());
        int count = 1;
        for(int i = 0; i < n; i++){
            int temp = Integer.parseInt(str.nextToken());
            if(temp == count){
                count++;
                continue;
            }
            while(true) {
                if (!stc.empty() && stc.get(stc.size() - 1) == count) {
                    stc.pop();
                    count++;
                }
                else break;
            }
            stc.push(temp);
        }
        if(!stc.empty()) {
            for (int i = count; i <= n; i++) {
                if (i == stc.get(stc.size() - 1)) {
                    stc.pop();
                }
            }
        }
        if(stc.empty()) System.out.println("Nice");
        else System.out.println("Sad");
    }
}