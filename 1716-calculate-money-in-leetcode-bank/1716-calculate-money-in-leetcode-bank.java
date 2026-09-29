class Solution {
    public int totalMoney(int n) {
        int start_mon = 1;
        int res = 0;

        while (n > 0) {
            int money = start_mon;
            int days = Math.min(n, 7);

            for (int day = 1; day <= days; day++) {
                res += money;
                money++;
            }

            n -= days;
            start_mon++;
        }

        return res;
    }
}
