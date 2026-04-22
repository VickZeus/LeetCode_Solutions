class Solution {

    public boolean check(String k,String j,int n){
        int count=0;
        for(int i=0;i<n;i++){
            count+=(k.charAt(i)==j.charAt(i))?0:1;
            if(count>2)return false;
        }
        return true;
    }

    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> ans=new ArrayList<>();
        int n=queries[0].length();

        for(String k:queries){ // O(size(queries))
            for(String j:dictionary){ //O(size(dictionary))
                if(check(k,j,n)){
                    ans.add(k);break;
                }
            }
        }
        return ans;
    }
}