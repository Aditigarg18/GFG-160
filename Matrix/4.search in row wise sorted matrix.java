// Given a row-wise sorted 2D matrix mat[][] of size n x m and an integer x, find whether element x is present in the matrix.
// Note: In a row-wise sorted matrix, each row is sorted in itself, i.e. for any i, j within bounds, mat[i][j] <= mat[i][j+1].

// Examples :

// Input: mat[][] = [[3, 4, 9],[2, 5, 6],[9, 25, 27]], x = 9
// Output: true
// Explanation: 9 is present in the matrix, so the output is true.
class Solution {
      static boolean binsearch(int []arr,int x){
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x )return true;
            else if(arr[mid]<x)low=mid+1;
            else high=mid-1;
        }
        return false;
    }
    // Function to search a given number in row-column sorted matrix.
    public boolean searchRowMatrix(int[][] mat, int x) {
        // code here
        for(int i=0;i<mat.length;i++){
            if(binsearch(mat[i],x))return true;
        }
        return false;
    }
}
