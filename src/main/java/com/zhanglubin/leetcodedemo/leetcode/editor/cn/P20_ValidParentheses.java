package com.zhanglubin.leetcodedemo.leetcode.editor.cn;

//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。 
//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 每个右括号都有一个对应的相同类型的左括号。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "()"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：s = "()[]{}"
//输出：true
// 
//
// 示例 3： 
//
// 
//输入：s = "(]"
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 10⁴ 
// s 仅由括号 '()[]{}' 组成 
// 
//
// Related Topics 栈 字符串 👍 3742 👎 0

import java.util.HashMap;
import java.util.LinkedList;

/**
 * 有效的括号
 *
 * @author saint
 */
public class P20_ValidParentheses{
    public static void main(String[] args) {
        Solution solution = new P20_ValidParentheses().new Solution();
        boolean valid = solution.isValid("(}");
        System.out.println(valid);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = initMap();
        LinkedList<Character> auxiliaryStack = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (auxiliaryStack.size() == 0) {
                if (map.get(c) == null) {
                    return false;
                } else {
                    auxiliaryStack.add(c);
                }
            } else {
                if (map.get(c) != null) {
                    auxiliaryStack.add(c);
                } else if (map.get(auxiliaryStack.removeLast()) != c){
                    return false;
                }
            }
        }
        if (auxiliaryStack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public HashMap<Character, Character> initMap() {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        return map;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}