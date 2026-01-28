public class maxProduct {
    public static void main(String[] args) {
        int arr[]={ -2, 6, -3, -10, 0, 2 };
        int res=arr[0];
        for(int i=0;i<arr.length;i++){
            int maxProd=1;
            for(int j=i;j<arr.length;j++){
                maxProd*=arr[j];

                res=Math.max(maxProd, res);
            }
        }
        System.out.println(res);
        
    }
}
