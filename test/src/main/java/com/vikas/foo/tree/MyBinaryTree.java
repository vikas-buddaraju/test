package com.vikas.foo.tree;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static java.lang.StrictMath.max;

public class MyBinaryTree
{
   private MyBinaryTreeNode root;

   private static final Logger logger = LogManager.getLogger( MyBinaryTree.class);


   public MyBinaryTree(  )
   {
      this.root = null;
   }

   public void insert(int value)
   {
      MyBinaryTreeNode newNode = new MyBinaryTreeNode( value );
      if(this.root == null)
      {
         this.root = newNode;
      }
      else
      {
         MyBinaryTreeNode currentNode = this.root;
         while( true )
         {
            if(value < currentNode.getValue())
            {
               if(currentNode.getLeft()==null)
               {
                  currentNode.setLeft( newNode );
                  return;
               }
               currentNode = currentNode.getLeft();
            }else {
               if(currentNode.getRight()==null)
               {
                  currentNode.setRight( newNode );
                  return;
               }
               currentNode = currentNode.getRight();
            }
         }
      }


   }

   public MyBinaryTreeNode lookup(int value)
   {
      if(this.root == null)
      {
         return null;
      }
      MyBinaryTreeNode currentNode = this.root;
      while( currentNode != null )
      {
         if(value < currentNode.getValue())
         {
            currentNode = currentNode.getLeft();
         }else if (value > currentNode.getValue())
         {
            currentNode = currentNode.getRight();
         }else if ( value == currentNode.getValue())
         {
            return currentNode;
         }

      }
      return null;
   }

   public void remove( int value )
   {
      if(this.root == null)
      {
         return;
      }
      MyBinaryTreeNode currentNode = this.root;
      MyBinaryTreeNode parentNode = null;
      while( currentNode != null )
      {
         if( value < currentNode.getValue())
         {
            parentNode = currentNode;
            currentNode = currentNode.getLeft();
         }else if( value > currentNode.getValue())
         {
            parentNode = currentNode;
            currentNode = currentNode.getRight();
         }else if( value == currentNode.getValue())
         {
            //we have a match

            //option 1
            if ( currentNode.getRight() == null)
            {
               if(parentNode == null)
               {
                  this.root = currentNode.getLeft();
               }
               parentNode.setLeft( currentNode.getLeft() );
            }
         }
      }

   }

   //         9
   //   4            20
   //1     6     15      170

   public List<Integer> breathFirstSearch()
   {
      MyBinaryTreeNode current = this.root;
      List<Integer> list = new ArrayList<>(  );
      Queue<MyBinaryTreeNode> queue = new LinkedList<>(  );
      queue.add( current );

      while( !queue.isEmpty() )
      {
         current = queue.remove();
         list.add( current.getValue() );
         if(current.getLeft() != null)
         {
            queue.add( current.getLeft() );
         }
         if(current.getRight() != null)
         {
            queue.add( current.getRight() );
         }
      }
      return list;
   }

   public List<Integer> breathFirstSearchRecursive()
   {
      Queue<MyBinaryTreeNode> queue = new LinkedList<>();
      queue.add(this.root);
      return breathFirstSearchRecursive(queue, new ArrayList<>(  ));
   }

   private  List<Integer> breathFirstSearchRecursive( Queue<MyBinaryTreeNode> queue, List<Integer> list )
   {
      if(queue.isEmpty())
      {
         return list;
      }
      MyBinaryTreeNode current = queue.remove();
      list.add( current.getValue() );
      if(current.getLeft() != null)
      {
         queue.add( current.getLeft() );
      }
      if(current.getRight() != null)
      {
         queue.add( current.getRight() );
      }

      return breathFirstSearchRecursive(queue, list );
   }
   //         9
   //   4            20
   //1     6     15      170
   public List<Integer> depthFirsSearchInOrder()
   {
      List<Integer> list = new ArrayList<>(  );
      return traverseInorder(this.root, list);
   }

   public List<Integer> depthFirsSearchPreOrder()
   {
      List<Integer> list = new ArrayList<>(  );
      return traversePreorder(this.root, list);
   }

   public List<Integer> depthFirsSearchPostOrder()
   {
      List<Integer> list = new ArrayList<>(  );
      return traversePostorder(this.root, list);
   }

   //         9
   //   4            20
   //1     6     15      170
   private List<Integer> traversePostorder( MyBinaryTreeNode node, List<Integer> list )
   {

      if(node.getLeft()!=null)
      {
         this.traversePostorder( node.getLeft(), list );
      }

      if(node.getRight()!=null)
      {
         this.traversePostorder( node.getRight(), list );
      }
      list.add( node.getValue() );

      return list;
   }

   private List<Integer> traversePreorder( MyBinaryTreeNode node, List<Integer> list )
   {
      list.add( node.getValue() );
      if(node.getLeft()!=null)
      {
         this.traversePreorder( node.getLeft(), list );
      }

      if(node.getRight()!=null)
      {
         this.traversePreorder( node.getRight(), list );
      }

      return list;
   }

   //         9
   //   4            20
   //1     6     15      170
   private List<Integer> traverseInorder( MyBinaryTreeNode node, List<Integer> list )
   {
      if(node.getLeft()!=null)
      {
         this.traverseInorder( node.getLeft(), list );
      }
      list.add( node.getValue() );
      if(node.getRight()!=null)
      {
         this.traverseInorder( node.getRight(), list );
      }

      return list;
   }

   int count = 0;
   public void printTree() {
      count = 0;
      printTree( this.root);
   }

   private void printTree(MyBinaryTreeNode node) {
      logger.debug( node.getValue() );
      count++;
      if(node.getLeft() != null) {
         logger.debug( "Left: ");
         printTree(node.getLeft());
      }
      if(node.getRight() != null) {
         logger.debug("Right: ");
         printTree(node.getRight());
      }
      count--;
   }

   public int maxDepth()
   {
      return maxDepth2(this.root);
   }

   private int maxDepth2( MyBinaryTreeNode root )
   {
      if (root!= null) {
         if (root.getLeft() != null || root.getRight() != null) {
            logger.debug( "left:{}, right:{}", root.getLeft(), root.getRight() );
            return 1 +
                   max(maxDepth2(root.getLeft()),
                       maxDepth2(root.getRight()));
         }
      }
      return 0;
   }

   //         9
   //   4            20
   //1     6     15      170
   private int maxDepth1( MyBinaryTreeNode root )
   {
      if (root == null)
      {
         return 0;
      }

      int lDepth = maxDepth1(root.getLeft());
      int rDepth = maxDepth1(root.getRight());

      /* use the larger one */
      if (lDepth > rDepth)
         return (lDepth + 1);
      else
         return (rDepth + 1);
   }
}
