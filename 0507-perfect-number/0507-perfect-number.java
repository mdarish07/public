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
*/ // T.C-->O(n), S.C-->O(1)
class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num<=1)
        return false;
        int i = 2;
        int sum = 1;
        while (i <= (int)Math.sqrt(num)) {
            if (num % i == 0) {
                sum += i;

                if (i != num / i) {// To prevent Same divisor for adding
                    sum += num / i;// To find remaining pair
                }
            }
            i++;
        }

        return sum == num;
    }
}
// T.C-->O(Sqrt(n), S.C-->O(1)