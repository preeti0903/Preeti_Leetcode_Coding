class Solution {
    public int lengthOfLongestSubstring(String s) {
       Set<Character> str_list=new HashSet<>();
        int max_length=0;
        int i;
        int j=0;
        if(s==null){
            max_length=0;
        }
        for(i=0;i<s.length();i++){
            if(str_list.contains(s.charAt(i))){
                str_list.remove(s.charAt(j++));
                
               
                    
                
            }
            str_list.add(s.charAt(i));
            max_length=Math.max(max_length,str_list.size());
        }
        return max_length;
            
        
    }
}
