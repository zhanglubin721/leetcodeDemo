package com.zhanglubin.leetcodedemo.leetcode.editor.cn;

//给你一个字符串 columnTitle ，表示 Excel 表格中的列名称。返回 该列名称对应的列序号 。 
//
// 例如： 
//
// 
//A -> 1
//B -> 2
//C -> 3
//...
//Z -> 26
//AA -> 27
//AB -> 28 
//... 
//
// 
//
// 示例 1: 
//
// 
//输入: columnTitle = "A"
//输出: 1
// 
//
// 示例 2: 
//
// 
//输入: columnTitle = "AB"
//输出: 28
// 
//
// 示例 3: 
//
// 
//输入: columnTitle = "ZY"
//输出: 701 
//
// 
//
// 提示： 
//
// 
// 1 <= columnTitle.length <= 7 
// columnTitle 仅由大写英文组成 
// columnTitle 在范围 ["A", "FXSHRXW"] 内 
// 
//
// Related Topics 数学 字符串 👍 376 👎 0

/**
 * Excel 表列序号
 *
 * @author saint
 */
public class P171_ExcelSheetColumnNumber{
    public static void main(String[] args) {
        Solution solution = new P171_ExcelSheetColumnNumber().new Solution();
        int ab = solution.titleToNumber("FXSHRXW");
        System.out.println(ab);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int titleToNumber(String columnTitle) {
        int titleLength = columnTitle.length();
        long sum = 0;
        for (int i = 0; i < titleLength; i++) {
            sum = sum * 26 + columnTitle.charAt(i) - 'A' + 1;
        }
        return (int) sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}