// Given two arrays a[] and b[], the task is to find the number of elements in the union between these two arrays.

// The Union of the two arrays can be defined as the set containing distinct elements from both arrays. If there are repetitions, then only one element occurrence should be there in the union.

// Note: Elements of a[] and b[] are not necessarily distinct.

// Examples

// Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3]
// Output: 5
// Explanation: Union set of both the arrays will be 1, 2, 3, 4 and 5. So count is 5.
class Solution {
    public static int findUnion(int a[], int b[]) {
        // code here
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<a.length;i++){
        set.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            set.add(b[i]);
        }
        return set.size();
    }
}
