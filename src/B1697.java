import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B1697 {
    static int[] subin;
    static Queue<Integer> Q = new LinkedList<>();

    static void bfs(int n, int m){
        while(subin[m] == -1){
            int temp = Q.poll();

            for(int i : new int[]{temp - 1, temp + 1, 2 * temp}){
                if(i < 0 || i > 100000) continue;
                if(subin[i] != -1) continue;
                subin[i] = subin[temp] + 1;
                Q.add(i);
            }
        }
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());
        subin = new int[100002];
        Arrays.fill(subin, -1);
        Q.add(n);
        subin[n] = 0;
        bfs(n, m);
        System.out.println(subin[m]);
    }
}