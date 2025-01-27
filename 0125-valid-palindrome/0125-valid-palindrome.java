class Solution {
    public boolean isPalindrome(String s) {
       String modified= s.trim().toLowerCase().replaceAll("[^a-zA-Z0-9]","");
       if(modified.isEmpty()) return true;
       int i=0, j=modified.length()-1;
       while(i<j){
        if(modified.charAt(i)==modified.charAt(j)){i++;j--;}
        else break;
       }
       if(i>=j) return true;
       return false;
    }
}