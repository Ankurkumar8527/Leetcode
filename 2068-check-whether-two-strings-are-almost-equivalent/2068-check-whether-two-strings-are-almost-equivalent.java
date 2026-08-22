class Solution {
    public boolean checkAlmostEquivalent(String s1, String s2) {
        int n = s1.length();
        int[] freq = new int[26];
        for(int i=0;i<n;i++){
            int idx1 = s1.charAt(i)-'a';
            int idx2 = s2.charAt(i)-'a';
            freq[idx1]++;
            freq[idx2]--;
        }
        for(int i=0;i<26;i++)   if(Math.abs(freq[i])>3) return false;
        return true;
    }
}