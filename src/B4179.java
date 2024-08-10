import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B4179 {
    static char[][] c;
    static int[][] human, fire;
    static int[] dx = new int[]{0, 1, 0, -1};
    static int[] dy = new int[]{1, 0, -1, 0};
    static Queue<Point> humanQ = new LinkedList<>();
    static Queue<Point> fireQ = new LinkedList<>();

    static void firecheck(int n, int m){
        while(!fireQ.isEmpty()){
            Point P = fireQ.poll();
            for(int dist = 0; dist < 4; dist++){
                int nx = P.x + dx[dist];
                int ny = P.y + dy[dist];
                if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if(fire[nx][ny] >= 0 || c[nx][ny] == '#') continue;
                fire[nx][ny] = fire[P.x][P.y] + 1;
                fireQ.add(new Point(nx, ny));
            }
        }
    }

    static void humancheck(int n, int m){
        while(!humanQ.isEmpty()){
            Point P = humanQ.poll();
            for(int dist = 0; dist < 4; dist++){
                int nx = P.x + dx[dist];
                int ny = P.y + dy[dist];
                if(nx < 0 || nx >= n || ny < 0 || ny >= m){
                    System.out.println(human[P.x][P.y] + 1);
                    return;
                }
                if(human[nx][ny] >= 0 || c[nx][ny] == '#') continue;
                if(fire[nx][ny] != -1 && fire[nx][ny] <= human[P.x][P.y] + 1) continue;
                human[nx][ny] = human[P.x][P.y] + 1;
                humanQ.add(new Point(nx, ny));
            }
        }
        System.out.println("IMPOSSIBLE");
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());
        c = new char[n][m];
        human = new int[n][m];
        fire = new int[n][m];
        for(int i = 0; i < n; i++){
            String S = br.readLine();
            for(int j = 0; j < m; j++){
                c[i][j] = S.charAt(j);
                human[i][j] = -1;
                fire[i][j] = -1;
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(c[i][j] == 'J'){
                    humanQ.add(new Point(i, j));
                    human[i][j] = 0;
                }
                if(c[i][j] == 'F'){
                    fireQ.add(new Point(i, j));
                    fire[i][j] = 0;
                }
            }
        }
        firecheck(n, m);
        humancheck(n, m);
    }
}