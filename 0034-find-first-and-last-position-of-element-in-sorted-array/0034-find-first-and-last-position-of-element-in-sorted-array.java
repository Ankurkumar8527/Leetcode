class Solution {
    public int[] searchRange(int[] a, int target) {
        int n=a.length;
        int lb=n;
        int lo=0;
        int ho=n-1;
        int[] ans={-1,-1};
        boolean flag=false;
       while(lo<=ho)
       {
        int mid=(ho-lo)/2+lo;
        if(a[mid]==target)
        {
            flag=true;
            break;
        }
        else if(a[mid]<target)
        lo=mid+1;
        else
        ho=mid-1;
       }
       if(flag==false) return ans;
        lb=n;
        lo=0;
        ho=n-1;
       while(lo<=ho)
       {
        int mid=(ho-lo)/2+lo;
        if(a[mid]>=target)
        {
            lb=Math.min(lb,mid);
            ho=mid-1;
        }
        else
         lo=mid+1;
       }
       ans[0]=lo;
        lb=n;
        lo=0;
        ho=n-1;
       while(lo<=ho)
       {
       int mid=(ho-lo)/2+lo;
        if(a[mid]>target)
        {
           lb=Math.min(lb,mid);
            ho=mid-1;
        }
        else
         lo=mid+1;
       }
       ans[1]=lo-1;
        return ans;
    }
}