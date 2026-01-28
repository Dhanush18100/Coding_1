

import java.util.ArrayList;
import java.util.List;

public class subarray{
    public static void main(String[] args) {
         int[] arr = {1, 4, 20, 3, 10, 5};
        int sum = 33;
        int start=0,currSum=0;
        for(int end=0;end<arr.length;end++){
            currSum+=arr[end];
        
        while(currSum>sum && start<=end){
            currSum-=arr[start];
            start++;
        }
        if(currSum==sum){
            List<Integer>result=new ArrayList<>();
            for(int i=start;i<=end;i++){
                result.add(arr[i]);
            }
            System.out.println(result);
            return;
        }
    }
         System.out.println("No subarray found");
    }
}