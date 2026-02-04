public class largestNumber {
    public static void main(String[] args) {
        int arr[]={1,11,12,22,32,1111};
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}
