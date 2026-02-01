public class maxCount {
    public static void main(String[] args) {
        String s = "aaaabbaaccde";
        System.out.println(maxRepeating(s));
    }

    static char maxRepeating(String s) {
        int n = s.length();
        int maxCnt = 0;
        char res = s.charAt(0);
        for(int i=0;i<s.length();i++){
            int count=0;
            for(int j=i;j<n;j++){
                if(s.charAt(i)!=s.charAt(j))
                    break;
                count++;
            }
            if(count>maxCnt){
                maxCnt=count;
                res=s.charAt(i);
            }
        }
        return res;
    }
        
}
