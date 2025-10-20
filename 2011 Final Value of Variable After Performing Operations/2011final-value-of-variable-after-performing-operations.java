class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int i=0;
        for(String s:operations){
            if(s.charAt(0)=='+' || s.charAt(s.length()-1)=='+'){
                i++;
            }
            else{
                i--;
            }
        }
        return i;
    }
}