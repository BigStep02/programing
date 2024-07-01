import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10101 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] n = new int[3];
        int temp = 0;
        for(int i = 0; i < n.length; i++){
            n[i] = Integer.parseInt(br.readLine());
        }
        for(int i = 0; i < n.length; i++){
            temp += n[i];
        }
        if(temp != 180){
            System.out.println("Error");
        }
        if(temp == 180){
            if(n[0] == 60 && n[1] == 60) System.out.println("Equilateral");
            for(int i = 0; i < n.length; i++){
                for(int j = i + 1; j < n.length; j++){
                    if(n[i] != 60 && n[i] == n[j]){
                        System.out.println("Isosceles");
                        break;
                    }
                }
            }
            if(n[0] != n[1] && n[0] != n[2]){
                if(n[1] != n[2]) System.out.println("Scalene");
            }
        }
    }
}