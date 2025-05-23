// Given a 2D integer matrix mat[][] of size n x m, where every row and column is sorted in increasing order and a number x, the task is to find whether element x is present in the matrix.

// Examples:

// Input: mat[][] = [[3, 30, 38],[20, 52, 54],[35, 60, 69]], x = 62
// Output: false
// Explanation: 62 is not present in the matrix, so output is false.
class Solution {
    public static boolean matSearch(int mat[][], int x) {
        // your code here
        int i=0, j=mat[0].length-1;
        int n=mat.length;
        int m=mat[0].length;
        while(i<n && j>=0){
            if(mat[i][j]==x)return true;
            else if(mat[i][j]>x) j--;
            else i++;
        }
        return false;
    }
}
