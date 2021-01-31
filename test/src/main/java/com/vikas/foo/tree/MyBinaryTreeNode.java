package com.vikas.foo.tree;

public class MyBinaryTreeNode
{
   private int value;
   private MyBinaryTreeNode left;
   private MyBinaryTreeNode right;

   public MyBinaryTreeNode( int value )
   {
      this.value = value;
      this.left = left;
      this.right = right;
   }

   public MyBinaryTreeNode( int value, MyBinaryTreeNode left, MyBinaryTreeNode right )
   {
      this.value = value;
      this.left = left;
      this.right = right;
   }

   public int getValue()
   {
      return value;
   }

   public void setValue( int value )
   {
      this.value = value;
   }

   public MyBinaryTreeNode getLeft()
   {
      return left;
   }

   public void setLeft( MyBinaryTreeNode left )
   {
      this.left = left;
   }

   public MyBinaryTreeNode getRight()
   {
      return right;
   }

   public void setRight( MyBinaryTreeNode right )
   {
      this.right = right;
   }
}
