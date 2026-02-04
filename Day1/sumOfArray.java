public class sumOfArray {
    public static void main(String[] args) {
        int arr[]={1,11,12,22,32,1111};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
