import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B10816 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] card1 = new int[n];
        StringTokenizer str = new StringTokenizer(br.readLine());;
        for(int i = 0; i < n; i++){
            card1[i] = Integer.parseInt(str.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        int[] card2 = new int[m];
        int[] result = new int[m];
        for(int i = 0; i < result.length; i++){
            result[i] = 0;
        }
        str = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> mycard = new HashMap<>();
        for(int i = 0; i < m; i++){
            card2[i] = Integer.parseInt(str.nextToken());
        }
        for(int i : card1){
            mycard.put(i, mycard.getOrDefault(i, 0) + 1);
        }
        for(int i = 0; i < m; i++){
            if(mycard.get(card2[i]) != null) {
                result[i] = mycard.get(card2[i]);
                System.out.print(result[i] + " ");
            }
            else {
                result[i] = 0;
                System.out.print(result[i] + " ");
            }
        }
    }
}