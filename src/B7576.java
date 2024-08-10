import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B7576 {
    static int[][] tomato;
    static int[][] temp;
    static int[] nx = new int[]{0, 1, 0, -1};
    static int[] ny = new int[]{1, 0, -1, 0};
    static Queue<Point> Q = new LinkedList<>();

    static void check(int n, int m){
        while(!Q.isEmpty()){
            Point p = Q.poll();
            for(int dist = 0; dist < 4; dist++){
                int dx = p.x + nx[dist];
                int dy = p.y + ny[dist];
                if(dx < 0 || dx >= m || dy < 0 || dy >= n) continue;
                if(temp[dx][dy] >= 0) continue;
                temp[dx][dy] = temp[p.x][p.y] + 1;
                Q.add(new Point(dx, dy));
            }
        }
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());
        tomato = new int[m][n];
        temp = new int[m][n];
        for(int i = 0; i < m; i++){
            str = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++){
                tomato[i][j] = Integer.parseInt(str.nextToken());
                if(tomato[i][j] == 1) Q.add(new Point(i, j));
                if(tomato[i][j] == 0) temp[i][j] = -1;
            }
        }
        check(n, m);
        int result = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(temp[i][j] == -1){
                    result = -1;
                    break;
                }
                else if(temp[i][j] > result) result = temp[i][j];
            }
            if(result == -1) break;
        }
        System.out.println(result);
    }
}
