package Day1;

import java.util.ArrayList;

import java.util.HashSet;

public class intersectionElement {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        int[] b = { 5, 6 };

        HashSet<Integer>hash=new HashSet<>();
       ArrayList<Integer>ans=new ArrayList<>();
        for(int i:a){
            hash.add(i);
        }

        for(int x:b){
            if(hash.contains(x)){
                ans.add(x);
            }
        }
        System.out.println(ans);


    }
}
