import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class B9506 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        int i = 1;
        int result = 0;
        while(true){
            n = Integer.parseInt(br.readLine());
            ArrayList<Integer> list = new ArrayList<>();
            if(n == -1){
                break;
            }
            while(n > i){
                if(n % i == 0){
                    list.add(i);
                }
                i++;
            }
            for(int j = 0; j < list.size(); j++){
                result += list.get(j);
            }
            if(result == n){
                System.out.print(n + " = ");
                System.out.print(list.get(0));
                for(int j = 1; j < list.size(); j++){
                    System.out.print(" " + "+" + " " + list.get(j));
                }
                System.out.print("\n");
            }
            else if(result != n){
                System.out.println(n + " " + "is NOT perfect.");
            }
            result = 0;
            i = 1;
        }
    }
}