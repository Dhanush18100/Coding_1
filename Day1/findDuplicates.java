import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class findDuplicates {
    public static void main(String[] args) {
        int arr[]={1, 6, 5, 2, 3, 3, 2};
        HashSet<Integer>hash=new HashSet<>();
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i:arr){
            if(!hash.contains(i)){
                hash.add(i);
            }else{
                ans.add(i);
            }
        }
        System.out.println(ans);
    }
}
