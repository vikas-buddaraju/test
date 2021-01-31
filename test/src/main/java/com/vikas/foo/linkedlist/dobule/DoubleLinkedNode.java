package com.vikas.foo.linkedlist.dobule;

public class DoubleLinkedNode
{
   private int        value;
   private DoubleLinkedNode next;
   private DoubleLinkedNode previous;

   public DoubleLinkedNode( int value )
   {
      this.value = value;
      this.next = null;
      this.previous =null;
   }

   public int getValue()
   {
      return value;
   }

   public void setValue( int value )
   {
      this.value = value;
   }

   public DoubleLinkedNode getNext()
   {
      return next;
   }

   public void setNext( DoubleLinkedNode next )
   {
      this.next = next;
   }

   public DoubleLinkedNode getPrevious()
   {
      return previous;
   }

   public void setPrevious( DoubleLinkedNode previous )
   {
      this.previous = previous;
   }
}
