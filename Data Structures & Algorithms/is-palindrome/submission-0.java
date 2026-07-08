class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n=s.length();

        for(int left=0,right=n-1;left<right;left++,right--)
        {
            
            if(s.charAt(left)!=s.charAt(right))
            return false;



        }
        return true;
    }
}
