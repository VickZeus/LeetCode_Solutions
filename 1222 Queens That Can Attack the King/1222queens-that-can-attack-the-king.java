class Solution {
    public List<List<Integer>> ans;
    public int[][] board;

    public void colInc(int r,int c){
        while(c<8){
            if(board[r][c]==1){
                ans.add(new ArrayList<>(Arrays.asList(r,c)));break;
            }
            c++;
        }
    }

    public void colDec(int r,int c){
        while(c>-1){
            if(board[r][c]==1){
                ans.add(new ArrayList<>(Arrays.asList(r,c)));break;
            }
            c--;            
        }
    }

    public void rowInc(int r,int c){
        while(r<8){
            if(board[r][c]==1){
                ans.add(new ArrayList<>(Arrays.asList(r,c)));break;
            }
            r++;            
        }        
    }

    public void rowDec(int r,int c){
        while(r>-1){
            if(board[r][c]==1){
                ans.add(new ArrayList<>(Arrays.asList(r,c)));break;
            }
            r--;            
        }
    }

    public void ir_ic(int r,int c){
        while(c<8 && r<8){
            if(board[r][c]==1){
                ans.add(new ArrayList<>(Arrays.asList(r,c)));break;
            }
            c++;r++;            
        }
    }

    public void dr_dc(int r,int c){
        while(c>-1 && r>-1){
            if(board[r][c]==1){
                ans.add(new ArrayList<>(Arrays.asList(r,c)));break;
            }
            c--;r--;            
        }
    }

    public void dr_ic(int r,int c){
        while(r>-1 && c<8){
            if(board[r][c]==1){
                ans.add(new ArrayList<>(Arrays.asList(r,c)));break;
            }
            c++;r--;            
        }
    }

    public void ir_dc(int r,int c){
        while(r<8 && c>-1){
            if(board[r][c]==1){
                ans.add(new ArrayList<>(Arrays.asList(r,c)));break;
            }
            c--;r++;            
        }
    }


    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        board=new int[8][8];
        for(int[] q:queens)board[q[0]][q[1]]=1;

        ans=new ArrayList<>();
        int r=king[0],c=king[1];
        rowInc(r,c);rowDec(r,c);
        colInc(r,c);colDec(r,c);
        ir_ic(r,c);dr_dc(r,c);
        dr_ic(r,c);ir_dc(r,c);

        return ans;
    }
}