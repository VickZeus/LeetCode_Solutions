class Solution {
    List<Integer> ans;
    
    public List<Integer> findGoodIntegers(int n) {
        ans=new ArrayList<>();
        int limit=(int)Math.cbrt(n)+1;
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int a=1;a<=limit;a++){
            for(int b=a;b<=limit;b++){
                int number=a*a*a+b*b*b;
                if(number>n)break;
                hm.put(number,hm.getOrDefault(number,0)+1);
            }
        }

        for(int key:hm.keySet()){
            if(hm.get(key)>=2)ans.add(key);
        }
        Collections.sort(ans);
        return ans;
        
    }
}