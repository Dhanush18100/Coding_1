public class maxSubArray {
    public static void main(String[] args) {
        int arr[]={2, 3, -8, 7, -1, 2, 3};
        int res=arr[0];
        for(int i=0;i<arr.length;i++){
            int currentSum=0;
            for(int j=i;j<arr.length;j++){
                currentSum+=arr[j];

                res=Math.max(currentSum, res);
            }
        }
        System.out.println(res);
    }
}
