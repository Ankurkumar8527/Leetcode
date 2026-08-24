class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> ans = new ArrayList<>();
        int max = 0;
        for(int can : candies) max=Math.max(can,max); 
        for(int can : candies){
            if(can+extraCandies>=max) ans.add(true);
            else ans.add(false);
        }
        return ans;
    }
}