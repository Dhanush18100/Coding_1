import java.util.ArrayList;

public class transpose {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 1, 1, 1},
            {2, 2, 2, 2},
            {3, 3, 3, 3},
            {4, 4, 4, 4}
        };

        ArrayList<ArrayList<Integer>> res = transpose1(mat);

        for (ArrayList<Integer> row : res) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        } 
    }
    public static ArrayList<ArrayList<Integer>>transpose1(int[][] mat) {
        int rows=mat.length,cols=mat[0].length;
         ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
         for(int i=0;i<rows;i++){
            ArrayList<Integer>row=new ArrayList<>();
            for(int j=0;j<cols;j++){
                row.add(mat[j][i]);
            }
            ans.add(row);
         }
         return ans;
    }

}
