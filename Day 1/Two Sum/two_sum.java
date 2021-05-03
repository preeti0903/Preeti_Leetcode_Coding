class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        int first;
        int second;
        for(int i=0;i<nums.length;i++){
            first=nums[i];
            for(int j=0;j<nums.length;j++){
                second=nums[j];
                if(first+second==target && i!=j){
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        return arr;
    }
}
