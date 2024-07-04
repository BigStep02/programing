import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B1764 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());
        HashSet<String> name1 = new HashSet<>();
        for(int i = 0; i < n; i++){
            name1.add(br.readLine());
        }
        HashSet<String> name2 = new HashSet<>();
        for(int i = 0; i < m; i++){
            name2.add(br.readLine());
        }
        name1.retainAll(name2);
        String[] result = name1.toArray(new String[name1.size()]);
        Arrays.sort(result);
        System.out.println(result.length);
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}