class Solution {
    public String convertToTitle(int columnNumber) {
        // A->65 Z->90 : here A->1 so basically char(A)-64 
        StringBuilder ans=new StringBuilder("");
        while(columnNumber>0){
            int rem=(columnNumber-1)%26;
            ans.append((char)('A'+rem));
            System.out.println(rem);
            columnNumber=(columnNumber-1)/26;
        }
        return ans.reverse().toString();
    }
}