class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        boolean[] arr = new boolean[n+1];
        for(int ele : nums) arr[ele]=true;
        List<Integer> ans = new ArrayList<>();
        for(int i=1;i<n+1;i++) if(!arr[i]) ans.add(i);
        return ans;
    }
}