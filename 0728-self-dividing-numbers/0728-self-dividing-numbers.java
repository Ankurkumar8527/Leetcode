class Solution {
    public boolean checkdiv(int n){
        String s = ""+n;
        if(s.contains("0")) return false;
        int x = n;
        while(n>0){
            int d = n%10;
            n/=10;
            if(x%d!=0) return false;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(i<=9) ans.add(i);
            else if(i%10==0) continue;
            else{
                if(checkdiv(i)) ans.add(i);
            }
        }
        return ans;
    }
}