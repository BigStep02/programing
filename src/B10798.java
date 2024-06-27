import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10798 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] apb;
        apb = new String[15][15];
        int numline = 0;
        for(int i = 0; i < 15; i++){
                String line = br.readLine();
                if(line == null || line.isEmpty()){
                    break;
            }
                numline++;
                for(int j = 0; j < line.length(); j++){
                    apb[i][j] = String.valueOf(line.charAt(j));
                }
        }
        for(int i = 0; i < 15; i++){
            for(int j = 0; j < numline; j++){
                if(apb[j][i] != null){
                    System.out.print(apb[j][i]);
                }
            }
        }
    }
}
