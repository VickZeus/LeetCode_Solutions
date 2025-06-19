class Solution {
    public String frequencySort(String s) 
    {
        HashMap<Character,Integer> obj=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            obj.put(ch,obj.getOrDefault(ch,0)+1);
        }

        PriorityQueue<Character> ans=new PriorityQueue<>(
            (a,b)->{
                int fa=obj.get(a);
                int fb=obj.get(b);
                if(fa!=fb)return fb-fa;
                return a-b;
            }
        );
        for(char ch:s.toCharArray())ans.add(ch);
        StringBuilder ans2=new StringBuilder("");
        while(!ans.isEmpty())ans2.append(ans.poll());
        return ans2.toString();
    }
}