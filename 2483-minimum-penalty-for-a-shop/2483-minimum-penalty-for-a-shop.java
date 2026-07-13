class Solution {
    public int bestClosingTime(String customers) {
        int n = customers.length();
        int[] prefix = new int[n+1];
        int[] suffix = new int[n+1];

        for(int i=1;i<n+1;i++){
            char ch = customers.charAt(i-1);
            if(ch=='N'){
                prefix[i]=prefix[i-1]+1;
            }
            else prefix[i]=prefix[i-1];
        }
         for(int i=n-1;i>=0;i--){
            char ch = customers.charAt(i);
            if(ch=='Y'){
                suffix[i]=suffix[i+1]+1;
            }
            else suffix[i]=suffix[i+1];
        }
        int min=n;
        for(int i=0;i<n+1;i++){
            prefix[i]=prefix[i]+suffix[i];
            min=Math.min(min,prefix[i]);
        }
        
        for(int i=0;i<n+1;i++){
            if(prefix[i]==min) return i;
        }
        return -1;
    }
}