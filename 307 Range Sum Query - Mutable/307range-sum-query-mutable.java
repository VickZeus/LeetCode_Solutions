class NumArray {
    public int[] tree;
    public int n;

    public void compute(int node,int left,int right,int[] nums){
        if(left==right){
            tree[node]=nums[left];
            return;
        }
        int mid=(left+right)/2;
        compute(2*node,left,mid,nums);
        compute(2*node+1,mid+1,right,nums);

        tree[node]=tree[2*node]+tree[2*node+1];
    }

    public NumArray(int[] nums) {
        n=nums.length;
        tree=new int[4*n];
        compute(1,0,n-1,nums);
        System.out.println(Arrays.toString(tree));
    }
    
    public void update(int index, int val) {
        updateTree(1,index,val,0,n-1);
    }

    public void updateTree(int node,int index,int val,int left,int right){
        if(left==right){tree[node]=val;return;}

        int mid=(left+right)/2;
        if(index<=mid){
            updateTree(2*node,index,val,left,mid);
        }
        else{
            updateTree(2*node+1,index,val,mid+1,right);
        }
        tree[node]=tree[2*node]+tree[2*node+1];
    }
    
    public int sumRange(int left, int right) {
        return query(1,0,n-1,left,right);
    }

    public int query(int node,int left,int right,int ql,int qr){
        if(qr<left || ql>right )return 0; // no overlap
        
        if(ql<=left && right<=qr ){
            return tree[node];
        }

        int mid=(left+right)/2;
        return query(2*node,left,mid,ql,qr)+query(2*node+1,mid+1,right,ql,qr);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */