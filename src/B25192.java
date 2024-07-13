import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class B25192 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> Map = new HashMap<>();
        String str;
        int result = 0;
        for(int i = 0; i < n; i++){
            str = br.readLine();
            if(str.equals("ENTER")){
                result += Map.size();
                Map.clear();
                continue;
            }
            Map.put(str, i);
        }
        result += Map.size();
        System.out.println(result);
    }
}