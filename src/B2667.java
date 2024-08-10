import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B2667 {
    static char[][] house;
    static boolean[][] bool;
    static int[] dx = new int[]{0, 1, 0, -1};
    static int[] dy = new int[]{1, 0, -1, 0};
    static ArrayList<Integer> list = new ArrayList<>();
    static Queue<Point> Q = new LinkedList<>();

    static void bfs(int n){
        int count = 0;
        while(!Q.isEmpty()){
            Point P = Q.poll();
            for(int dist = 0; dist < 4; dist++){
                int nx = P.x + dx[dist];
                int ny = P.y + dy[dist];
                if(nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
                if(house[nx][ny] != '1' || !bool[nx][ny]) continue;
                bool[nx][ny] = false;
                Q.add(new Point(nx, ny));
                count++;
            }
        }
        list.add(count);
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        house = new char[n][n];
        bool = new boolean[n][n];

        for(int i = 0; i < n; i++){
            String S = br.readLine();
            for(int j = 0; j < n; j++){
                house[i][j] = S.charAt(j);
                bool[i][j] = true;
            }
        }
        int count = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(house[i][j] == '1' && bool[i][j]){
                    Q.add(new Point(i, j));
                    bool[i][j] = false;
                    count++;
                    bfs(n);
                }
            }
        }
        Collections.sort(list);
        System.out.println(count);
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + 1);
        }
    }
}