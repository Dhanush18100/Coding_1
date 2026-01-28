public class bestTimeToBuySellStock {
    public static void main(String[] args) {
        int[] prices = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int arr[]){
        int n=arr.length;
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                res=Math.max(res, arr[j]-arr[i]);
            }
        }
        return res;
    }
}
