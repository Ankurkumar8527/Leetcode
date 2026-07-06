class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Using Two Pointer Approach
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0,j=0;
        int maxLen = 0;
        while(j<n){
            char ch = s.charAt(j);
            if(!map.containsKey(ch)){
                map.put(ch,j);
            }
            else{
                maxLen=Math.max(maxLen,j-i);
                int idx = map.get(ch);
                if(i<=idx) i=idx+1;
                map.put(ch,j);
            }
            j++;
        }
        maxLen=Math.max(maxLen,j-i);
        return maxLen;
    }
}