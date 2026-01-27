package Day1;

import java.util.Arrays;

public class secondLargest {
    public static void main(String[] args) {
        int arr[] = { 1,11,11,11 };
        Arrays.sort(arr);
        int largest=arr[arr.length-1];
        int secondLargestElement=-1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]!=largest){
                secondLargestElement=arr[i];
                break;
            }
        }
        System.out.println("Second largest element : "+secondLargestElement);
    }
}
