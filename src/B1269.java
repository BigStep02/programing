import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class B1269 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(str.nextToken());
        int m = Integer.parseInt(str.nextToken());
        HashSet<Integer> list1 = new HashSet<>();
        HashSet<Integer> list2 = new HashSet<>();
        HashSet<Integer> temp = new HashSet<>();
        str = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            int temp1 = Integer.parseInt(str.nextToken());
            list1.add(temp1);
            temp.add(temp1);
        }
        str = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++){
            list2.add(Integer.parseInt(str.nextToken()));
        }
        list1.removeAll(list2);
        list2.removeAll(temp);
        System.out.println(list1.size() + list2.size());
    }
}