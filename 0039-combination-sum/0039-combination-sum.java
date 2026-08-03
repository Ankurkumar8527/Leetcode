class Solution {
    public void combinations(int i,int n,int target,List<Integer> path,int[] num,List<List<Integer>> ans){
        if(i>=n) return; 
        if(target==0){
            ans.add(new ArrayList<>(path));
            return;
        }
       if(target>0){
         target-=num[i];
        path.add(num[i]);
        combinations(i,n,target,path,num,ans);
        
        target+=num[i];
        path.remove(path.size()-1);

        combinations(i+1,n,target,path,num,ans);
       }
    }
    public List<List<Integer>> combinationSum(int[] num, int target) {
        int n = num.length;
        List<List<Integer>> ans = new ArrayList<>();
        combinations(0,n,target,new ArrayList<>(),num,ans);
        return ans;
    }
}