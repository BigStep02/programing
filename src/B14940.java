import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B14940 {
    static int[][] earth;
    static int[][] result;
    static int[] dx = new int[]{0, 1, 0, -1};
    static int[] dy = new int[]{1, 0, -1, 0};
    static Queue<Point> Q = new LinkedList<>();

    static void bfs(int n, int m){
        while(!Q.isEmpty()){
            Point P = Q.poll();
            for(int dist = 0; dist < 4; dist++){
                int nx = P.x + dx[dist];
                int ny = P.y + dy[dist];
                if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if(earth[nx][ny] != 1 || result[nx][ny] >= 0) continue;
                result[nx][ny] = result[P.x][P.y] + 1;
                Q.add(new Point(nx, ny));
            }
        }
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());
        earth = new int[n][m];
        result = new int[n][m];
        for(int i = 0; i < n; i++){
            str = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                earth[i][j] = Integer.parseInt(str.nextToken());
                if(earth[i][j] == 0) result[i][j] = 0;
                else result[i][j] = -1;

            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(earth[i][j] == 2){
                    Q.add(new Point(i, j));
                    result[i][j] = 0;
                    bfs(n, m);
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}