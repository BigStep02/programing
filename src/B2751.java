import java.io.*;
import java.util.*;

public class B2751 {

    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());

        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            num.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(num);
        for(int i = 0; i < count; i++){
            sb.append(num.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}