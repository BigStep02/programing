import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B1926 {
    static int[][] board;
    static boolean[][] bool;
    static int[] dx = new int[]{1, 0, -1, 0};
    static int[] dy = new int[]{0, 1, 0, -1};
    static Queue<Point> Q = new LinkedList<>();
    static int psize = 0;

    static void check(int i, int j, int n, int m){
        Q.add(new Point(i, j));
        int temp = 0;
        while(!Q.isEmpty()) {
            Point p = Q.poll();
            temp++;
            for(int dir = 0; dir < 4; dir++){
                int nx = p.x + dx[dir];
                int ny = p.y + dy[dir];
                if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if(!bool[nx][ny] || board[nx][ny] != 1) continue;
                bool[nx][ny] = false;
                Q.add(new Point(nx,ny));
            }
        }
        if(temp > psize) psize = temp;
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());
        int pcount = 0;
        board = new int[n][m];
        bool = new boolean[n][m];

        for(int i = 0; i < n; i++){
            str = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                board[i][j] = Integer.parseInt(str.nextToken());
                bool[i][j] = true;
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(board[i][j] == 1 && bool[i][j]){
                    bool[i][j] = false;
                    pcount++;
                    check(i, j, n, m);
                }
            }
        }
        System.out.println(pcount);
        System.out.println(psize);
    }
}