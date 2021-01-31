package com.vikas.foo.linkedlist.single;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyLinkedList
{
   private LinkedNode head;
   private LinkedNode tail;
   private int length;

   private static final Logger logger = LogManager.getLogger( MyLinkedList.class);

   public MyLinkedList( int value )
   {
      this.head = new LinkedNode( value );
      this.tail = head;
      this.length = 1;
   }

   public LinkedNode getHead()
   {
      return head;
   }

   //1->2->3
   public void append(int value)
   {
      LinkedNode node = new LinkedNode( value );
      this.tail.setNext( node );
      tail = node;
      length++;
   }
   // 0->1->2->4
   public void prePend(int value)
   {
      LinkedNode node = new LinkedNode( value );
      node.setNext( head );
      this.head = node;
      length++;
   }

   //0->1->2->3
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
         LinkedNode current = head;
         for(int i=0; i<index-1; i++)
         {
            current = current.getNext();
         }
         LinkedNode node = new LinkedNode( value );
         node.setNext( current.getNext() );
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
         LinkedNode current = this.head;
         this.head = current.getNext();
         length --;
      }else {
         LinkedNode current = this.head;
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
            LinkedNode itemToRemove = current.getNext();
            current.setNext( itemToRemove.getNext() );
            length--;
         }


      }

   }

   //0->1->2
   public void reverse()
   {
      if(this.length == 1)
      {
         return;
      }
      LinkedNode first = this.head;
      this.tail = this.head;
      LinkedNode second = this.head.getNext();
      while(second !=null)
      {
         LinkedNode temp = second.getNext();
         second.setNext( first );
         first = second;
         second = temp;

      }
      this.head.setNext( null );
      this.head = first;


   }

   public void printList()
   {

      LinkedNode current = head;
      while( current != null )
      {
         logger.debug(current.getValue());
         current= current.getNext();
      }

   }
}
