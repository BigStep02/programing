import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B1620 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());
        HashMap<String, Integer> strmap = new HashMap<>();
        HashMap<Integer, String> intmap = new HashMap<>();
        for(int i = 1; i <= n; i++){
            String temp = br.readLine();
            strmap.put(temp, i);
            intmap.put(i, temp);
        }
        for(int i = 0; i < m; i++){
            String temp = br.readLine();
            if('A' <= temp.charAt(0) && temp.charAt(0) <= 'Z' ){
                System.out.println(strmap.get(temp));
            }
            else System.out.println(intmap.get(Integer.parseInt(temp)));
        }
    }
}