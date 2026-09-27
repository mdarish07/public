class Solution {
    public double average(int[] salary) {
        int min=salary[0],max=salary[0];
        for(int i=1;i<salary.length;i++){
            if(salary[i]<min){
                min=salary[i];
            }
            if(salary[i]>max){
                max=salary[i];
            }
        }
        int sum=0;
        for(int i=0;i<salary.length;i++){
             sum=sum+salary[i];
        }
        double avg=(double)(sum-min-max)/(salary.length-2);
        return avg;
    }
}