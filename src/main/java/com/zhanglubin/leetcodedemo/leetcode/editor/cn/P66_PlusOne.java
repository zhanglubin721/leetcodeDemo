package com.zhanglubin.leetcodedemo.leetcode.editor.cn;

//给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。 
//
// 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。 
//
// 你可以假设除了整数 0 之外，这个整数不会以零开头。 
//
// 
//
// 示例 1： 
//
// 
//输入：digits = [1,2,3]
//输出：[1,2,4]
//解释：输入数组表示数字 123。
// 
//
// 示例 2： 
//
// 
//输入：digits = [4,3,2,1]
//输出：[4,3,2,2]
//解释：输入数组表示数字 4321。
// 
//
// 示例 3： 
//
// 
//输入：digits = [0]
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= digits.length <= 100 
// 0 <= digits[i] <= 9 
// 
//
// Related Topics 数组 数学 👍 1193 👎 0

/**
 * 加一
 *
 * @author saint
 */
public class P66_PlusOne{
    public static void main(String[] args) {
        Solution solution = new P66_PlusOne().new Solution();
        int[] param = new int[]{9, 9, 9};
        int[] ints = solution.plusOne(param);
        System.out.println(1);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int carry = 0;
        digits[len - 1] = digits[len - 1] + 1;
        for (int i = len - 1; i >= 0; i--) {
            if (digits[i] + carry == 10) {
                digits[i] = 0;
                carry = 1;
            } else {
                digits[i] = digits[i] + carry;
                carry = 0;
                break;
            }
        }
        int[] newResult = new int[len + 1];
        if (carry == 1) {
            newResult[0] = 1;
            System.arraycopy(digits, 0, newResult, 1, len);
            digits = newResult;
        }
        return digits;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}