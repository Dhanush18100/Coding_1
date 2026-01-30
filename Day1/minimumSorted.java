public class minimumSorted {
    public static void main(String[] args) {
         int[] arr = {5, 6, 1, 2, 3, 4};
        System.out.println(min(arr));
    }
    public static int min(int []arr){
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
             res=Math.min(res,arr[i]);
        }
        return res;
    }
}
