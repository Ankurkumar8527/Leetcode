class Solution {
    public int maxDepth(String st) {
        int n = st.length();
        Stack<Integer> s = new Stack<>();
        int ans = 0;
        int c = 0;
        for(int i=0;i<n;i++){
            char ch = st.charAt(i);
            if(ch=='(') c++;
            else if(ch==')') c--;
            ans = Math.max(c,ans);
        }
        return ans;
    }
}