// You are given an array arr[] of non-negative integers. 
// Your task is to move all the zeros in the array to the right end while maintaining the relative order of the non-zero elements. The operation must be performed in place, meaning you should not use extra space for another array.

// Examples:

// Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
// Output: [1, 2, 4, 3, 5, 0, 0, 0]
// Explanation: There are three 0s that are moved to the end.
class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int n=arr.length;
        int j=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1)return ;
        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
       }
    }
}
