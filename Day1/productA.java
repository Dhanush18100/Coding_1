import java.util.Arrays;

public class productA {
    public static void main(String[] args) {
        int arr[]={10, 3, 5, 6, 2};
        int res[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int product=1;
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    product*=arr[j];
                }
            }
            res[i]=product;
        }
        System.out.println(Arrays.toString(res));
    }
}
