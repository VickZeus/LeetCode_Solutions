class Solution {
    public List<String> findRepeatedDnaSequences(String s){
        int n=s.length(),k;
        HashMap<String,Integer> obj=new HashMap<>();
        List<String> ans=new ArrayList<>();
        String s2;

        for(int i=0;i<=n-10;i++){
            s2=s.substring(i,i+10);
            k=obj.getOrDefault(s2,0);
            if(k==0){
                obj.put(s2,1);
            }
            else if(k==1){
                ans.add(s2);
                obj.put(s2,-1);
            }
        }
        return ans;
    }
}