class Solution {
    String[] stack;
    int top;

    public void push(String s){
        stack[++top]=s;
    }

    public boolean anag(String s1,String s2){
        char[] ch1=s1.toCharArray();Arrays.sort(ch1);
        char[] ch2=s2.toCharArray();Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2))return true;
        return false;
    }

    public List<String> removeAnagrams(String[] words) {
        stack=new String[words.length];
        List<String> k=new ArrayList<>();
        top=-1;
        for(String s:words){
            if(top==-1){
                push(s);continue;
            }
            if(anag(stack[top],s)){
                continue;
            }
            else{
                push(s);
            }
        }

        for(int i=0;i<=top;i++){
            k.add(stack[i]);
        }
        return k;
    }
}