class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp=num;
        int rev=0;
        while(num>0) {
            int d=num%10;
            rev=rev*10+d;
            num/=10;
        }
        int reverse=0;
    while(rev>0){
        int dig=rev%10;
        reverse=reverse*10+dig;
        rev/=10;
    }
    if(reverse==temp)return true;
    else return false;
    }
}