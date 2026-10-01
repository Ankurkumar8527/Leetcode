class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0],b[0]));
        List<int[]> ans = new ArrayList<>();
        for(int[] interval : intervals){
            if(ans.isEmpty() || ans.get(ans.size()-1)[1] < interval[0])
            ans.add(interval);
            else{
                int[] newinterval = new int[2];
                newinterval[0] = ans.get(ans.size()-1)[0];
                newinterval[1] = Math.max(interval[1],ans.get(ans.size()-1)[1]);
                ans.set(ans.size()-1,newinterval);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}