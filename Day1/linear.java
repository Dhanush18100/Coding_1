public class linear {
    public static void main(String[] args) {
        int arr[]={1,11,12,22,32,1111};
        int key=22;
        for(int  i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println(i);
                break;
            }
        }
    }
}
