import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> Dq = new LinkedList<>();
        for(int i = 1; i <= n; i++){
            Dq.add(i);
        }
        while(Dq.size() != 1){
            if(!Dq.isEmpty()) {
                Dq.remove();
                Dq.add(Dq.remove());
            }
        }
        int result = Dq.remove();
        System.out.println(result);
    }
}