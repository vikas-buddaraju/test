package com.vikas.bar;

/**
 Part 1: Implement a data-structure that supports dictionary operations, get, put, delete, along with a special operation get_random_val; this latter function should return a uniformly random value sampled from all the values in the dictionary. Each function should run in constant time, with the exception of delete, which for this part we relax to linear time.

 Part 2: Given an implementation of the aforementioned data-structure, modify the code to sample from the unique values in the dictionary. For example, given a dictionary {'a': 5, 'b': 5, 'c': 6, 'd': 5}, 5 and 6 should both have an equal probability of being selected. The time complexity of each method should not change, with the exception of put, which under a certain case may run in linear time.

 dic.put("name", "Vikas")
 dic.get("name")
 dic.delete("name")
 **/


import java.util.*;


public class Dictionary {

   private Map<String, String> map = new HashMap<>();

   private Set<String> random = new HashSet<>();

   private List<String> randomList = new ArrayList<>();



   public static void main(String [] args)
   {
      Dictionary dict = new Dictionary();
      dict.put("name", "vikas");
      dict.put("last", "buddaraju");
      dict.put("company", "AA");
      dict.put("place", "DFW");
      dict.delete("last");

      System.out.println( dict.get("name"));
      System.out.println(dict.getRandomValue());


   }

   //get
   public String get(String x)
   {
      if(map.containsKey(x))
      {
         return  map.get(x);

      }

      return "";



   }

   //put
   public void put(String x, String y)
   {
      map.put(x, y);
      if(random.add(y))
      {
         randomList.add( y );
      }

   }

   //delete
   public void delete(String x)
   {
      map.remove(x);
      Set<String> set = new HashSet<>();

      //iterate through map and add all values to list
      map.forEach((key, value)-> {
         set.add(value);
      });
      randomList = new ArrayList<>( set );
      random = set;

   }

   //getRandomValue
   public String getRandomValue()
   {
      int max = randomList.size() -1;

      int ran = (int) (Math.random() * max +1);



      return randomList.get(ran);


   }


}



