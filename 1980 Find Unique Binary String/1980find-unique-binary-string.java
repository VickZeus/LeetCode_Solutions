class Solution {
    public String findDifferentBinaryString(String[] nums) {
        String newS2="";int i=0;
        for(String k:nums)newS2+=(k.charAt(i++)=='0')?"1":"0";
        return newS2;
    }
}