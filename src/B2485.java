import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2485 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] list1 = new int[n];
        int[] list2 = new int[n - 1];
        for(int i = 0; i < n; i++){
            list1[i] = (Integer.parseInt(br.readLine()));
            if(i >= 1){
                list2[i - 1] = list1[i] - list1[i - 1];
            }
        }
        int time = list2.length;
        int time2 = list2.length;
        int gdc = Integer.MAX_VALUE;
        for(int i = list2.length; i > 1; i--){
            int min = Math.min(list2[time - 1], list2[time2 - 2]);
            int max = Math.max(list2[time - 1], list2[time2 - 2]);
            int temp = 0;
            while(max % min != 0){
                temp = max % min;
                max = min;
                min = temp;
            }
            if(min < gdc) gdc = min;
            time2--;
            if(time2 < 2){
                time2 = list2.length;
                time--;
            }
        }

        int count = 0;
        int index = 0;
        for(int i = list1[0]; i < list1[list1.length - 1]; i += gdc) {
            if (i == list1[index]) {
                index++;
                continue;
            }
            count++;
        }
        System.out.println(count);
    }
}