class Solution {
    public int calPoints(String[] operations) {
        int n=operations.length;
   int Stack[]=new int[n];
   int top=-1;
     for(int i=0;i<Stack.length;i++){
        String op=operations[i];
        if(op.equals("C")){
            top--;
        }
       else if(op.equals("+")){
            int score=Stack[top]+Stack[top-1];
            top++;
            Stack[top]=score;
        }
       else if(op.equals("D")){
            int score=2*Stack[top];
            top++;
            Stack[top]=score;
        }
        else{
           top++;
           Stack[top]=Integer.parseInt(op);
        }
     }
     int sum=0;
     for(int i=0;i<=top;i++){
     sum+=Stack[i];
     }
     return sum;
    }
}