class Solution {
    public int maxVowels(String s, int k) {
        int  n = s.length();
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int i=0,j=0,maxlen=0,noofvowels=0;
        for( i=0;i<k;i++){
            char ch = s.charAt(i);
            if(set.contains(ch)) noofvowels++;
        }
        if(noofvowels==k) return k;
        maxlen = Math.max(maxlen,noofvowels);
        j=i;
        i=0;
        while(i<n && j<n){
            if(set.contains(s.charAt(i)) && !set.contains(s.charAt(j))) noofvowels--;
            if(!set.contains(s.charAt(i)) && set.contains(s.charAt(j))) noofvowels++;
            maxlen = Math.max(maxlen,noofvowels);
            i++;
            j++;
        }
        maxlen = Math.max(maxlen,noofvowels);
        return maxlen;
    }
}