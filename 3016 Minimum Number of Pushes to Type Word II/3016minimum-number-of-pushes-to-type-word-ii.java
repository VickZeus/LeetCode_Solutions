class Solution {
    public int minimumPushes(String word) {
        int[] freq=new int[26];
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int n=word.length(),count=0,answer=0,mult=0;

        for(int i=0;i<n;i++)freq[word.charAt(i)-'a']+=1;
        for(int i=0;i<26;i++){if(freq[i]>0)pq.add(freq[i]);}

        while(!pq.isEmpty()){
            int temp=pq.poll();
            count++;

            if(count<=8){
                mult=1;
            }
            else if(count<=16){
                mult=2;
            }
            else if(count<=24){
                mult=3;
            }
            else{
                mult=4;
            }
            answer+=mult*temp;
        }
        return answer;
    }
}