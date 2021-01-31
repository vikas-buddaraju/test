package com.vikas.foo.Stack.arraydata;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class MyStack
{
   private List<Integer> array = new ArrayList<>();

   private static final Logger logger = LogManager.getLogger( MyStack.class);

   public int peek()
   {
      if (array.isEmpty())
      {
         throw new EmptyStackException();
      }
      return array.get( array.size() - 1 );
   }

   public void push(int value)
   {
      array.add( value );

   }

   public int pop()
   {
      if (array.isEmpty())
      {
         throw new EmptyStackException();
      }
      return array.remove( array.size()-1);

   }

   public void printStack()
   {
      array.forEach( logger::debug );
   }
}
