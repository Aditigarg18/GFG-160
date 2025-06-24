class Solution {
    public int countTriplets(int[] arr, int target) {
        // Code Here
        int count=0;
        int n=arr.length;
        for(int i=0;i<=n-3;i++){
           int j=i+1,k=n-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum>target)k--;
                if(sum<target)j++;
                if(sum==target){
                    count++;
                    int temp=j+1;
                    while(temp<k && temp>0&& arr[temp]==arr[temp-1]){
                        count++;
                        temp++;
                    }
                        k--;
                    }
                }
            }
            return count;
    }
}
