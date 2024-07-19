import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1629 {
    public static long pow(int A, int B, int C){
        if(B == 0) return 1;
        else{
            long temp = pow(A, B / 2, C);
            if(B % 2 == 0){
                return temp * temp % C;
            }
            else return (temp * temp % C) * A % C;
        }
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(str.nextToken());
        int B = Integer.parseInt(str.nextToken());
        int C = Integer.parseInt(str.nextToken());
        System.out.println(pow(A, B, C));
    }
}