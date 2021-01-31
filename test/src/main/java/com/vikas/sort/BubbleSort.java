package com.vikas.sort;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class BubbleSort
{
   private static final Logger logger = LogManager.getLogger( BubbleSort.class);

   public static void main(String [] args)
   {
      Integer[] array = {8, 1, 56, 4, 7, 1, 87, 0};
      Arrays.stream( bubbleSort( array ) ).forEach( logger::debug );

   }

   //99, 44, 6, 2
   private static Integer[] bubbleSort( Integer[] array )
   {
      int temp;
      int length = array.length;
      for(int i = 0; i< length; i++){
         for(int j = 0; j< length -1; j++){
            if(array[j] > array [j+1])
            {
               temp = array[j];
               array[j] =  array[j+1];
               array[j+1] = temp;
            }
         }

      }
      return array;
   }

}
