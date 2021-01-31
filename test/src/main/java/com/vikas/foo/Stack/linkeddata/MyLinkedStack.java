package com.vikas.foo.Stack.linkeddata;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.EmptyStackException;

public class MyLinkedStack
{
   private LinkedNode top;
   private LinkedNode bottom;
   private int length;

   private static final Logger logger = LogManager.getLogger( MyLinkedStack.class);


   public int peek()
   {
      if(length == 0) {
         throw new EmptyStackException();
      }
      return this.top.getValue();
   }

   public void push(int value)
   {
      this.top = new LinkedNode( value, top );
      if(length == 0) {
         bottom = top;
      }
      length++;
   }

   public int pop()
   {
      if(length == 0) {
         throw new EmptyStackException();
      }
      LinkedNode elementPop = this.top;
      this.top = elementPop.getNext();
      length--;
      if(length == 0)
      {
         this.bottom = null;
      }
      return elementPop.getValue();
   }

   public void printStack() {
      if(top == null) {
         return;
      }
      LinkedNode currentNode = top;
      logger.debug(currentNode.getValue());
      currentNode = currentNode.getNext();
      while (currentNode != null) {
         logger.debug("-->" + currentNode.getValue());
         currentNode = currentNode.getNext();
      }
   }
}
