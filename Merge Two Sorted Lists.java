class Solution {
    public ListNode merge(ListNode A, ListNode B) {
        if (A == null) return B;
        if (B == null) return A;

        ListNode temp = new ListNode(0);
        ListNode tail = temp;
        while ( A != null && B != null ) {
            if ( A.val <= B.val) {
                tail.next = A;
                A = A.next;
            } else {
                tail.next = B;
                B = B.next;
            }
            tail = tail.next;
        }

        if ( A != null ) 
            tail.next = A;
        if ( B != null ) 
            tail.next = B;

        return temp.next;
    }
}