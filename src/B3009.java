import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3009 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str;
        int[] xresult = new int[3];
        int[] yresult = new int[3];
        int xtemp = 0;
        int ytemp = 0;
        for(int i = 0; i < 3; i++){
            str = new StringTokenizer(br.readLine());
            xresult[i] = Integer.parseInt(str.nextToken());
            yresult[i] = Integer.parseInt(str.nextToken());
        }
        for(int i = 0; i < 3; i++){
            for(int j = i + 1; j < 3; j++){
                if(xresult[i] == xresult[j]) {
                    xresult[i] = 0;
                    xresult[j] = 0;
                };
                if(yresult[i] == yresult[j]){
                    yresult[i] = 0;
                    yresult[j] = 0;
                }
            }
        }
        for(int i = 0; i < 3; i++){
            xtemp += xresult[i];
            ytemp += yresult[i];
        }
        System.out.print(xtemp + " ");
        System.out.println(ytemp);
    }
}