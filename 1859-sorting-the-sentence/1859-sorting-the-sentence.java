class Solution {
    public String sortSentence(String s) {
        int size = 0;
        for(int i=0;i<s.length();i++) {
            if(Character.isDigit(s.charAt(i))){
                int val = s.charAt(i)-'0';
                size=Math.max(size,val);
            }
        }
        String[] sb = new String[size];
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)==' '){
                i++;
                continue;
            }
            int j = i;
            while(j<s.length() && !Character.isDigit(s.charAt(j))) j++; 
            String substr = s.substring(i,j);
            int idx = s.charAt(j)-'0'-1;
            sb[idx]=substr;
            i=j+1;
        }
        String ans = sb[0];
        for(int j=1;j<size;j++) ans=ans+" "+sb[j];
        return ans;
    }
}