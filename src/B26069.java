import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B26069 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> Map = new HashMap<>();
        String word;
        String word2;
        StringTokenizer str;
        boolean bool = true;
        for(int i = 0; i < n; i++){
            str = new StringTokenizer(br.readLine());
            word = str.nextToken();
            word2 = str.nextToken();
            if(word.equals("ChongChong") || word2.equals("ChongChong")){
                    bool = false;
                    Map.put(word2, i);
                    Map.put(word, i);
                    continue;
            }
            if(!bool){
                if(Map.containsKey(word) || Map.containsKey(word2)){
                    Map.put(word2, i);
                    Map.put(word, i);
                }
            }
        }
        System.out.println(Map.size());
    }
}