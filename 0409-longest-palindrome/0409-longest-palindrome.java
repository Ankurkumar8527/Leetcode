class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
        if(n==1) return 1;
        int count = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)) map.put(ch,1);
            else map.put(ch,map.get(ch)+1);
        }
        for(char ch : map.keySet()){
            int freq = map.get(ch);
            count+= freq%2==0 ? freq : freq-1 ;
        }
        if(n==count) return n;
        return count+1;
    }
}