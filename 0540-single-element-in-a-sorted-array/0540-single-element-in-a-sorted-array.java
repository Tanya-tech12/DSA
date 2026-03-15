class Solution {
    public int singleNonDuplicate(int[] nums) {
        int unique = 0;
        for(int tanya : nums ){
            unique ^= tanya;
            
        }
        return unique;
    }
}