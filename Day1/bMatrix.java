public class bMatrix {
    public static void main(String[] args) {
         int[][] mat = {{1, 0, 0, 1}, {0, 0, 1, 0}, {0, 0, 0, 0}};
        booleanMatrix(mat);
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        
    }
    public static void booleanMatrix(int [][]mat){
        int rows=mat.length,cols=mat[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(mat[i][j]==1){
                    for(int k=0;k<rows;k++){
                       if(mat[k][j]==0){
                        mat[k][j]=-1;
                       }
                    }
                    for(int k=0;k<cols;k++){
                       if(mat[i][k]==0){
                        mat[i][k]=-1;
                       }
                    }

                }
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(mat[i][j]==-1){
                    mat[i][j]=1;
                }
            }
        }
    } 
}
