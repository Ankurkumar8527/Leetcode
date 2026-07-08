class Solution {
    public long dividePlayers(int[] skill) {
        int n = skill.length;
        int m = n/2;
        int[][] arr = new int[m][2];
        Arrays.sort(skill);
        int prevSum=skill[0]+skill[n-1];
        long ans = skill[0]*skill[n-1];
        for(int i=1;i<m;i++){
            int sum = skill[i]+skill[n-i-1];
            if(sum!=prevSum) return -1;
            ans+=skill[i]*skill[n-i-1];
        }
        return ans;
    }
}