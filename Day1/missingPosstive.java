public class missingPosstive {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int largest=arr[arr.length-1];
        int expectedSum=0,actualSum=0;
        for(int i=1;i<=largest;i++){
            expectedSum+=i;
        }
        for(int i=0;i<arr.length;i++){
            actualSum+=arr[i];
        }
        int missing=expectedSum-actualSum;
        System.out.print("Missing number : "+missing);
    }
}
