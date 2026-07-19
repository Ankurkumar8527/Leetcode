class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int i = 0,j=minutes-1,a=0,b=j;
        int unsatified = 0;
        int maxUsatified = 0;
        for( i=0;i<=j;i++){
            if(grumpy[i]==1) unsatified+=customers[i];
        }
        i=0;
        while(i<n && j<n){
            if(unsatified>maxUsatified){
                a=i;
                b=j;
                maxUsatified=unsatified;
            }
            i++;
            j++;
            if(j<n && grumpy[j]==1) unsatified+=customers[j];
            if(grumpy[i-1]==1) unsatified-=customers[i-1];
        }
        for(int x=a;x<=b;x++){
            grumpy[x]=0;
        }
        
        int ans = 0;
        for(i=0;i<n;i++){
            if(grumpy[i]==0) ans+=customers[i];
        }
        return ans;
    }
}