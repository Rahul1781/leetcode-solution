class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
         int row=matrix.length;
        int col=matrix[0].length;
       // System.out.println(row+" "+col);
        int x=0;
        int y=col-1;
        
        while(x>=0 && x<row && y>=0 && y<col){
            if(matrix[x][y]==target){
                return true;
            }
            else if(target>matrix[x][y]){
                x++;
            }
            else if(target<matrix[x][y]){
                y--;
            }
        }
        return false;
        
        
    }
}