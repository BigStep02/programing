import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class B10815 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashSet<Integer> numcard1 = new HashSet<>();
        StringTokenizer str = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            numcard1.add(Integer.parseInt(str.nextToken()));
        }
        int m = Integer.parseInt(br.readLine());
        HashSet<Integer> numcard2 = new HashSet<>();
        int[] result = new int[m];
        str = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++){
            result[i] = Integer.parseInt(str.nextToken());
        }
        for(int i = 0; i < result.length; i++){
            numcard2.add(result[i]);
        }
        numcard1.retainAll(numcard2);
        for(int i = 0; i < result.length; i++){
           if(numcard1.contains(result[i])) {
               result[i] = 1;
           }
           else result[i] = 0;
           System.out.print(result[i] + " ");
        }
    }
}