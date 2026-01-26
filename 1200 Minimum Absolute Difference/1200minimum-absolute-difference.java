class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        int minDiff=Integer.MAX_VALUE;
        for(int i=0;i+1<n;i++){
            minDiff=Math.min(minDiff,arr[i+1]-arr[i]);
        }

        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i+1<n;i++){
            if(Math.abs(arr[i+1]-arr[i])==minDiff){
                ans.add(new ArrayList<Integer>(Arrays.asList(arr[i],arr[i+1])));
            }
        }
        return ans;
    }
}