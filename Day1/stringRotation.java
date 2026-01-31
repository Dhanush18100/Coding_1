public class stringRotation {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";
        if(s1.length()!=s2.length()){
            System.out.println("Not Rotational");
            return;
        }
        String temp=s1+s2;
        if(temp.contains(s2)){
            System.out.println("Rotational");
        }else{
            System.out.println("Not Rotational");
        }
    }
}
