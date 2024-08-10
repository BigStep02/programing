import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B2178 {
    static Queue<Point> Q = new LinkedList<>();
    static int[][] newboard;
    static char[][] board;
    static int[] nx = new int[]{0, 1, 0, -1};
    static int[] ny = new int[]{1, 0, -1, 0};

    static void check(int n, int m){
        Q.add(new Point(0, 0));
        newboard[0][0] = 0;
        while(!Q.isEmpty()){
            Point p = Q.poll();
            for(int dist = 0; dist < 4; dist++){
                int dx = p.x + nx[dist];
                int dy = p.y + ny[dist];
                if(dx < 0 | dx >= n | dy < 0 | dy >= m) continue;
                if(newboard[dx][dy] >= 0 || board[dx][dy] != '1') continue;
                newboard[dx][dy] = newboard[p.x][p.y] + 1;
                Q.add(new Point(dx, dy));
            }
        }
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());
        newboard = new int[n][m];
        board = new char[n][m];
        for(int i = 0; i < n; i++){
            String S = br.readLine();
            for(int j = 0; j < m; j++){
                board[i][j] = S.charAt(j);
                newboard[i][j] = -1;
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(board[i][j] == '1' || newboard[i][j] >= 0){
                    check(n, m);
                }
            }
        }
        System.out.println(newboard[n - 1][m - 1] + 1);
    }
}