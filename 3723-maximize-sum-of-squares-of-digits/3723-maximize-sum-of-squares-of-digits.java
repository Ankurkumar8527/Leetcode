class Solution {
    public String maxSumOfSquares(int n, int sum) {
        if (sum > 9 * n) {
            return "";
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int digit = Math.min(9, sum);
            ans.append(digit);
            sum -= digit;
        }

        return ans.toString();
    }
}