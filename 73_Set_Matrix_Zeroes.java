 import java.util.*;
class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        HashSet<Integer> Rowzeroes = new HashSet<>();
        HashSet<Integer> Colzeroes  = new HashSet<>();

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == 0){
                    Rowzeroes.add(i);
                    Colzeroes.add(j);                }
            }
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(Rowzeroes.contains(i) || Colzeroes.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
        
    }
}
