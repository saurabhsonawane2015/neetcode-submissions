class Solution {
    public boolean isAnagram(String s, String t) {

  if(s.length() != t.length())
  return false;

  HashMap<Character,Integer> sString=new HashMap<>();
   HashMap<Character,Integer> tString=new HashMap<>();

   for (char c : s.toCharArray())
   {
    sString.put(c,sString.getOrDefault(c,0)+1);
}

for (char d: t.toCharArray())
{
    tString.put(d,tString.getOrDefault(d,0)+1);
}

  return sString.equals(tString);

    }
}
