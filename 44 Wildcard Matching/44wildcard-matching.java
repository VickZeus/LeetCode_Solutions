class Solution {
    int sl,pl;
    Boolean[][] status; 

    public boolean check(String s,String p, int si,int pi){
        if(status[si][pi]!=null)return status[si][pi];
        if(si==sl && pi==pl)return status[si][pi]=true;
        if(si!=sl && pi==pl)return status[si][pi]=false;

        if(si==sl && pi!=pl){
            while(pi<pl && p.charAt(pi)=='*')pi++;
            if(pi==pl)return status[si][pi]=true;
            return status[si][pi]=false;
        }

        char sc=s.charAt(si),pc=p.charAt(pi),pc2=' '; 
        
        if(pc=='?' || pc==sc){
            return status[si][pi]=check(s,p,si+1,pi+1); 
        }

        if(pc=='*'){
            while(pi<pl && p.charAt(pi)=='*')pi++; 
            if(pi==pl)return status[si][pi]=true;
            pc2=p.charAt(pi);//next character to * in pattern

            //Get last occurence of character in string s
            for(int idx=si;idx<=sl;idx++){
                if(check(s,p,idx,pi))return status[si][pi]=true;
            }
            return status[si][pi]=false;
        }
        return status[si][pi]=false;
    }

    public boolean isMatch(String s, String p) {
        sl=s.length();pl=p.length();
        status=new Boolean[sl+1][pl+1];

        if(s.length()==0){
            for(char ch:p.toCharArray())if(ch!='*')return false;
            return true;
        }
        return check(s,p,0,0);
    }
}