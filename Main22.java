// Trapping Rain Water
class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] lmax=new int[n];
        int[] rmax=new int[n];
        lmax[0]=height[0];
        rmax[n-1]=height[n-1];
        for(int i=1;i<height.length;i++)
        {
            lmax[i]=Math.max(height[i],lmax[i-1]);
        }
        for(int i=n-2;i>=0;i--)
        {
            rmax[i]=Math.max(height[i],rmax[i+1]);
        }
        int trappedwater=0;
        for(int i=0;i<height.length;i++)
        {
            int waterlevel=Math.min(rmax[i],lmax[i]);
            trappedwater=trappedwater+waterlevel-height[i];
        }
        return trappedwater;
    }
}
