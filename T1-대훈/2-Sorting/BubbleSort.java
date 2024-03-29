import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BubbleSort {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i=0; i<n; i++) {
            for(int j=0; j<n-i-1; j++) {
                if(arr[j] > arr [j+1]) {
                    int rpl = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = rpl;
                }
            }
        }
        for(int number: arr) {
            System.out.printf("%d ", number);
        }

    }
}