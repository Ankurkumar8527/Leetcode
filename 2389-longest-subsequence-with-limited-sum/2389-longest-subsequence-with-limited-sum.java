class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int n = nums.length;
        int m = queries.length;
        int[] ans = new int[m];
        // Sorting
        Arrays.sort(nums);

        // Prefix Sum
        for(int i=1;i<n;i++) nums[i]+=nums[i-1];

        // Binary Search
        for(int i=0;i<m;i++){
            int target = queries[i];
            int lo = 0,hi=n-1;
            while(lo<=hi){
                int mid = lo+(hi-lo)/2;
                if(nums[mid]<=target){   
                    ans[i]=mid+1;
                    lo=mid+1;
                }
                else if(nums[mid]>target) hi=mid-1;
            }
        }
        return ans;
    }
}