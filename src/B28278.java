import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B28278 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer str;
        Stack<Integer> stc = new Stack<>();
        for(int i = 0; i <n; i++){
            str = new StringTokenizer(br.readLine());
            switch (Integer.parseInt(str.nextToken())){
                case 1:
                    stc.push(Integer.parseInt(str.nextToken()));
                    break;
                case 2:
                    if(stc.size() > 0) System.out.println(stc.pop());
                    else System.out.println(-1);
                    break;
                case 3:
                    System.out.println(stc.size());
                    break;
                case 4:
                    if(stc.size() == 0) System.out.println(1);
                    else System.out.println(0);
                    break;
                case 5:
                    if(stc.size() > 0) System.out.println(stc.peek());
                    else System.out.println(-1);
                    break;
            }
        }
    }
}
