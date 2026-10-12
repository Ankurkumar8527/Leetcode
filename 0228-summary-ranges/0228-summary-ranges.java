class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int n = nums.length;
        if(n==0) return ans;
        int start = 0,end = 0,next = 1;
        while(end<n && next<n){
            if(nums[end]+1==nums[next]) end = next;
            else if(start==end){
                ans.add(nums[start]+"");
                start++;
                end++;
            }
            else if(nums[end]+1!=nums[next]){
                ans.add(nums[start]+"->"+nums[end]);
                start=next;
                end=next;
            }
            next++;
        }
        if(start==end) ans.add(nums[start]+"");
        else ans.add(nums[start]+"->"+nums[end]);
        return ans;
    }
}