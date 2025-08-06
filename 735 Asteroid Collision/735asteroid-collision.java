class Solution {
    public int[] stack;
    int top;

    public void push(int k){
        stack[++top]=k;
    }

    public void pop(){
        --top;
    }

    public int[] ans(){
        int[] ans=new int[top+1];
        for(int i=0;i<=top;i++){
            ans[i]=stack[i];
        }
        return ans;
    }
    public int[] asteroidCollision(int[] asteroids) {
        stack=new int[asteroids.length];
        top=-1;

        int x;
        for(int i=0;i<asteroids.length;i++){
            x=asteroids[i];
            if(top==-1){
                push(x);
            }
            else if(x<0 && stack[top]>0){
                if(Math.abs(x)==Math.abs(stack[top])){ //if both asteroids same size , then both explode !!
                    pop();
                }
                else if(Math.abs(x)>Math.abs(stack[top])){ //if the new asteroid is greater than the top asteroid ,then 
                    while( top!=-1 && (Math.abs(x)>Math.abs(stack[top])) && stack[top]>0){
                        pop();
                    }

                    if(top==-1){
                        push(x);continue;
                    }
                    if((Math.abs(x)==Math.abs(stack[top])) && stack[top]>0 ){
                        pop();continue;
                    }

                    if(stack[top]<0)push(x);


                }
                else if(Math.abs(x)<Math.abs(stack[top])){
                    continue;
                }
            }
            else{
                push(x);
            }
        }
        return ans();
    }
}