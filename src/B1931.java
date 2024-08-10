import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B1931 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] time = new int[n][2];
        StringTokenizer str;
        for(int i = 0; i < n; i++) {
            str = new StringTokenizer(br.readLine());
            time[i][0] = Integer.parseInt(str.nextToken());
            time[i][1] = Integer.parseInt(str.nextToken());
        }
        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]){
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });
        int result = 1;
        int temp = time[0][1];
        for(int i = 1; i < n; i++){
            if(temp > time[i][0]) continue;
            temp = time[i][1];
            result++;
        }
        System.out.println(result);
    }
}