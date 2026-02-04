import java.util.Arrays;

public class reverserArray {
    public static void main(String[] args) {
        int arr[]={1,11,12,22,32,1111};
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }
        System.out.println(Arrays.toString(arr));
    }
}
