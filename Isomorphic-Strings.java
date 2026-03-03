1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3       
4    Map<Character,Character>map=new HashMap<>();
5    if(s.length()!=t.length()){
6        return false;
7    }
8    for(int i=0;i<s.length();i++){
9        if(map.containsKey(s.charAt(i))){
10        if(map.get(s.charAt(i))!= t.charAt(i)){
11            return false;
12        }
13     
14        }
15        else{
16            if(map.containsValue(t.charAt(i) ) )
17            {
18                return false;
19            }
20            map.put(s.charAt(i),t.charAt(i));
21
22        }
23
24    }
25    return true;
26}
27}