class Solution {
    public void sortColors(int[] nums) {
        int low=0,mid=0,high = nums.length-1;

        // this approach we are creating result in three parts low=0,mid=1 and high =2
        while(mid<=high){
            if(nums[mid]==0){
                int temp = nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++; // each time when mid value=0 then it swap with low  and increment low with 1 to fill next index value
                mid++; // mid also increment


            } else if(nums[mid]==1){
                mid++;
            } else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp; // vice versa with high 
                high--;
            }
        }
        // the whole thing depend on mid like it start from 0 index and reach to its correct position and arraging all b/w nums by swapping
    }
}