class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> t = new ArrayList<>();
        t.add(1);
        ans.add(new ArrayList<>(t));
        for(int i=1;i<n;i++){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            int nv = 1;
            for(int j=1;j<=i;j++){
                   nv = (nv*(i-j+1))/j;
                   temp.add(nv); 
            }
            ans.add(new ArrayList<>(temp));
        }
        return ans;
    }
}