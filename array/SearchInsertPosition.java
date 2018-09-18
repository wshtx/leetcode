package leetcode.array;

/**问题描述：
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 你可以假设数组中无重复元素。
 * 示例 1:
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * 示例 2:
 * 输入: [1,3,5,6], 2
 * 输出: 1
 * 示例 3:
 * 输入: [1,3,5,6], 7
 * 输出: 4
 * 示例 4:
 * 输入: [1,3,5,6], 0
 * 输出: 0
 * @ClassName SearchInsertPosition
 * @Author htx
 * @Date 2018/9/13 21:52
 * @Version 1.0
 **/
public class SearchInsertPosition {


    public static int searchInsert(int[] nums,int target){
        int mid  = 0,left = 0,right = nums.length-1;

        while(left <= right){
            mid = left + ((right - left) >> 1);
            if(nums[mid] < target){
                left = mid + 1;
            }else if(nums[mid] > target){
                right = mid - 1 ;
            }else{
                return mid;
            }
        }
        return nums[mid] > target ?  mid : mid + 1;
    }

    public static void main(String[] args) {
        int[] ints = {1,3,5,6};
        System.out.println(searchInsert(ints,7));
    }
}