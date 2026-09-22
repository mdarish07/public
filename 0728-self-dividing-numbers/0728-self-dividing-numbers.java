class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isSelfDividing(i)){
                list.add(i);
            }
        }
        return list;
        
    }
    boolean isSelfDividing(int num){
        int temp=num;int d;
       while(temp>0){
        d=temp%10;
         if( d==0 || num%d!=0)
            return false;
         temp/=10;
       }
             return true;
       }
    }  