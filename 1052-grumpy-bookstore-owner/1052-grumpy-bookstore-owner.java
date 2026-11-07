class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
      int n=customers.length;
int CurrSatisCust=0;
for(int i=0;i<n;i++){
    if(grumpy[i]==0)
    CurrSatisCust+=customers[i];
   }
   int AdditSatisCust=0,MaxadditSatisCust=0;
   int j=0;
   int i=0;
   while(j<n){
    if(grumpy[j]==1)// add only grumpy customer
     AdditSatisCust+=customers[j];
   if(j-i+1<minutes)
    j++;
    else if(j-i+1==minutes){
    MaxadditSatisCust=Math.max(MaxadditSatisCust,AdditSatisCust);
    if(grumpy[i] == 1)
    AdditSatisCust-=customers[i];
    i++;j++;
    }
   }
   return CurrSatisCust+MaxadditSatisCust;
    }
}