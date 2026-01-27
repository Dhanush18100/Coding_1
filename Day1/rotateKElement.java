package Day1;

import java.util.Arrays;

public class rotateKElement {
    public static void main(String[] args) {
        int arr[]={1,22,33,44,50};
        int k=2;
        int temp[]=new int[arr.length];
        int j=0;
        for(int i=k;i<arr.length;i++){
            temp[j++]=arr[i];
        }
        for(int i=0;i<k;i++){
            temp[j++]=arr[i];
        }

        System.out.println(Arrays.toString(temp));

    }
}
