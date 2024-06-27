import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1018 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(str.nextToken());
        int M = Integer.parseInt(str.nextToken());
        int wbcount;
        int bwcount;
        int result = N * M;
        int temp = 0;

        String[] board = new String[N];
        for(int i = 0; i < N; i++){
            board[i] = br.readLine();
        }
        String[] bwcheck = new String[8];
        for(int i = 0; i < 8; i++){
            if(i % 2 == 0) bwcheck[i] = "BWBWBWBW";
            else bwcheck[i] = "WBWBWBWB";
        }
        String[] wbcheck = new String[8];
        for(int i = 0; i < 8; i++){
            if(i % 2 == 0) wbcheck[i] = "WBWBWBWB";
            else wbcheck[i] = "BWBWBWBW";
        }
        for(int i = 0; i < N - 7; i++){
            for(int j = 0; j < M - 7; j++){
                wbcount = 0;
                bwcount = 0;
                for(int x = 0; x < 8; x++){
                    for(int y = 0; y < 8; y++){
                        if(board[x + i].charAt(y + j) != bwcheck[x].charAt(y)) bwcount++;
                        if(board[x + i].charAt(y + j) != wbcheck[x].charAt(y)) wbcount++;
                    }
                }
                temp = Math.min(wbcount, bwcount);
                if(result > temp) result = temp;
            }
        }
        System.out.println(result);
    }
}