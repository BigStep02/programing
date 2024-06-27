import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B25206 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str;
        String[] name = new String[20];
        float[] score = new float[20];
        String[] scorename = new String[20];
        float allscore = 0;
        float result = 0;
        for(int i = 0; i < 20; i++){
            str = new StringTokenizer(br.readLine());
            name[i] = str.nextToken();
            score[i] = Float.parseFloat(str.nextToken());
            scorename[i] = str.nextToken();
            allscore += score[i];
            if("P".equals(scorename[i])){
                allscore -= score[i];
            }
            else if("F".equals(scorename[i])){
                result += (float) (score[i] * 0.0);
            }
            else if("D0".equals(scorename[i])){
                result += score[i];
            }
            else if("D+".equals(scorename[i])){
                result += (float) (score[i] * 1.5);
            }
            else if("C0".equals(scorename[i])){
                result += (float) (score[i] * 2.0);
            }
            else if("C+".equals(scorename[i])){
                result += (float) (score[i] * 2.5);
            }
            else if("B0".equals(scorename[i])){
                result += (float) (score[i] * 3.0);
            }
            else if("B+".equals(scorename[i])){
                result += (float) (score[i] * 3.5);
            }
            else if("A0".equals(scorename[i])){
                result += (float) (score[i] * 4.0);
            }
            else result += (float) (score[i] * 4.5);
        }
        result /= allscore;
        System.out.println(result);
    }
}