class Solution {
    public int numberOfSubstrings(String s) {
        int[] arr={-1,-1,-1};
        int count=0;
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']=i;
            if(arr[0]!=-1 && arr[1]!=-1 && arr[2]!=-1){
                int minI=Math.min(arr[0],Math.min(arr[1],arr[2]));
                count+=minI+1;
            }
        }
        return count;
    }
}