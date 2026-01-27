package Day1;

import java.util.Arrays;

public class rearrange {
    public static void main(String[] args) {
        int arr[]={-1, 3, -5, 6, -2, 4};
        int pos[]=new int[arr.length];
        int neg[]=new int[arr.length];
        int p=0,n=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                pos[p++]=arr[i];
            }else{
                neg[n++]=arr[i];
            }
        }
        int i=0,x=0,y=0;
        while(x<p && y<n){
            arr[i++]=pos[x++];
            arr[i++]=neg[y++];
        }
        while(x<p){
             arr[i++]=pos[x++];
        }
        while(y<n){
             arr[i++]=neg[y++];
        }
         System.out.println(Arrays.toString(arr));

    }
}
