class Solution {
    public void sortColors(int[] nums) {
        int index=0;
        int head=0;
        int tail=nums.length-1;
        while(index<=tail){
            if(nums[index]==2){
                nums[index]=nums[tail]; //这里index不动是个难点，具体例子为[1,2,0]
                nums[tail--]=2;
                continue;
            }
            if(nums[index]==0){
                nums[index++]=nums[head];
                nums[head++]=0;
                continue;
            }
            index++;
        }

    }
}
