package leetcodeproblems.LC_001_100;

import datastructures.ListNode;

//https://leetcode.com/problems/merge-two-sorted-lists/
public class S_021_MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) {
            return list2;
        }
        if(list2 == null) {
            return list1;
        }

        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;

        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                p.next = list1;
                list1 = list1.next;
            } else {
                p.next = list2;
                list2 = list2.next;
            }

            p = p.next;
        }

        if(list1 != null) {
            p.next = list1;
        }

        if(list2 != null) {
            p.next = list2;
        }

        return dummy.next;
    }
}
