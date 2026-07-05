class Solution {
    public String reverse(String s ){
        String rev="";
        int i=0,j=s.length()-1;
        while(i<=j) rev=s.charAt(i++)+rev;
        return rev;
    }
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> map = new HashSet<>();
        int count = 0;
        for(String s:words){
             String rev= reverse(s);
            if(map.contains(rev)) count++;
            if(!map.contains(s)) map.add(s);
           
        }
        return count;
    }
}