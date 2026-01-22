class Solution {

    public boolean check(ArrayList<Integer> list){
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1))return true;
        }
        return false;
    }

    public void update(ArrayList<Integer> list){
        int minSum=Integer.MAX_VALUE;
        int idx=-1;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)+list.get(i+1)<minSum){
                minSum=list.get(i)+list.get(i+1);
                idx=i;
            }
        }
        if(idx!=-1){
            list.set(idx,minSum);
            list.remove(idx+1);
        }
    }

    public int minimumPairRemoval(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int count=0;
        for(int i:nums)list.add(i);// O(n)
        while(check(list)){
            update(list);count++;
        }
        return count;
    }
}