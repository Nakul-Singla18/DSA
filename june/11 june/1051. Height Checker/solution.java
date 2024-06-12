class Solution {
    public int heightChecker(int[] heights) {
        int[] SortedHeights = heights.clone();
        Arrays.sort(SortedHeights);


        int count=0;
        for(int i =0; i< heights.length;i++)
        {
            if(heights[i] !=SortedHeights[i]){
                count++;
            }
        }

        return count;
    }
}
