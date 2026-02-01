import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class AnagramsTogether {
    public static void main(String[] args) {
         String[] arr = {"cat", "dog", "tac", "god", "act"};

        printAnagramsTogether(arr);
    }
     public static void printAnagramsTogether(String[] arr) {
        HashMap<String,ArrayList<String>>map=new HashMap<>();
        for(String word:arr){
            char ch[]=word.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }
        for(ArrayList<String>group:map.values()){
            for (String s : group) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
        }
     
}
