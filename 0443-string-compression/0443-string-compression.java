class Solution {
    public int compress(char[] chars) {
        int ans=0;
        int count = 1;
        int j = 0;
        for(int i=0;i<chars.length-1;i++){
            if(chars[i]!=chars[i+1]){
                if(count>1){
                    chars[j++]=chars[i];
                    String s = ""+count;
                    int k = 0;
                    while(k<s.length()) chars[j++]=s.charAt(k++);
                    ans+=s.length();
                }
                else{
                    chars[j++]=chars[i];
                }
                count=0;
                ans++;

            }
            count++;
        }
                    if(count>1){
                    chars[j++]=chars[chars.length-1];
                    String s = ""+count;
                    int k = 0;
                    while(k<s.length()) chars[j++]=s.charAt(k++);
                    ans+=s.length();
                    }
                    else chars[j++]=chars[chars.length-1];
                ans++;
        return ans;
    }
}