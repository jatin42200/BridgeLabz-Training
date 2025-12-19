class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) 
        return null;

        // Step 1: Count length
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int s = count - n + 1; // 1-based index

        // Step 2: If first node needs to be removed
        if (s == 1) {
            ListNode newHead = head.next;
            head.next = null; // optional
            return newHead;
        }

        // Step 3: Get previous node
        ListNode prev = GetNode(head, s - 1);
        ListNode catchh = prev.next;

        prev.next = catchh.next;
        catchh.next = null; // optional

        return head;
    }

    public ListNode GetNode(ListNode head, int k) {
        ListNode temp = head;
        for (int i = 1; i < k; i++) { // 1-based indexing
            temp = temp.next;
        }
        return temp;
    }
}