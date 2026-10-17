class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer>list=new ArrayList<>();
         for(int i=0;i<words.length;i++){
            String s=words[i];
            String st=""+x;
           if(s.contains(st))
            list.add(i); 
         }
         return list;
    }
}