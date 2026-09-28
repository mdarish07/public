class Solution {
    public int countDigits(int num) {
        int c=0;
        int temp=num; 
        while(num!=0){
            int val=num%10;
            if(temp%val==0)
             c++;
             num/=10;
        }
        return c;
    }
}