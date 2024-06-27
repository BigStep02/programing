import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        char[] c = word.toCharArray();
        int[] Apbcount;
        int[] apbcount;
        Apbcount = new int[26];
        apbcount = new int[26];
        String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] Apb = new char[26];
        for (int i = 0; i < Alphabet.length(); i++) {
            Apb[i] = Alphabet.charAt(i);
        }
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] apb = new char[26];
        for (int i = 0; i < alphabet.length(); i++) {
            apb[i] = alphabet.charAt(i);
        }
        for(int i = 0; i < word.length(); i++){
            if(65 <= c[i] && c[i] <= 90){
                c[i] -= 65;
                Apbcount[c[i]]++;
            }
            if(97 <= c[i] && c[i] <= 122){
                c[i] -= 97;
                apbcount[c[i]]++;
            }
        }
        int result = 0;
        int temp = 0;
        for(int i = 0; i < 26; i++){
            Apbcount[i] += apbcount[i];
            if(Apbcount[i] > result){
                result = Apbcount[i];
                temp = i;
            }
        }
        int countmax = 0;
        for(int i = 0; i < 26; i++){
            if(Apbcount[i] == result){
                countmax++;
                if(countmax == 2){
                    System.out.println('?');
                    return;
                }
            }
        }
        System.out.println(Apb[temp]);
    }
}