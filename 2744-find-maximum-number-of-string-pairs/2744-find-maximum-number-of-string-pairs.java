class Solution {
    public String reverse(String s ){
        String rev="";
        int i=0,j=s.length()-1;
        while(i<=j) rev=s.charAt(i++)+rev;
        return rev;
    }
    public int maximumNumberOfStringPairs(String[] words) {
        HashMap<String,Integer> map = new HashMap<>();
        int count = 0;
        for(String s:words){
             String rev= reverse(s);
            if(map.containsKey(rev)) count++;
            if(!map.containsKey(s)) map.put(s,1);
           
        }
        return count;
    }
}