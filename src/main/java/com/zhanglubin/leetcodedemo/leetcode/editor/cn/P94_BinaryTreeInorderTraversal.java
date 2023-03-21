package com.zhanglubin.leetcodedemo.leetcode.editor.cn;

//给定一个二叉树的根节点 root ，返回 它的 中序 遍历 。 
//
// 
//
// 示例 1： 
// 
// 
//输入：root = [1,null,2,3]
//输出：[1,3,2]
// 
//
// 示例 2： 
//
// 
//输入：root = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：root = [1]
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 树中节点数目在范围 [0, 100] 内 
// -100 <= Node.val <= 100 
// 
//
// 
//
// 进阶: 递归算法很简单，你可以通过迭代算法完成吗？ 
//
// Related Topics 栈 树 深度优先搜索 二叉树 👍 1748 👎 0

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的中序遍历
 *
 * @author saint
 */
public class P94_BinaryTreeInorderTraversal{
    public static void main(String[] args) {
        Solution solution = new P94_BinaryTreeInorderTraversal().new Solution();
        
    }

    //leetcode submit region begin(Prohibit modification and deletion)

//Definition for a binary tree node.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        dfs(result, root);
        return result;
    }

    void dfs(List<Integer> result, TreeNode curNode) {
        if (curNode == null) {
            return;
        }
        dfs(result, curNode.left);
        result.add(curNode.val);
        dfs(result, curNode.right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}