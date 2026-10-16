class Solution {
    public String interpret(String s) {
       int n=s.length();
       String res="";
       for(int i=0;i<n;i++) {
     if(s.charAt(i)=='G'){
            res+='G';
        }
 else if(s.charAt(i)=='(' && s.charAt(i+1)==')'){
         res+='o';
          i++;
        }
else if(s.charAt(i)=='(' && s.charAt(i+1)=='a'){
    res+="al";
     i += 3;
}
       }
       return res;
    }
}