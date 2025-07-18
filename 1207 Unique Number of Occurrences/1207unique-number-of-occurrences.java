class Solution {
    public boolean uniqueOccurrences(int[] arr) 
    {
        Arrays.sort(arr);
        HashSet<Integer> obj=new HashSet<>();
        int count=1;
        int curr=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(curr==arr[i]){
                count++;
            }
            else 
            {
                if(obj.contains(count))return false;
                obj.add(count);count=1;curr=arr[i];
            }
        }
        if(obj.contains(count))return false;
        return true;
    }
}