import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(str.nextToken());
        int y = Integer.parseInt(str.nextToken());
        int w = Integer.parseInt(str.nextToken());
        int h = Integer.parseInt(str.nextToken());
        int result = x;
        w -= x;
        h -= y;
        if (result > y) result = y;
        if (result > w) result = w;
        if (result > h) result = h;
        System.out.println(result);
    }
}