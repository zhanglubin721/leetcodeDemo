package com.zhanglubin.leetcodedemo.leetcode.editor.cn;

//给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。 
//
// 你可以假设数组是非空的，并且给定的数组总是存在多数元素。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [3,2,3]
//输出：3 
//
// 示例 2： 
//
// 
//输入：nums = [2,2,1,1,1,2,2]
//输出：2
// 
//
// 
//提示：
//
// 
// n == nums.length 
// 1 <= n <= 5 * 10⁴ 
// -10⁹ <= nums[i] <= 10⁹ 
// 
//
// 
//
// 进阶：尝试设计时间复杂度为 O(n)、空间复杂度为 O(1) 的算法解决此问题。 
//
// Related Topics 数组 哈希表 分治 计数 排序 👍 1741 👎 0

import java.util.HashMap;

/**
 * 多数元素
 *
 * @author saint
 */
public class P169_MajorityElement{
    public static void main(String[] args) {
        Solution solution = new P169_MajorityElement().new Solution();
        int i = solution.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2});
        System.out.println(i);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public int majorityElement(int[] nums) {
        int length = nums.length;
        int maxNum = nums[0];
        int maxCount = 1;
        for (int i = 1; i < length; i++) {
            if (nums[i] != maxNum) {
                if (--maxCount == 0) {
                    maxNum = nums[i];
                    maxCount = 1;
                }
            } else {
                maxCount++;
            }
        }
        return maxNum;
    }
//    public int majorityElement(int[] nums) {
//        int length = nums.length;
//        HashMap<Integer, Integer> numCountMap = new HashMap<>();
//        int maxCount = 0;
//        int maxNum = 0;
//        for (int i = 0; i < length; i++) {
//            if (numCountMap.get(nums[i]) == null) {
//                numCountMap.put(nums[i], 1);
//                if (maxCount < 1) {
//                    maxCount = 1;
//                    maxNum = nums[i];
//                }
//            } else {
//                numCountMap.put(nums[i], numCountMap.get(nums[i]) + 1);
//                if (maxCount < numCountMap.get(nums[i])) {
//                    maxCount = numCountMap.get(nums[i]);
//                    maxNum = nums[i];
//                }
//            }
//        }
//        return maxNum;
//    }
}
//leetcode submit region end(Prohibit modification and deletion)

}