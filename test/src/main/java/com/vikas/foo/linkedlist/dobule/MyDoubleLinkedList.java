package com.vikas.foo.linkedlist.dobule;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyDoubleLinkedList
{
   private DoubleLinkedNode head;
   private DoubleLinkedNode tail;
   private int length;

   private static final Logger logger = LogManager.getLogger( MyDoubleLinkedList.class);

   public MyDoubleLinkedList(int value)
   {
      this.head = new DoubleLinkedNode( value );
      this.tail = head;
      length = 1;
   }

   //1->2->3
   public void append(int value)
   {
      DoubleLinkedNode node = new DoubleLinkedNode( value );
      node.setPrevious( this.tail );
      this.tail.setNext( node );
      this.tail = node;
      length++;
   }
   // 0->1->2->4
   public void prePend(int value)
   {
      DoubleLinkedNode node = new DoubleLinkedNode( value );
      node.setNext( this.head );
      this.head.setPrevious( node );
      this.head = node;
      length++;
   }

   //0->1->2->3->4
   public void insert(int value, int index)
   {
      if(index > length || index < 0)
      {
         return;
      }
      else if (index == 0) {
         prePend(value);
      } else if (index == length) {
         append(value);
      } else {
         DoubleLinkedNode current = head;
         for(int i=0; i<index-1; i++)
         {
            current = current.getNext();
         }
         DoubleLinkedNode node = new DoubleLinkedNode( value );
         node.setPrevious( current );
         node.setNext( current.getNext() );
         current.getNext().setPrevious( node );
         current.setNext( node );
         length++;
      }


   }

   //0->1->2->3
   public void remove(int index)
   {
      if(index > length || index < 0)
      {
         return;
      }else if (index == 0)
      {
         DoubleLinkedNode current = this.head;
         this.head = current.getNext();
         current.getNext().setPrevious( this.head );
         length --;
      }else {
         DoubleLinkedNode current = this.head;
         for(int i= 0; i< index-1; i++)
         {
            current = current.getNext();
         }
         if(length == index+1)
         {
            current.setNext( null );
            this.tail = current;
            length--;
         }else {
            DoubleLinkedNode itemToRemove = current.getNext();
            current.setNext( itemToRemove.getNext() );
            itemToRemove.getNext().setPrevious( current );
            length--;
         }


      }

   }

   public void printList()
   {

      DoubleLinkedNode current = head;
      while( current != null )
      {
         logger.debug(current.getValue());
         current= current.getNext();
      }

   }

}
