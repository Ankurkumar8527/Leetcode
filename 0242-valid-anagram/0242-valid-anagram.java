class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> set1 = new HashMap<>();
        for(char ch : s.toCharArray()){
            if(!set1.containsKey(ch)) set1.put(ch,1);
            else set1.put(ch,set1.get(ch)+1);
        }
        HashMap<Character,Integer> set2 = new HashMap<>();
        for(char ch : t.toCharArray()){
            if(!set2.containsKey(ch)) set2.put(ch,1);
            else set2.put(ch,set2.get(ch)+1);
        }
        if(set1.size()!=set2.size()) return false;

        for(char key : set1.keySet()){
            if(!set2.containsKey(key)) return false;
            int f1 = set2.get(key);
            int f2 = set1.get(key);
            if(f1!=f2) return false;
        }
        for(char key : set2.keySet()){
            if(!set1.containsKey(key)) return false;
            int f1 = set2.get(key);
            int f2 = set1.get(key);
            if(f1!=f2) return false;
        }
        return true;
    }
}