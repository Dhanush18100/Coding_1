package Day1;

import java.util.HashSet;

public class unionOfArray {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        int[] b = { 3, 4, 5, 6 };
        HashSet<Integer>ans=new HashSet<>();
        for(int i:a){
            ans.add(i);
        }
        for(int j:b){
            ans.add(j);
        }
        System.out.println(ans);

    }
}
