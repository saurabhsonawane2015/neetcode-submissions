class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        


      return  new ArrayList<>(Arrays.stream(strs).collect(Collectors.groupingBy(w->{
            char[] a=w.toCharArray();
            Arrays.sort(a);
            return new String(a);
        })).values());
    
}
}