import java.io.*;
import java.util.*;

public class B2751 {

    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            num.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(num);
        Integer[] arr = num.toArray(new Integer[num.size()]);
        for(int i = 0; i < count; i++){
            System.out.println(arr[i]);
        }
    }
}