class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = new int[n];
        for(int i=0;i<n;i++) ans[i]=arr[i];
         Arrays.sort(arr);
        int rank = 1;
        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i])) map.put(arr[i],rank++);
        }
        for(int i=0;i<n;i++){
            if(map.containsKey(ans[i])) ans[i]=map.get(ans[i]);
        } 
        return ans;
    }
}