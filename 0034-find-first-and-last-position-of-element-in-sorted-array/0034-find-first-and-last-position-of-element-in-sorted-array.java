class Solution {
    public static int firstP(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int res = -1;
        while(start <= end){
            int mid = (start + end)/2;
            if(target == nums[mid]){
                res = mid;
                end = mid-1;
            }
            else if (target < nums[mid]){
                end = mid-1;
            }
            else{
                start= mid+1;
            }
        } return res;
    } 


    
      public static int lastP(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int res = -1;
        while(start <= end){
            int mid = (start + end)/2;
            if(target == nums[mid]){
                res = mid;
                start = mid + 1;
            }
            else if (target < nums[mid]){
                end = mid-1;
            }
            else{
                start= mid+1;
            }
        } return res;
    }
    public int[] searchRange(int[] nums, int target) {
        int firstP = firstP(nums , target);
        int lastP= lastP(nums, target);
        return new int[]{firstP,lastP};
    }
}