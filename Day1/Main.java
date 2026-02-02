public class Main {
    public static void main(String[] args) {
        String s = "Too hot to hoot.";
        System.out.println(isPalinSent(s)
                           			? "true" : "false");
        
    }
    public static boolean isPalinSent(String s) {
        StringBuilder s1=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                s1.append(Character.toLowerCase(ch));
            }
        }
        StringBuilder rev=new StringBuilder(s1.toString());
        rev.reverse();
        return s1.toString().equals(rev.toString());
    }
}
