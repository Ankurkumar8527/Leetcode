class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        String s = strs[0];
        for(int i=0;i<strs.length;i++){
            // char ch 
            if(s.length()>strs[i].length())
            s=s.substring(0,strs[i].length());
            for(int j=0;j<strs[i].length();j++){
                char ch = strs[i].charAt(j);
                if(j<s.length()  && s.charAt(j)!=ch){
                    s=s.substring(0,j);
                    break;
                }
            }
        }
        if(s.isEmpty()) return "";
        return s;
    }
}