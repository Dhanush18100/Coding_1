package Day1;

public class majorityElement {
    public static void main(String[] args) {
        int arr[]={2, 2, 1, 2, 3, 2, 2};
        int n=arr.length;
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>n/2){
                System.out.println(arr[i]);
            }
        }
    }
}
