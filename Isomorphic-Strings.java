1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        int s1[]=new int [200];
4        int t1[]=new int [200];
5        if(s.length()!=t.length()){
6            return false;
7        }
8        for(int i=0;i<s.length();i++){
9        if(s1[s.charAt(i)]!=t1[t.charAt(i)])
10        {
11            return false;
12        }
13        else{
14            s1[s.charAt(i)]=i+1;
15            t1[t.charAt(i)]=i+1;
16            
17        }
18        }
19        return true;
20        
21    }
22}