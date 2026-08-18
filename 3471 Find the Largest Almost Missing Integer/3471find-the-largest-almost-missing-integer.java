class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        int[] freq=new int[51];
        for(int left=0;left<=n-k;left++){
            boolean[] seen=new boolean[51];
            for(int i=left;i<left+k;i++)seen[nums[i]]=true;

            for (int num=0; num <= 50; num++) {
                if (seen[num]) {
                    freq[num]++;
                }
            }
        }

        for (int num = 50; num >= 0; num--) {
            if (freq[num] == 1) {
                return num;
            }
        }

        return -1;
    }
}