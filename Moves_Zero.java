class Solution {
    public static void moveZeroes(int[] nums) {
        int size = nums.length;
        int j = 0;
        //To moves non-zero element to left side one by one
        for(int i = 0; i < size; i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        //moves all zero in rigth side
        for(int i=j ; i<size; i++){
          nums[i] = 0;
        }
        for(int i = 0 ; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    } 

    public static void main(String args[]){
        int arr[] = {0, 1, 0, 3, 12};
        moveZeroes(arr);
    }
}