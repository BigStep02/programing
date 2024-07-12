import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B24511 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        Deque<Integer> dq = new LinkedList<>();
        StringTokenizer str = new StringTokenizer(br.readLine());
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(str.nextToken());
        }
        str = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            int temp = Integer.parseInt(str.nextToken());
            if(arr[i] == 0){
                dq.add(temp);
            }
        }
        int m = Integer.parseInt(br.readLine());
        str = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++){
            int temp = Integer.parseInt(str.nextToken());
            dq.addFirst(temp);
            wr.write((dq.pollLast() + " "));
        }
        wr.flush();
        wr.close();
    }
}