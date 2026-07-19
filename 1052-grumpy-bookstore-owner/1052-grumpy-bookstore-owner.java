class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int i = 0,j=0,a=0,b=0;
        int unsatified = 0;
        int maxUsatified = 0;
        for( i=0;i<minutes;i++){
            if(grumpy[i]==1) unsatified+=customers[i];
        }
        j=i;
        i=0;
        while(i<n && j<n){
            if(unsatified>maxUsatified){
                a=i;
                b=j;
                maxUsatified=unsatified;
            }
            if(grumpy[i]==1 && grumpy[j]==0) unsatified=unsatified-customers[i];
            else if(grumpy[i]==0 && grumpy[j]==1) unsatified=unsatified+customers[j];
            else if(grumpy[i]==1 && grumpy[j]==1) unsatified=unsatified-customers[i]+customers[j];
            i++;
            j++;
        }
         if(unsatified>maxUsatified){
                a=i;
                b=j;
                maxUsatified=unsatified;
            }
        for(int x=a;x<b;x++){
            grumpy[x]=0;
        }
        
        int ans = 0;
        for(i=0;i<n;i++){
            if(grumpy[i]==0) ans+=customers[i];
        }
        return ans;
    }
}