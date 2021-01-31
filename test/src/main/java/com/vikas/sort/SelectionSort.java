package com.vikas.sort;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class SelectionSort
{
   private static final Logger logger = LogManager.getLogger( SelectionSort.class);

   public static void main(String[] args)
   {
      Integer[] arr = {8, 1, 56, 4, 7, 1, 87, 0};
      Arrays.stream( selectionSort( arr ) ).forEach( logger::debug );
   }

   private static Integer[] selectionSort( Integer[] arr )
   {
      for(int i= 0; i< arr.length; i++){
         int min = i;
         int temp = arr[i];
         for (int j=i+1; j<arr.length; j++) {
            if( arr[j]<arr[min])
            {
               min = j;
            }

         }
         arr[i] = arr[min];
         arr[min] = temp;
      }
      return arr;
   }
}
