class Solution {
    public long sumAndMultiply(int n) {
        String s = n+"";
        long x = 0;
        int sum = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch!='0'){
                int num = Integer.parseInt(ch+"");
                x=x*10+num;
                sum+=num;
            }
        }
        return x*sum;
    }
}