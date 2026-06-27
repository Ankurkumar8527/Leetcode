/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
     public int findInMountainArray(int target, MountainArray mountainArr) {
         int n = mountainArr.length();
        int lo = 1;
        int hi  = n-2;
        int peekidx = 0;
        while(lo<=hi){
            int k = lo+(hi-lo)/2;
            int mid = mountainArr.get(k);
            int midl = mountainArr.get(k-1);
            int midr = mountainArr.get(k+1);
            if(mid>midl && mid>midr) {
                peekidx = k;
                break;
            }
            else if(mid>midl && mid<midr) lo = k+1;
            else hi = k-1;
        }
        
        lo = 0;
        hi = peekidx;
        ArrayList<Integer> arr = new ArrayList<>();
        while(lo<=hi){
            int k = lo+(hi-lo)/2;
            int mid = mountainArr.get(k);
            if(mid==target) {
                arr.add(k);
                break;
            }
            else if(mid<target)  lo = k+1;
            else hi = k-1;
        }
        lo = peekidx+1;
        hi = n-1;
         while(lo<=hi){
            int k = lo+(hi-lo)/2;
             int mid = mountainArr.get(k);
            if(mid==target) {
               arr.add(k);
                break;
            }
            else if(mid<target) hi = k-1;
            else lo = k+1;
        }
        Collections.sort(arr);
        return arr.size()==0?-1:arr.get(0);
    }
}