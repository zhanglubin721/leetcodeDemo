package com.zhanglubin.leetcodedemo.leetcode.editor.cn;

//给定一个已排序的链表的头
// head ， 删除所有重复的元素，使每个元素只出现一次 。返回 已排序的链表 。 
//
// 
//
// 示例 1： 
// 
// 
//输入：head = [1,1,2]
//输出：[1,2]
// 
//
// 示例 2： 
// 
// 
//输入：head = [1,1,2,3,3]
//输出：[1,2,3]
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点数目在范围 [0, 300] 内 
// -100 <= Node.val <= 100 
// 题目数据保证链表已经按升序 排列 
// 
//
// Related Topics 链表 👍 954 👎 0

/**
 * 删除排序链表中的重复元素
 *
 * @author saint
 */
public class P83_RemoveDuplicatesFromSortedList{
    public static void main(String[] args) {
        Solution solution = new P83_RemoveDuplicatesFromSortedList().new Solution();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(1);
//        ListNode listNode3 = new ListNode(2);
//        ListNode listNode4 = new ListNode(3);
//        ListNode listNode5 = new ListNode(3);
        listNode1.next = listNode2;
//        listNode2.next = listNode3;
//        listNode3.next = listNode4;
//        listNode4.next = listNode5;
        ListNode listNode = solution.deleteDuplicates(listNode1);
        System.out.println(1);
    }

    //leetcode submit region begin(Prohibit modification and deletion)

//Definition for singly-linked list.
public static class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode tail = head;
        ListNode cur = head.next;
        tail.next = null;
        while (cur != null) {
            if (tail.val != cur.val) {
                tail.next = cur;
                tail = cur;
                cur = cur.next;
                tail.next = null;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}