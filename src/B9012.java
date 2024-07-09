import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B9012 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Character> stc = new Stack<>();
        char[] chr;
        String str;
        boolean bool = true;
        for(int i = 0; i < n; i++){
            str = br.readLine();
            chr = str.toCharArray();
            for(int j = 0; j < chr.length; j++){
                if (chr[j] == '('){
                    stc.push(chr[j]);
                }
                else if(chr[j] == ')'){
                    if(!stc.empty()){
                        stc.pop();
                    }
                    else{
                        System.out.println("NO");
                        bool = false;
                        break;
                    }
                }
            }
            if(bool){
                if(stc.isEmpty()){
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }
            bool = true;
            stc.clear();
        }
    }
}