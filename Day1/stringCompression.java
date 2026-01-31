public class stringCompression {
    public static void main(String[] args) {
        String str = "aaabb";
        StringBuilder sb=new StringBuilder();
        int count=1;
        for(int i=1;i<=str.length();i++){
            if(i<str.length() && str.charAt(i)==str.charAt(i-1)){
                count++;
            }else{
                sb.append(str.charAt(i-1));
                sb.append(count);
                count=1;
            }
        }
        System.err.println(sb.toString());
    }
}
