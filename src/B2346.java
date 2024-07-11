import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;;
import java.util.StringTokenizer;

public class B2346 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();
        int[] check = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            dq.add(i);
        }
        StringTokenizer str = new StringTokenizer(br.readLine());
        for (int i = 1; i < check.length; i++) {
            check[i] = Integer.parseInt(str.nextToken());
        }
        int temp = 1;
        System.out.print(1 + " ");
        while (!dq.isEmpty()) {
            int count = check[temp];
            if (count > 0) {
                for (int i = 0; i < count - 1; i++) {
                    dq.addLast(dq.removeFirst());
                }
                temp = dq.removeFirst();
            }
            else{
                for (int i = count + 1; i < 0; i++) {
                    dq.addFirst(dq.removeLast());
                }
                temp = dq.removeLast();
            }
            System.out.print(temp + " ");
        }
    }
}