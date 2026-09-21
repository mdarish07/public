/* class Solution {
    public boolean checkPerfectNumber(int num) {
        int i=1,sum=0;
        while(i<num){
            if(num%i==0){
                sum+=i;
            }
            i++;
        }
       return sum==num;
    }
}
*/
class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num<=1)
        return false;
        int i = 2;
        int sum = 1;
        while (i <= (int)Math.sqrt(num)) {
            if (num % i == 0) {
                sum += i;

                if (i != num / i) {
                    sum += num / i;
                }
            }
            i++;
        }

        return sum == num;
    }
}
