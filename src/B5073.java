import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B5073 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] n = new int[3];
        StringTokenizer str;
        int max = Integer.MIN_VALUE;
        int temp = 0;
        while(true){
            str = new StringTokenizer(br.readLine());
            for(int i = 0; i < n.length; i++){
                n[i] = Integer.parseInt(str.nextToken());
                temp += n[i];
                if(n[i] > max) max = n[i];
            }
            temp -= max;
            if(n[0] == 0 && n[1] == 0 && n[2] == 0) break;
            else if(n[0] == n[1] && n[0] == n[2] && n[1] == n[2]){
                System.out.println("Equilateral");
            }
            else if(n[0] == n[1] && n[0] != n[2] && n[1] != n[2]){
                if(temp <= max){
                    System.out.println("Invalid");
                    max = Integer.MIN_VALUE;
                    temp = 0;
                    continue;
                }
                System.out.println("Isosceles");
            }
            else if(n[0] == n[2] && n[0] != n[1] && n[1] != n[2]){
                if(temp <= max){
                    System.out.println("Invalid");
                    max = Integer.MIN_VALUE;
                    temp = 0;
                    continue;
                }
                System.out.println("Isosceles");
            }
            else if(n[0] != n[1] && n[1] == n[2] && n[0] != n[2]){
                if(temp <= max){
                    System.out.println("Invalid");
                    max = Integer.MIN_VALUE;
                    temp = 0;
                    continue;
                }
                System.out.println("Isosceles");
            }
            else if(n[0] != n[1] && n[0] != n[2] && n[1] != n[2]){
                if(temp <= max){
                    System.out.println("Invalid");
                    max = Integer.MIN_VALUE;
                    temp = 0;
                    continue;
                }
                else System.out.println("Scalene");
            }
            max = Integer.MIN_VALUE;
            temp = 0;
        }
    }
}