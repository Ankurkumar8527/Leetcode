class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n = bills.length;
        int five = 0;
        int ten = 0;
        for(int i=0;i<n;i++){
            if(bills[i]==5) five++;
            else if(bills[i]==10) {
                if(five<0) return false;
                five--;
                ten++;
            }
            else {
                if(five<0) return false;
                if(five==0 && ten==0) return false;
                else if(five<3 && ten==0) return false;
                if(ten==0){
                    five-=3;
                }
                else{
                    five--;
                    ten--;
                }
            }
        }
        return (five>=0 && ten>=0);
    }
}