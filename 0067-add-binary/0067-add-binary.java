class Solution {
    public String addBinary(String a, String b) {
        int m = a.length();
        int n = b.length();
        int i = m-1;
        int j = n-1;
        int x = 0;
        String ans = "";
        while(i>=0 && j>=0){
            int c1 = a.charAt(i)-'0';
            int c2 = b.charAt(j)-'0';
            int sum = c1+c2+x;
            if(sum==0){
                ans="0"+ans;
                x=0;
            }
            else if(sum==1){
                ans="1"+ans;
                x=0;
            }
            else if(sum==2){
                ans="0"+ans;
                x=1;
            }
            else{
                ans="1"+ans;
                x=1;
            }
            i--;j--;
        }
        while(i>=0){
            int c = a.charAt(i)-'0';
            int sum = c+x;
            if(sum==0){
                ans="0"+ans;
                x=0;
            }
            else if(sum==1){
                ans="1"+ans;
                x=0;
            }
            else{
                ans="0"+ans;
                x=1;
            }
            i--;
        }
        while(j>=0){
            int c = b.charAt(j)-'0';
            int sum = c+x;
            if(sum==0){
                ans="0"+ans;
                x=0;
            }
            else if(sum==1){
                ans="1"+ans;
                x=0;
            }
            else{
                ans="0"+ans;
                x=1;
            }
            j--;
        }
        if(x==1) ans="1"+ans;
        return ans;
    }
}