class Solution {
    public List<Integer> addToArrayForm(int[] nums, int k) {
        int n = nums.length;
        int carry = 0;
        List<Integer> ans = new ArrayList<>();
        int i=n-1;
        while(i>=0){
            int mod = k%10;
            k/=10;
            int sum = nums[i]+mod+carry;
            if(sum>=10) {
                sum%=10;
                carry = 1;
            }
            else{
                carry = 0;
            }
            ans.add(0,sum);
            i--;
        }
        while(k>0){
            int sum = k%10+carry;
            if(sum==10){
                sum=0;
                carry=1;
            }
            else{
                carry=0;
            }
            ans.add(0,sum);
            k/=10;
        }
        if(carry!=0) ans.add(0,carry);
        return ans;
    }
}