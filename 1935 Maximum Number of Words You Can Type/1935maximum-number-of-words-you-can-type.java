class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count=0;
        text=text+" ";
        HashSet<Character> k=new HashSet<>();
        for(int i=0;i<brokenLetters.length();i++)k.add(brokenLetters.charAt(i));
        int j=1;
        for(int i=0;i<text.length();i++){
            if(k.contains(text.charAt(i))){
                j=0;
            }
            if(text.charAt(i)==' '){
                count+=j;
                j=1;
            }
        }
        return count;
    }
}