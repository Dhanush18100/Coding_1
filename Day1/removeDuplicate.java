import java.util.HashSet;

public class removeDuplicate {
    public static void main(String[] args) {
        String str="hello world!";
        str.toLowerCase();
        String result="";
        HashSet<Character>ans=new HashSet<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!ans.contains(ch)){
                ans.add(ch);
                result+=ch;
            }
        }
        System.out.println(result);
        // String ans="";
        // for(int i=0;i<str.length();i++){
        //     char ch=str.charAt(i);
        //       if (!ans.contains(String.valueOf(ch))){
        //         ans+=ch;
        //     }
        // }
        // System.err.println(ans);

    }
}
