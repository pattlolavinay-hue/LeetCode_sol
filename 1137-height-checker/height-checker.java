class Solution {
    public int heightChecker(int[] heights) {
        int a[] = Arrays.copyOf(heights,heights.length);
        Arrays.sort(a);
        int c = 0;
        for(int i=0; i<heights.length; i++){
            if(a[i]!=heights[i]) c++;
        }
        return c;
    }
}