import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B9063 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer str;
        int result = 0;
        int x = 0;
        int y = 0;
        int xmax = Integer.MIN_VALUE;
        int xmin = Integer.MAX_VALUE;
        int ymax = Integer.MIN_VALUE;
        int ymin = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            str = new StringTokenizer(br.readLine());
            x = Integer.parseInt(str.nextToken());
            y = Integer.parseInt(str.nextToken());
            if(xmax < x) xmax = x;
            if(xmin > x) xmin = x;
            if(ymax < y) ymax = y;
            if(ymin > y) ymin = y;
        }
        if(n >= 2){
            if(xmin < 0 && xmax > 0){
                if(ymin > 0){
                    xmin *= -1;
                    result = (xmin + xmax) * (ymax - ymin);
                }
                if(ymin < 0 && ymax > 0){
                    xmin *= -1;
                    ymin *= -1;
                    result = (xmin + xmax) * (ymin + ymax);
                }
                if(ymax < 0){
                    xmin *= -1;
                    ymin *= -1;
                    ymax *= -1;
                    result = (xmin + xmax) * (ymin - ymax);
                }
            }
            else if(ymin < 0 && ymax > 0){
                if(xmin > 0){
                    ymin *= -1;
                    result = (xmax - xmin) * (ymax + ymin);
                }
                if(xmax < 0){
                    ymin *= -1;
                    xmin *= -1;
                    xmax *= -1;
                    result = (xmin - xmax) * (ymin + ymax);
                }
            }
            else result = (xmax - xmin) * (ymax - ymin);
        }
        System.out.println(result);
    }
}