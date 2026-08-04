class Solution {
    List<String> ans;
    HashMap<Character,String> hm;

    public void compute(int j,String digits,String curr,int n){
        if(curr.length()==n){
            ans.add(curr);return;
        }

        for(char ch:hm.get(digits.charAt(j)).toCharArray()){
            compute(j+1,digits,curr+String.valueOf(ch),n);
        }
    }

    public List<String> letterCombinations(String digits) {
        ans=new ArrayList<>();
        hm=new HashMap<>();
        hm.put('2',"abc");hm.put('3',"def");hm.put('4',"ghi");
        hm.put('5',"jkl");hm.put('6',"mno");hm.put('7',"pqrs");
        hm.put('8',"tuv");hm.put('9',"wxyz");
        compute(0,digits,"",digits.length());
        return ans;    
    }
}