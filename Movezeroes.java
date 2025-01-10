class Solution {
    public void moveZeroes(int[] nums) {
        int [] arr=new int[nums.length];
        int a=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                arr[a]=nums[i];
                a=a+1;
             }

        }
        for(int i=a; i<nums.length;i++){
            arr[i]=0;
        }
        for(int i=0; i<nums.length; i++){
            nums[i]=arr[i];
        }
    }
}
