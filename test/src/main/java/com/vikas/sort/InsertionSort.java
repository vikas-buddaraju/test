package com.vikas.sort;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class InsertionSort
{
   private static final Logger logger = LogManager.getLogger( InsertionSort.class);

   public static void main(String [] args)
   {
      Integer[] arr = {8, 1, 54, 9, 65, 1, 100, 0, 45};
      Arrays.stream( insertionSort( arr ) ).forEach( logger::debug );
      Arrays.stream( insertionSort1( arr ) ).forEach( logger::debug );


   }

   private static Integer[] insertionSort1( Integer[] array )
   {
      int n = array.length;
      for (int j = 1; j < n; j++) {
         int key = array[j];
         int i = j-1;
         while ( (i > -1) && ( array [i] > key ) ) {
            array [i+1] = array [i];
            i--;
         }
         array[i+1] = key;
      }
      return array;
   }

   private static Integer[] insertionSort( Integer[] arr )
   {
      List<Integer> list = new LinkedList<>( Arrays.asList( arr ) );
      for(int i=1; i< list.size(); i++)
      {
         if(list.get( 1 ) <= list.get( 0 ))
         {
            list.add( 0, list.get( i ) );
            list.remove( i+1 );
         }
         else {
            if(list.get( i ) < list.get( i-1 ))
            {
               for(int j=1; j<i; j++)
               {
                  if(list.get( i )> list.get( j-1 ) && list.get( i )< list.get( j ))
                  {
                     list.add( j, list.get( i ) );
                     list.remove( i+1 );
                  }
               }
            }
         }
      }
      return list.toArray(new Integer[0]);
   }
}
