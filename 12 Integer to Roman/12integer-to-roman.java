class Solution {
    HashMap<Integer,String> hm;
    public void makeHM(){
        hm.put(1100,"MC");
        hm.put(1000,"M");
        hm.put(900,"CM");
        hm.put(600,"DC");
        hm.put(500,"D");
        hm.put(400,"CD");
        hm.put(100,"C");
        hm.put(90,"XC");
        hm.put(50,"L");
        hm.put(40,"XL");
        hm.put(10,"X");
        hm.put(5,"V");
        hm.put(9,"IX");
        hm.put(4,"IV");
        hm.put(1,"I");
    }

    public String intToRoman(int num) {
        hm=new HashMap<>();
        makeHM();
        int[] values = {1000,900,600,500,400,100,90,50,40,10,9,5,4,1};
        StringBuilder s=new StringBuilder("");
        for(int k:values){
            if(k>num)continue;
            int n=num/k;
            for(int i=0;i<n;i++)s.append(hm.get(k));
            num=num%k;
        }
        return s.toString();
    }
}