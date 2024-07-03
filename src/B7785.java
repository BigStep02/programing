import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B7785 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, String> map = new HashMap<>();
        StringTokenizer str;
        for(int i = 0; i < n; i++){
            str = new StringTokenizer(br.readLine());
            map.put(str.nextToken(), str.nextToken());
        }
        Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<String, String> entry = itr.next();
            if(entry.getValue().equals("leave")){
                itr.remove();
            }
        }
        Collection<String> values = map.keySet();
        String[] result = values.toArray(new String[map.size()]);
        Arrays.sort(result, Collections.reverseOrder());
        for(int i = 0; i < map.size(); i++){
            System.out.println(result[i]);
        }
    }
}