class Solution {
    public int numJewelsInStones(String jewels, String stones) {
 int c=0;
for(int i=0;i<stones.length();i++){
 String s = ""+stones.charAt(i);
        if(jewels.contains(s)){
             c++;
        }
        else{
            continue;
        }
    }
        return c;
    }
}