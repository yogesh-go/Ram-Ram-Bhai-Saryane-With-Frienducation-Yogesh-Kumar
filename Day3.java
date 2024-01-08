// Problem 1 : Spiral Matrix
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        List<Integer> outputArray = new ArrayList<>();
        if(row<1){
            return outputArray;
        }
        int col = matrix[0].length;
        int startRow = 0;
        int startCol = 0;
        int i =0;
        
        while(startRow<row&& startCol<col){
            for(i= startCol; i< col; ++i){
                outputArray.add(matrix[startRow][i]);
            }
            startRow++;
            for(i = startRow; i<row;++i){
                outputArray.add(matrix[i][col-1]);
            }
            col--;
            if(startRow<row){
                for(i = col-1; i>=startCol;--i){
                    outputArray.add(matrix[row-1][i]);
                }
                row--;
            }
            if(startCol<col){
                for(i = row-1; i>=startRow;--i){
                    outputArray.add(matrix[i][startCol]);
                }
                startCol++;
            }
        }
        return outputArray;
    }
}

// Problem 2 : Subarray Sum Equals K
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
      
        int[] sums = new int[nums.length + 1];
        sums[0] = 0;
        for (int i = 1; i <= nums.length; i++)
            sums[i] = sums[i - 1] + nums[i - 1];
      
        for (int start = 0; start < sums.length; start++) {
            for (int end = start + 1; end < sums.length; end++) {
                if (sums[end] - sums[start] == k)
                    count++;
            }
        }
      
        return count;
    }
}