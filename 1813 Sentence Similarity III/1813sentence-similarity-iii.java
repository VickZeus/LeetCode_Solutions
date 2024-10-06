class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) 
    {
        if(sentence1.equals(sentence2))return true;
        //boolean k=false;
        String big=(sentence1.length()>sentence2.length())?sentence1:sentence2;    // get the bigger string
        String small=(big.equals(sentence1))?sentence2:sentence1; // Get small
        String[] b_array=big.split(" ");
        String[] s_array=small.split(" ");
        int pre=0,suff=0;
        int i=0;
        if(s_array.length==1)
        {
            if(b_array[0].equals(s_array[0]) || b_array[b_array.length-1].equals(s_array[s_array.length-1]))return true;
            return false;
        }
        while(b_array[i].equals(s_array[i])) // count common suffixes
        {
            ++pre;i++;
            if(i>b_array.length-1 || i>s_array.length-1)break;
        }
        i=0;
        while(b_array[b_array.length-1-i].equals(s_array[s_array.length-1-i]))
        {
            ++suff;i++;
            if(i>b_array.length-1 || i>s_array.length-1)break;
        }
        return (pre+suff>=s_array.length);
    }
}