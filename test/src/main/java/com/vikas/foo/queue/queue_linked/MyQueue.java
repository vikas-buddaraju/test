package com.vikas.foo.queue.queue_linked;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.NoSuchElementException;

public class MyQueue
{
   private LinkedNode first;
   private LinkedNode last;
   private int length;

   public MyQueue(  )
   {
      this.first = null;
      this.last = null;
      this.length = 0;
   }

   private static final Logger logger = LogManager.getLogger( MyQueue.class);

   public void enqueue(int value)
   {
      LinkedNode newNode = new LinkedNode( value );
      if(length == 0)
      {
         this.first = newNode;
         this.last = newNode;
      }
      else
      {
         this.last.setNext( newNode );
      }
      length++;
      this.last = newNode;

   }

   public int peek()
   {
      if(first == null) {
         throw new NoSuchElementException();
      }
      return first.getValue();
   }

   public int dequeue()
   {
      if(first == null) {
         throw new NoSuchElementException();
      }
      LinkedNode nodeRemove = this.first;
      this.first = this.first.getNext();
      length--;
      if(length == 0) {
         this.last = null;
      }
      return nodeRemove.getValue();
   }


}
