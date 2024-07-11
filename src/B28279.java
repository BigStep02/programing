import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B28279 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer str;
        Deque<Integer> dq = new LinkedList<>();
        for(int i = 0; i < n; i++){
            str = new StringTokenizer(br.readLine());
            switch (str.nextToken()){
                case "1":
                    dq.addFirst(Integer.parseInt(str.nextToken()));
                    break;
                case "2":
                    dq.addLast(Integer.parseInt(str.nextToken()));
                    break;
                case "3":
                    if(dq.isEmpty()) System.out.println(-1);
                    else System.out.println(dq.removeFirst());
                    break;
                case "4":
                    if(dq.isEmpty()) System.out.println(-1);
                    else System.out.println(dq.removeLast());
                    break;
                case "5":
                    System.out.println(dq.size());
                    break;
                case "6":
                    if(dq.isEmpty()) System.out.println(1);
                    else System.out.println(0);
                    break;
                case "7":
                    if(dq.isEmpty()) System.out.println(-1);
                    else System.out.println(dq.peek());
                    break;
                case "8":
                    if(dq.isEmpty()) System.out.println(-1);
                    else System.out.println(dq.peekLast());
                    break;
            }
        }
    }
}