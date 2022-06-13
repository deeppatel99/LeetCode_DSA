class Solution {
    public boolean isAnagram(String s, String t) {
        // HashMap<Character, Integer> map = new HashMap<>();
        // boolean success =true;
        int count[] = new int[26];
        
        if(s.length() != t.length()) return false;
        
        for(int i = 0; i < s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            count[c1 - 'a']++;
            count[c2 - 'a']--;
        }
        
        for(int x: count){
            if(x != 0)
                return false;
        }
        
        return true;
        
        
//         for(int i = 0; i < s.length(); i++){
//             char ch = s.charAt(i);
//             map.put(ch, map.getOrDefault(ch,0)+1);
//         }
        
//         for(int i = 0; i < t.length(); i++){
//             char ch = t.charAt(i);
//             if(!map.containsKey(ch)){
//                 success = false;
//             }else if(map.get(ch) == 1){
//                 map.remove(ch);
//             }else{
//                 map.put(ch, map.get(ch) - 1);
//             }
//         }
        
        // return success;
    }
}