import java.util.HashSet;

public class twoSum{
    public static void main(String[] args) {
         int[] arr = { 0, -1, 2, -3, 1 };
        int target = -2;
        
        if (two(arr, target))
            System.out.println("true");
        else
            System.out.println("false");
    }
    public static boolean two(int []arr,int target){
        HashSet<Integer>ans=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int complement=target-arr[i];
            if(ans.contains(complement)){
                return true;
            }
            ans.add(arr[i]);
        }
        return false;
    }
}