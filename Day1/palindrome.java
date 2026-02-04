public class palindrome {
    public static void main(String[] args) {
        int n=121;
        int original=n;
        int rev=0;
        while(n>0){
            int temp=n%10;
            rev=rev*10+temp;
            n/=10;
        }
        if(original==rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
