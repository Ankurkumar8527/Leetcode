class Solution {
    public void combinations(int i,int n,int k,List<Integer> path,List<List<Integer>> ans){
        
        if(path.size()==k){
            ans.add(new ArrayList<>(path));
            return;
        }
        if(i>n) return;
            path.add(i);
            combinations(i+1,n,k,path,ans);

            path.remove(path.size()-1);
            combinations(i+1,n,k,path,ans);

    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        combinations(1,n,k,new ArrayList<>(),ans);
        return ans;
    }
}