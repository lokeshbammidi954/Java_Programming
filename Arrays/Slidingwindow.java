package Java_Programming.Arrays;
import java.util.*;
public class Slidingwindow {
    public static void main(String[] args) {
        ArrayList<Integer> Result = new ArrayList<Integer>();
        int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int K = 3;
        int max_arr=0;
        for(int i=0;i<K;i++){
            max_arr+=arr[i];
        }
        int Slidingwin = max_arr;
        for(int j=K;j<arr.length;j++){
            Slidingwin = arr[j] - arr[j-K];
            
        }
        Result.add(Math.max(Slidingwin,max_arr));
        System.out.println(Result);
    }
}
