import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class B10610 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        ArrayList<Character> list = new ArrayList<>();
        Integer[] num = new Integer[S.length()];
        int max = 0;
        for(int i = 0; i < S.length(); i++){
            list.add(S.charAt(i));
            int temp = list.get(i) - '0';
            num[i] = temp;
            max += temp;
        }
        Arrays.sort(num, Collections.reverseOrder());
        if(list.contains('0') && max % 3 == 0){
            for(int i = 0; i < num.length; i++){
                System.out.print(num[i]);
            }
        }
        else System.out.println(-1);
    }
}
