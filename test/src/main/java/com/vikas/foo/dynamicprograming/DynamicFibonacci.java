package com.vikas.foo.dynamicprograming;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;

public class DynamicFibonacci
{
   static                  HashMap<Integer, Integer> cache           = new HashMap<>();
   static                  int                       operationsCount = 0;
   private static final Logger                    logger          = LogManager.getLogger( DynamicFibonacci.class);

   public static void main (String [] args)
   {
      DynamicFibonacci fib = new DynamicFibonacci();
      logger.debug(fib.fibonacciMaster(100));
      logger.debug( operationsCount);

   }

   private int fibonacciMaster( int n )
   {
      if(cache.containsKey( n ))
      {
         return cache.get( n );
      }else {
         operationsCount++;
         if(n<2)
         {
            return n;
         }else {

            cache.put( n, fibonacciMaster( n-1 )+ fibonacciMaster( n-2 ) );
            return cache.get( n );
         }
      }

   }
}
