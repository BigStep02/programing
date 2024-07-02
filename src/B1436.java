import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1436 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String name = "666";
        int change = 0;
        int result = 0;
        while(true){
            if(name.contains("666")){
                result++;
            }
            if(result == n) break;
            change = Integer.parseInt(name);
            change++;
            name = Integer.toString(change);
        }
        System.out.println(name);
    }
}