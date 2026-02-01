import java.util.Stack;

public class balanceParanthesis {
    public static void main(String[] args) {
        String str = "()(())()";
        if (check(str) == 0) {
            System.out.println("Invalid");
        }
        else {
            System.out.println("Valid");
        }
        
    }
    public static int check(String str){
        Stack<Character>s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('){
                s.push(ch);
            }else if(ch==')'){
                if(s.isEmpty()){
                    return 0;
                }else{
                    char p=s.peek();
                    if(p=='('){
                        s.pop();
                    }else{
                        return 0;
                    }
                }
            }
        }
        if(s.isEmpty()){
            return 1;
        }else{
            return 0;
        }
    }
}
