import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B4963 {
    static int[] dx = new int[]{0, 1, 0, -1, -1, -1, 1, 1};
    static int[] dy = new int[]{1, 0, -1, 0, -1, 1, -1, 1};
    static Queue<Point> Q = new LinkedList<>();

    static void bfs(int m, int n, boolean[][] landcheck, int[][] land){
        while(!Q.isEmpty()){
            Point P = Q.poll();
            for(int dist = 0; dist < 8; dist++){
                int nx = P.x + dx[dist];
                int ny = P.y + dy[dist];
                if(nx < 0 || nx >= m || ny < 0 || ny >= n) continue;
                if(!landcheck[nx][ny] || land[nx][ny] == 0) continue;
                landcheck[nx][ny] = false;
                Q.add(new Point(nx, ny));
            }
        }
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str;
        while(true){
            str = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(str.nextToken());
            int m = Integer.parseInt(str.nextToken());
            if(n == 0 && m == 0) break;

            int[][] land = new int[m][n];
            for(int i = 0; i < m; i++){
                str = new StringTokenizer(br.readLine());
                for(int j = 0; j < n; j++){
                    land[i][j] = Integer.parseInt(str.nextToken());
                }
            }

            boolean[][] landcheck = new boolean[m][n];
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    landcheck[i][j] = true;
                }
            }

            int count = 0;

            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    if(land[i][j] == 1 && landcheck[i][j]){
                        Q.add(new Point(i, j));
                        landcheck[i][j] = false;
                        count++;
                        bfs(m, n, landcheck, land);
                    }
                }
            }
            System.out.println(count);
        }
    }
}