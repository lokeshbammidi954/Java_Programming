package Java_Programming.SortingConcept;
import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The size of the Array : ");
        int size =sc.nextInt();
        System.out.println("Enter The Elements into Array : ");
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int n = arr.length;
        //Selection Sort
        for(int i=0;i<n-1;i++){
            int smallest = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[smallest]){
                    smallest = j;
                }
            }
            int temp =arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }


        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
