class Solution {
    int c;

    public void floodIt(int[][] image,int sr,int sc,int color){
        if(sr==image.length || sc==image[0].length || sr<0 || sc<0)return;

        image[sr][sc]=color;

        if(sc+1<image[0].length && image[sr][sc+1]==c)floodIt(image,sr,sc+1,color);
        if(sr+1<image.length && image[sr+1][sc]==c)floodIt(image,sr+1,sc,color);
        if(sr-1>=0 && image[sr-1][sc]==c)floodIt(image,sr-1,sc,color);
        if(sc-1>=0 && image[sr][sc-1]==c)floodIt(image,sr,sc-1,color);
    }


    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        c=image[sr][sc];
        if(c==color)return image;
        floodIt(image,sr,sc,color);

        return image;
    }
}