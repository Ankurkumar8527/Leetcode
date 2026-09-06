class Solution {
    public int findDuplicate(int[] a) {
        boolean[] ans = new boolean[a.length+1];
        for(int ele : a){
            if(ans[ele]) return ele;
            else ans[ele]=true;
        }
        return -1;
    }
}