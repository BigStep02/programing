import java.io.*;
import java.util.*;

public class B18258 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Deque<String> Q = new LinkedList<>();
        StringTokenizer str;
        int test = 0;
        for(int i = 0 ; i < n; i++){
            str = new StringTokenizer(br.readLine());
            String temp = str.nextToken();
            switch (temp){
                case "push":
                    Q.add(str.nextToken());
                    break;
                case "pop":
                    if(Q.isEmpty()) wr.write(-1 + "\n");
                    else wr.write(Q.remove() + "\n");
                    break;
                case "size":
                    wr.write((Q.size() + "\n"));
                    break;
                case "empty":
                    if(Q.isEmpty()) wr.write(1 + "\n");
                    else wr.write(0 + "\n");
                    break;
                case "front":
                    if(Q.isEmpty()) wr.write(-1 + "\n");
                    else wr.write(Q.peek() + "\n");
                    break;
                case "back":
                    if(Q.isEmpty()) wr.write(-1 + "\n");
                    else wr.write(Q.peekLast() + "\n");
            }
        }
        wr.flush();
        wr.close();
    }
}