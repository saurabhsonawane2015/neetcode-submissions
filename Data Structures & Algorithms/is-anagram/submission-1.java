class Solution {
    public boolean isAnagram(String s, String t) {
     
     
     if(s.length()!=t.length())
     return false;

     char[] sstring=s.toCharArray();
     char[] tstring=t.toCharArray();

     Arrays.sort(sstring);
     Arrays.sort(tstring);

     if(Arrays.equals(sstring, tstring)) 
      {return true;}

      return false;



     
    }
}
