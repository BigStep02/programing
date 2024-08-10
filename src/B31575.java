import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B31575 {
    static int n, m;
    static int[][] board;
    static boolean[][] bool;
    static int[] nx = new int[]{0, 1};
    static int[] ny = new int[]{1, 0};
    static Queue<Point> Q = new LinkedList<>();

    static void bfs(){
        while(!Q.isEmpty()){
            Point p = Q.poll();
            for(int dist = 0; dist < 2; dist++){
                int dx = p.x + nx[dist];
                int dy = p.y + ny[dist];
                if(dx < 0 || dx >= m || dy < 0 || dy >= n) continue;
                if(board[dx][dy] != 1 || !bool[dx][dy]) continue;
                bool[dx][dy] = false;
                Q.add(new Point(dx, dy));
            }
        }
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        n = Integer.parseInt(str.nextToken());
        m = Integer.parseInt(str.nextToken());
        board = new int[m][n];
        bool = new boolean[m][n];
        for(int i = 0; i < m; i++){
            str = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++){
                board[i][j] = Integer.parseInt(str.nextToken());
                bool[i][j] = true;
            }
        }
        Q.add(new Point(0, 0));
        bool[0][0] = false;
        bfs();
        if(bool[m - 1][n - 1]) System.out.println("No");
        else System.out.println("Yes");
    }
}
