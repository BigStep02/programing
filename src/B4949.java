import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B4949 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stc = new Stack<>();
        String str;
        char[] chr;
        boolean bool = true;
        while(true){
            str = br.readLine();
            if(str.equals(".")) break;
            chr = str.toCharArray();
            for(int i = 0; i < chr.length; i++){
                if(chr[i] == '('){
                    stc.push(chr[i]);
                }
                if(chr[i] == ')'){
                    if(!stc.empty()){
                        if(stc.peek() == '['){
                            System.out.println("no");
                            bool = false;
                            break;
                        }
                        stc.pop();
                    }
                    else{
                        System.out.println("no");
                        bool = false;
                        break;
                    }
                }
                if(chr[i] == '['){
                    stc.push(chr[i]);
                }
                if(chr[i] == ']'){
                    if(!stc.empty()){
                        if(stc.peek() == '('){
                            System.out.println("no");
                            bool = false;
                            break;
                        }
                        stc.pop();
                    }
                    else{
                        System.out.println("no");
                        bool = false;
                        break;
                    }
                }
            }
            if(bool){
                if(stc.empty()){
                    System.out.println("yes");
                }
                else System.out.println("no");
            }
            bool = true;
            stc.clear();
        }
    }
}