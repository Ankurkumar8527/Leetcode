class Solution {
    public List<Integer> getRow(int n) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        long next_val = 1;
        for(int i=1;i<=n;i++){
             next_val = ( next_val*(n-i+1))/i;
            ans.add((int)next_val);
        }
        return ans;
    }
}