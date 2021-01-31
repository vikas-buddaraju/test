package com.vikas.graph;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class MyGraph
{
   private HashMap<Integer, List<Integer>> adjacentList;
   private int                             numberOfNodes;

   private static final Logger logger = LogManager.getLogger( MyGraph.class);


   public MyGraph() {
      adjacentList = new HashMap<>();
      numberOfNodes = 0;
   }

   public void addNode(int value) {
      adjacentList.put(value, new ArrayList<>());
      numberOfNodes++;
   }

   public void addEdge(int value1, int value2) {
      adjacentList.get(value1).add(value2);
      adjacentList.get(value2).add(value1);
   }

   public int getNumberOfNodes() {
      return numberOfNodes;
   }

   public void showConnections() {

      adjacentList.forEach( (key, value) -> {
            String connections = value.stream()
                                       .map( String::valueOf )
                                       .sorted()
                                       .collect( Collectors.joining( ","));
            logger.debug( "key :{} and connections: {}", key, connections );
      } );

   }

}
