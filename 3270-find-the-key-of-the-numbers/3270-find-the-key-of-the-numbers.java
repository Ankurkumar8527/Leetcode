class Solution {
    public int generateKey(int num1, int num2, int num3) {
        String s1 = num1+"";
        String s2 = num2+"";
        String s3 = num3+"";
        while(s1.length()<4){
            s1="0"+s1;
        }
        while(s2.length()<4){
            s2="0"+s2;
        }
        while(s3.length()<4){
            s3="0"+s3;
        }
        String n ="";
        for(int i=0;i<4;i++){
            n=n+Math.min(s1.charAt(i)-'0',Math.min(s2.charAt(i)-'0',s3.charAt(i)-'0'));
        }
        int ans = 0;
        for(int i=0;i<4;i++){
            ans = ans*10+n.charAt(i)-'0';
        }
        return ans;
    }
}