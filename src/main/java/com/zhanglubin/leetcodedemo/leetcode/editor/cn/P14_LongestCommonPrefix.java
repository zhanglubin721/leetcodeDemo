package com.zhanglubin.leetcodedemo.leetcode.editor.cn;

//编写一个函数来查找字符串数组中的最长公共前缀。 
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 
//
// 示例 1： 
//
// 
//输入：strs = ["flower","flow","flight"]
//输出："fl"
// 
//
// 示例 2： 
//
// 
//输入：strs = ["dog","racecar","car"]
//输出：""
//解释：输入不存在公共前缀。 
//
// 
//
// 提示： 
//
// 
// 1 <= strs.length <= 200 
// 0 <= strs[i].length <= 200 
// strs[i] 仅由小写英文字母组成 
// 
//
// Related Topics 字典树 字符串 👍 2648 👎 0

import java.util.ArrayList;

/**
 * 最长公共前缀
 *
 * @author saint
 */
public class P14_LongestCommonPrefix{
    public static void main(String[] args) {
        Solution solution = new P14_LongestCommonPrefix().new Solution();
        String[] param = {"flower","flow","flight"};
        String s = solution.longestCommonPrefix(param);
        System.out.println(s);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        int maxPrefixLength = strs[0].length();
        int arrayLength = strs.length;
        for (int i = 0; i < maxPrefixLength; i++) {
            char curr = strs[0].charAt(i);
            for (int j = 1; j < arrayLength; j++) {
                if (i == strs[j].length() || curr != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}