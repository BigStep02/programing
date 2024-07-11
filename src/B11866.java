import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B11866 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        Deque<Integer> dq = new LinkedList<>();
        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());
        for(int i = 1; i <= n; i++){
            dq.add(i);
        }
        System.out.print("<");
        while(dq.size() != 1){
            for(int i = 0; i < m - 1; i++){
                if(!dq.isEmpty()){
                    dq.add(dq.remove());
                }
            }
            System.out.print(dq.remove() + "," + " ");
        }
        System.out.println(dq.remove() + ">");
    }
}