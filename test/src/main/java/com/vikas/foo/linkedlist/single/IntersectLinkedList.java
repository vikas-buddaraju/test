package com.vikas.foo.linkedlist.single;

class ListNode
{
   int      val;
   ListNode next;

   ListNode( int x )
   {
      val = x;
      next = null;
   }
}

class IntersectLinkedList
{
   public static void main(String[] args)
   {
      // list 1
      ListNode n1 = new ListNode(1);
      n1.next = new ListNode(2);
      n1.next.next = new ListNode(3);
      n1.next.next.next = new ListNode(4);
      n1.next.next.next.next = new ListNode(5);
      n1.next.next.next.next.next = new ListNode(6);
      n1.next.next.next.next.next.next = new ListNode(7);
      // list 2
      ListNode n2 = new ListNode(10);
      n2.next = new ListNode(9);
      n2.next.next = new ListNode(8);
      n2.next.next.next = n1.next.next.next;

      // list 1
      ListNode n3 = new ListNode(3);

      // list 2
      ListNode n4 = new ListNode(1);
      n4.next = new ListNode(2);
      n4.next.next = n3;
      n4.next.next.next = new ListNode(4);

      n3.next = null;
      System.out.println(getIntersectionNode(n1, n2));
   }

   static ListNode getIntersectionNode( ListNode headA, ListNode headB ) {
      // boundary check
      if (headA == null || headB == null) {
         return null;
      }

      ListNode pA = headA;
      ListNode pB = headB;

      // if pA & pB have different len,
      // then we will stop the loop after second iteration
      while (pA != pB) {
         // for the end of first iteration,
         // we just redirect the pointer to the head of another linkedlist
         pA = pA == null ? headB : pA.next;
         pB = pB == null ? headA : pB.next;
      }

      return pA;
   }
}
