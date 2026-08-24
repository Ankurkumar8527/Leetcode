class Solution {
    public String mergeAlternately(String s1, String s2) {
        int i = 0;
        int j = 0;
        String ans ="";
        while(i<s1.length() || j<s2.length()){
            if(i<s1.length()) ans+=s1.charAt(i);
            if(j<s2.length()) ans+=s2.charAt(j);
            i++;
            j++;
        }  
        return ans;
    }
}