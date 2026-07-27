class Solution {
    public int maxProduct(int[] nums) {
        int large = 1, secondLarge = 1;

        for(int i : nums){
            if(large <= i){
                secondLarge = large;
                large = i;
            }
            else if( secondLarge <= i){
                secondLarge = i;
            }
        }
        return (large - 1) * (secondLarge - 1);
    }
}