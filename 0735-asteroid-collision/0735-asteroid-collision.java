class Solution {
    public int[] asteroidCollision(int[] nums) {
        int n = nums.length;
        Stack<Integer> s = new Stack<>();
        int i = 0;
        while(i<n){
            if(s.isEmpty()) {
                s.push(nums[i]);
                i++;
            }
            else if(s.peek()>0 && nums[i]<0){
                int a = s.peek();
                int b = Math.abs(nums[i]);
                if(b>a) s.pop();
                else if(b==a){
                    s.pop();
                    i++;
                }
                else i++;
            }
            else {
                s.push(nums[i]);
                i++;
            }
        } 
        int[] ans = new int[s.size()];
        for(int id=ans.length-1;id>=0;id--) ans[id]=s.pop();

        return ans;
    }
}