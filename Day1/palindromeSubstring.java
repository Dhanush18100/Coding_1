public class palindromeSubstring {
    public static void main(String[] args) {
        String s = "abaab";
        System.out.println(countPS(s));
        
    }
    public static boolean isPalindrome(String s, int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static int countPS(String s) {
        int n = s.length();
        int res=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<n;j++){
                if(isPalindrome(s, i, j)){
                    res++;
                }
            }
        }
        return res;
    }
}
