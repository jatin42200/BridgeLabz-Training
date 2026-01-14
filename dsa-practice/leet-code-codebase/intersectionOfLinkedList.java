public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode v=headA;
        ListNode vgf=headB;
        while(vgf!=v)
        {
            if(v==null)
            {
                v=headB;

            }
            else
            {
                v=v.next;
            }
            if(vgf==null)
            {
                vgf=headA;
            }
            else
            {
                vgf=vgf.next;

            }
        }
        
        return vgf;
    }
}