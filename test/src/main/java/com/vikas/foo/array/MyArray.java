package com.vikas.foo.array;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.Arrays;

public class MyArray
{
   private int length;
   private Object[] data;
   private int capacity;

   public MyArray(  )
   {
      this.length = 0;
      this.capacity = 1;
      this.data = new Object[1];
   }

   public Object get(int index)
   {
      if(index > -1 && index < capacity)
         return data[index];
      else
         return "index out of bound";
   }

   public void push(Object obj)
   {
      if (capacity == length){
         data = Arrays.copyOf( data, capacity*2);
         capacity *= 2;
      }
      data[length] = obj;
      length ++;
   }

   public Object pop()
   {
      if(length >=0)
      {
         Object obj = data[length - 1];
         data[length - 1] = null;
         length --;
         return obj;
      }
      return "Index out of Range";
   }

   //[1,3,3,4,5,]
   public boolean delete( int index)
   {
      if(index == length-1)
      {
         pop();
         return true;
      }
      else if(index >= 0 && index <= length-1)
      {
         shiftIndex(index);
         return true;
      }
      return false;
   }

   private void shiftIndex( int index )
   {
      if( length - 1 - index >= 0 )
         System.arraycopy( data, index + 1, data, index, length - 1 - index );
      data[length-1] = null;
      length--;

   }

   @Override
   public String toString()
   {
      return new ToStringBuilder( this ).append( "length", length )
                                        .append( "data", data )
                                        .append( "capacity", capacity )
                                        .toString();
   }
}
