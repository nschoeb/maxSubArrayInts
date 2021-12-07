public class Solution {
    public static void main(String[] args) {
        int[] nums={4,2,-4,4,5};
        System.out.println(maxSubArray(nums));

    }
    public static int maxSubArray(int[] nums) {

        int max=Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0)sum=0;
        }return max;

    }
}
