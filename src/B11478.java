import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class B11478 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        HashSet<String> Hset = new HashSet<>();
        int k = 0;
        for (int count = 0; count < word.length(); count++) {
            for (int i = count + 1; i <= word.length(); i++) {
                Hset.add(word.substring(count, i));
            }
        }
        System.out.println(Hset.size());
    }
}