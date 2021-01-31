package com.vikas.bar;

import com.vikas.foo.Stack.arraydata.MyStack;
import com.vikas.foo.array.MyArray;
import com.vikas.foo.hashtable.MyHashTable;
import com.vikas.foo.linkedlist.dobule.MyDoubleLinkedList;
import com.vikas.foo.linkedlist.single.LinkedNode;
import com.vikas.foo.linkedlist.single.MyLinkedList;
import com.vikas.foo.tree.MyBinaryTree;
import com.vikas.graph.MyGraph;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;
import java.util.stream.Collectors;

public class BarBean {
    private static final Logger logger = LogManager.getLogger(BarBean.class);

    public static void main(String []args)
    {
        String [] array1 = {"a", "b", "c"};
        String [] array2 = {"d", "e"};

        String[][] tc1 = { { "Bobby", "87" },
                           { "Charles", "100" },
                           { "Eric", "64" },
                           { "Charles", "22" } };

        logger.debug( highestAvg(tc1) );

        logger.debug( "cellCompete: {}", cellCompete(new int [] {1,0,0,0,0,1,0,0,}, 1) );

        logger.debug( "Run Length Encoding: {}", runLengthEncode("aaabcc") );

        logger.debug( "top K frequent words:{}", topKFrequent1(new String [] {"the", "day", "is", "sunny", "the", "the", "is", "sunny","day", "cold", "cold"}, 4) );

        findJumbledNubers(100);

        logger.debug( "sum of multiples of 3 or 5:{}", multiplesThreeAndFive(1000) );

        logger.debug( "Excel columns:{}", getExcelColumnNumber("BB") );

        logger.debug( "Majority Element:{}", getMajorityElement( new int[] {2,2,1,1,1,2,2}) );

        logger.debug( "Majority Element:{}", getMajorityElement1( new int[] {2,2,1,1,1,2,2}) );

        logger.debug( "Roman to Integer:{}", getRomanToInteger( "MCMXCIV" ));

        logger.debug( "Best time to buy and sell stock:{}", getMaxProfit(new int[] {7,1,5,3,6,4}) );

       logger.debug( "Best time to buy and sell stock multiple times:{}", getMaxProfitMultiple(new int[] {1,1,1,1,2,6}) );

       logger.debug( "isAnagram:{}", isAnagram("aacc", "ccac"));

       logger.debug( "isAnagram1:{}", isAnagram1("aacc", "ccaa"));

       logger.debug( "firstUniqChar:{}", firstUniqChar("leetcode"));

       logger.debug( "firstUniqChar:{}", firstUniqChar1("leetcode"));

       logger.debug( "sortedArrayToBST:{}", sortedArrayToBST( new int[] {-10,-3,0,5,9}));

       logger.debug( "isSymmetricTree:{}", isSymmetric( generateSymmetricTree()));

       logger.debug( "missingNumber:{}", missingNumbers( new int[] {9,6,4,2,3,5,7,0,1}));

       logger.debug( "intersection of arrays:{}", intersect( new int[] {1,2,2,1}, new int[] {2,2}));

       logger.debug( "happy Number:{}", happyNumber( 19 ));

       logger.debug( "pascals triangle:{}", pascalTriangle( 5 ));

       logger.debug( "pascals triangle Recursive:{}", pascalTriangleRecursion( 5 ));

       logger.debug( "ways to climp steps:{}", climbStairs( 5 ));

       logger.debug( "plus one:{}", plusOne( new int[] {0}));

       logger.debug( "countAndSay:{}", countAndSay( 4 ));

       logger.debug( "countAndSay:{}", countAndSayStringBuilder( 4 ));

       logger.debug( "allDivisible:{}", allDivisible( 128 ));

       logger.debug( "trailingZeros:{}", trailingZeroes( 5 ));

       logger.debug( "Valid Parentheses:{}", isValidParentheses( "(]" ));

       logger.debug( "Valid Parentheses:{}", isValidParenthesesWithoutMap( "(]" ));

       logger.debug( "linked list has cycle:{}", hasCycle(prepareLinkedList()));

       //0(n) time and space
       logger.debug( "linked list palindrome:{}", isPalindromeLinkedList( prepareLinkedListForPalindrome()));

       //0(1) space and 0(n) time
       logger.debug( "linked list palindrome:{}", isPalindromeBreakAndReverseLinkedList(prepareLinkedListForPalindrome()));


       logger.debug( "longest common prefix:{}", longestCommonPrefix(new String [] {"flower","flow","ower"}));

       logger.debug( "Implement strStr:{}", strStr("abc", "c"));

       logger.debug( "reverse bits:{}", reverseBits(43261596));

       logger.debug( "is string palindrome:{}", isPalindrome("A man, a plan, a canal: Panama"));


       List<String> string = Arrays.asList( array1 );
        logger.debug( string.stream().collect( Collectors.joining()) );

        CollectionUtils.isEqualCollection( new ArrayList<>(  ), new ArrayList<>(  ) );

        boolean contains = Arrays.stream( array1 ).anyMatch( ar1 -> Arrays.asList( array2 ).contains( ar1 ) );
        logger.debug( contains );

        MyArray array = new MyArray();
        array.push( "First Vikas Array" );
        array.push( "Second One" );
        array.push( "Third One" );
        array.push("Fourth one");

        logger.debug( array.pop() );
        logger.debug( array.delete( 1 ) );
        logger.debug( array.get( 1 ) );
        logger.debug( array );

        MyHashTable table = new MyHashTable( 50 );
        table.set( "vikas", 1 );

        logger.debug( table.get( "vikas" ) );
        logger.debug( table.keys() );


        logger.debug( reverseString("Hi my name is Vikas") );
        logger.debug( reverseStringRecursive("Hi my name is Vikas") );

        int[] sorted = sortArray(new int[] {1,2,5}, new int[]{3,4,6});

       int[] sortedArray = sortArrayIntoOne(new int[] {1,2,5, 0, 0, 0}, 3, new int[]{3,4,6}, 3);

        int[] result = twoSum(new int[] {3, 2, 4}, 6);

        int max = contagious(new int [] {-2, -1});
        
        int [] moveZeros = move(new int [] {0, -2, 0, -1});

        int dup = dups(new int [] {2, -2, 2, 1, 1});

        int singleNumber = singleNumber(new int [] {2, -2, 2, 1, 1});

        MyLinkedList linkedList = new MyLinkedList( 1 );
        linkedList.append( 2 );
        linkedList.append( 4 );
        linkedList.prePend( 0 );
        linkedList.insert( 3, 3 );
        linkedList.remove( 4 );

       MyLinkedList linkedList1 = new MyLinkedList( 1 );
       linkedList1.append( 4 );
       linkedList1.append( 5 );
       linkedList1.prePend( 0 );

       //logger.debug( "intersection of sorted lists:{}", intersectList( linkedList.getHead(), linkedList1.getHead()));
       linkedList.printList();

       LinkedNode node = intersectListRecursive( linkedList.getHead(), linkedList1.getHead());
       logger.debug( "intersection of sorted lists Recursive:{}", node);



        MyDoubleLinkedList doubleLinkedList = new MyDoubleLinkedList( 1 );
        doubleLinkedList.append( 2 );
        doubleLinkedList.append( 4 );
        doubleLinkedList.prePend( 0 );
        doubleLinkedList.insert( 3, 3 );
        doubleLinkedList.remove( 4 );

        doubleLinkedList.printList();

        MyStack arrayStack = new MyStack();
        arrayStack.push( 1 );
        arrayStack.push( 2 );
        arrayStack.pop();
        arrayStack.peek();
        arrayStack.printStack();

        logger.debug( max );

        logger.debug( result );

        logger.debug( sorted );

        logger.debug( moveZeros );

        logger.debug( dup );

        //         9
        //   4            20
        //1     6     15      170
        MyBinaryTree binaryTree = new MyBinaryTree( );
        binaryTree.insert( 9 );
        binaryTree.insert( 4 );
        binaryTree.insert( 6 );
        binaryTree.insert( 20 );
        binaryTree.insert( 170 );
        binaryTree.insert( 15 );
        binaryTree.insert( 1 );
        binaryTree.printTree();
        binaryTree.lookup( 9 );
        logger.debug( "bfs: {}", binaryTree.breathFirstSearch() );
        logger.debug( "bfs recursive: {}", binaryTree.breathFirstSearchRecursive() );
        logger.debug( "dfs InOrder: {}", binaryTree.depthFirsSearchInOrder() );
        logger.debug( "dfs preOrder: {}", binaryTree.depthFirsSearchPreOrder() );
        logger.debug( "dfs PostOrder: {}", binaryTree.depthFirsSearchPostOrder() );
        logger.debug( "depth of the tree: {}", binaryTree.maxDepth());





        MyGraph graph = new MyGraph();
        graph.addNode(0);
        graph.addNode(1);
        graph.addNode(2);
        graph.addNode(3);
        graph.addNode(4);
        graph.addNode(5);
        graph.addNode(6);
        graph.addEdge(3, 1);
        graph.addEdge(3, 4);
        graph.addEdge(4, 2);
        graph.addEdge(4, 5);
        graph.addEdge(1, 2);
        graph.addEdge(1, 0);
        graph.addEdge(0, 2);
        graph.addEdge(6, 5);
        graph.showConnections();

        logger.debug( findFactorialRecursive( 5 ) );
        logger.debug( findFactorialIterative( 5 ) );
        logger.debug( findFibonacciIterative( 5 ) );
        logger.debug( "Fibonacci Even sum less that 4 million: {}", findFibonacciIterativeEvenSum( ) );
        logger.debug( findFibonacciRecursive( 5 ) );

        //sort
        List<String> strings = Arrays.asList( "a", "c", "b" );
        logger.debug( strings.stream().sorted().collect( Collectors.toList() ) );

        List<Integer> ints = Arrays.asList( 1, 53, 6);
        logger.debug( ints.stream().sorted().collect( Collectors.toList() ) );
        int [] nums = {1,2};
        logger.debug( robHouses(nums) );




    }

   private static boolean isPalindrome( String s )
   {
      if(s.isEmpty() || s.length() ==1)
      {
         return true;
      }
      s = s.toLowerCase( );
      int i = 0;
      int j = s.length()-1;
      while(i < j)
      {
         while(i<j && !((s.charAt(i)>='a' && s.charAt(i)<='z')
                        || (s.charAt(i)>='0'&&s.charAt(i)<='9'))){
            i++;
         }

         while(i<j && !((s.charAt(j)>='a' && s.charAt(j)<='z')
                        || (s.charAt(j)>='0'&&s.charAt(j)<='9'))){
            j--;
         }

         if(s.charAt(i) != s.charAt(j)){
            return false;
         }

         i++;
         j--;
      }

      return true;
   }

   private static int reverseBits( int n )
   {
      String bits = Integer.toBinaryString(n);
      String nBits = bits.replaceAll( " ", "0" );
      char [] chars = nBits.toCharArray();
      String s = "";
      for(int i = 0; i<chars.length; i++)
      {
         if(String.valueOf( nBits.charAt( i ) ).equals( "0" ))
         {

            s += 1;
         }
         else
         {
            s +=0;
         }

      }
      return Integer.parseInt(s,2);
   }

   private static int strStr( String haystack, String needle )
   {
      int result = -1;

      if(haystack == null && needle == null || haystack.isEmpty() && needle.isEmpty())
      {
         return 0;
      }
      int needleLength = needle.length();
      String haySub = haystack;
      int i = 0;
      while( haySub.length()>= needleLength )
      {
         if(needle.equals( haySub.substring( 0, needleLength ) ))
         {
            result = i;
            break;
         }

         i++;
         haySub = haySub.substring( 1 );
      }
      return result;
   }

   private static String longestCommonPrefix( String[] strs )
   {
      if(strs==null || strs.length ==0){
         return "";
      }

      if(strs.length == 1){
         return strs[0];
      }

      int i=0;
      while(true){
         boolean flag = true;
         for(int j=1; j<strs.length; j++){
            if(strs[j].length()<=i || strs[j-1].length() <=i
               || strs[j].charAt(i) != strs[j-1].charAt(i)){
               flag = false;
               break;
            }
         }

         if(flag){
            i++;
         }else{
            break;
         }
      }

      return strs[0].substring(0, i);
   }

   private static int[] sortArrayIntoOne( int[] nums1, int m, int[] nums2, int n )
   {
      while(m > 0 && n > 0){
         if(nums1[m-1] > nums2[n-1]){
            nums1[m+n-1] = nums1[m-1];
            m--;
         }else{
            nums1[m+n-1] = nums2[n-1];
            n--;
         }
      }

      while(n > 0){
         nums1[m+n-1] = nums2[n-1];
         n--;
      }
      return nums1;
   }

   private static boolean isPalindromeBreakAndReverseLinkedList( LinkedNode head )
   {
      if(head == null || head.getNext()==null)
         return true;

      //find list center
      LinkedNode fast = head;
      LinkedNode slow = head;

      while(fast.getNext()!=null && fast.getNext().getNext()!=null){
         fast = fast.getNext().getNext();
         slow = slow.getNext();
      }

      LinkedNode secondHead = slow.getNext();
      slow.setNext( null );

      //reverse second part of the list
      LinkedNode p1 = secondHead;
      LinkedNode p2 = p1.getNext();

      while(p1!=null && p2!=null){
         LinkedNode temp = p2.getNext();
         p2.setNext( p1 );
         p1 = p2;
         p2 = temp;
      }

      secondHead.setNext( null );

      //compare two sublists now
      LinkedNode p = (p2==null?p1:p2);
      LinkedNode q = head;
      while(p!=null){
         if(p.getValue() != q.getValue())
            return false;

         p = p.getNext();
         q = q.getNext();

      }

      return true;

   }

   private static boolean isPalindromeLinkedList( LinkedNode head )
   {
      if(head == null)
         return true;

      LinkedNode p = head;
      LinkedNode prev = new LinkedNode(head.getValue());

      while(p.getNext() != null){
         LinkedNode temp = new LinkedNode(p.getNext().getValue());
         temp.setNext(prev);
         prev = temp;
         p = p.getNext();
      }

      LinkedNode p1 = head;
      LinkedNode p2 = prev;

      while(p1!=null){
         if(p1.getValue() != p2.getValue())
            return false;

         p1 = p1.getNext();
         p2 = p2.getNext();
      }

      return true;
   }

   private static boolean hasCycle( LinkedNode head )
   {
      if(head == null) // list does not exist..so no loop either
         return false;

      LinkedNode slow, fast; // create two references.

      slow = fast = head; // make both refer to the start of the list

      while(true) {

         slow = slow.getNext();          // 1 hop

         if(fast.getNext() != null)
            fast = fast.getNext().getNext(); // 2 hops
         else
            return false;          // next node null => no loop

         if(slow == null || fast == null) // if either hits null..no loop
            return false;

         if(slow == fast) // if the two ever meet...we must have a loop
            return true;
      }

   }

   private static LinkedNode prepareLinkedList(  )
   {
      MyLinkedList linkedList = new MyLinkedList( 1 );
      linkedList.append( 2 );
      linkedList.append( 3 );

      LinkedNode node = linkedList.getHead().getNext().getNext();
      node.setNext( linkedList.getHead() );
      return linkedList.getHead();

   }

   private static LinkedNode prepareLinkedListForPalindrome(  )
   {
      MyLinkedList linkedList = new MyLinkedList( 1 );
      linkedList.append( 2 );
      linkedList.append( 3 );
      linkedList.append( 4 );
      linkedList.append( 5 );

      return linkedList.getHead();

   }

   private static boolean isValidParenthesesWithoutMap( String s )
   {
      Stack<Character> stack = new Stack<>();

      for(char c : s.toCharArray()){
         if(c == '[' || c == '{' || c == '('){
            stack.push(c);
         }else if(c == ']' && !stack.isEmpty() && stack.peek() == '['){
            stack.pop();
         }else if(c == '}' && !stack.isEmpty() && stack.peek() == '{'){
            stack.pop();
         }else if(c == ')' && !stack.isEmpty() && stack.peek() == '('){
            stack.pop();
         }else{
            return false;
         }
      }
      return stack.isEmpty();
   }

   private static boolean isValidParentheses( String s )
   {
      boolean output = false;
      char [] chars = s.toCharArray();
      Map<String, String > parenthesisStart = new HashMap<>(  );
      parenthesisStart.put( "{", "}" );
      parenthesisStart.put( "[", "]" );
      parenthesisStart.put( "(", ")" );

      Map<String, String > parenthesisEnd = new HashMap<>(  );
      parenthesisEnd.put( "}", "{" );
      parenthesisEnd.put( "]", "[" );
      parenthesisEnd.put( ")", "(" );

      Stack<String> stack = new Stack();
      for( char aChar : chars )
      {
         if( parenthesisStart.containsKey( String.valueOf( aChar ) ) )
         {
            stack.push( String.valueOf( aChar ) );
         }
         else if( parenthesisEnd.containsKey( String.valueOf( aChar ) ) )
         {
            if( !stack.isEmpty() && parenthesisEnd.get( String.valueOf( aChar ) ).equals( stack.peek() ) )
            {
               stack.pop();
            }
            else
            {
               return false;
            }

         }
      }



      if(stack.isEmpty())
      {
         output = true;
      }
      return output;
   }

   private static int trailingZeroes( int n )
   {
      int fact = findFactorialIterative( n );
      String fact1 = String.valueOf( fact );
      char [] chars = fact1.toCharArray();
      int count = 0;
      for(int i = chars.length-1; i>=0; i--)
      {
         if(String.valueOf( chars[i] ).equals( "0" ))
         {
            count++;
         }else
         {
            break;
         }
      }
      return count;

   }

   private static boolean allDivisible( int n )
   {
      int temp = n;
      int tempRemainder = n%10;
      while( temp > 0 )
      {

            if(tempRemainder== 0 || n %tempRemainder ==0)
            {
               temp = temp/10;
            }
            else {
               return false;
            }
         tempRemainder = temp%10;

      }
     return true;
   }

   private static String countAndSayStringBuilder( int n )
   {
      if (n <= 0)
         return null;

      String result = "1";
      int i = 1;

      while (i < n) {
         StringBuilder sb = new StringBuilder();
         int count = 1;
         for (int j = 1; j < result.length(); j++) {
            if (result.charAt(j) == result.charAt(j - 1)) {
               count++;
            } else {
               sb.append(count);
               sb.append(result.charAt(j - 1));
               count = 1;
            }
         }

         sb.append(count);
         sb.append(result.charAt(result.length() - 1));
         result = sb.toString();
         i++;
      }

      return result;
   }

   private static String countAndSay( int n )
   {
      if (n == 1)     return "1";
      if (n == 2)     return "11";

      // Find n'th term by generating
      // all terms from 3 to n-1.
      // Every term is generated
      // using previous term

      // Initialize previous term
      String str = "11";
      for (int i = 3; i <= n; i++)
      {
         // In below for loop, previous
         // character is processed in
         // current iteration. That is
         // why a dummy character is
         // added to make sure that loop
         // runs one extra iteration.
         str += '$';
         int len = str.length();

         int cnt = 1; // Initialize count
         // of matching chars
         String tmp = ""; // Initialize i'th
         // term in series
         char []arr = str.toCharArray();

         // Process previous term
         // to find the next term
         for (int j = 1; j < len; j++)
         {
            // If current character
            // does't match
            if (arr[j] != arr[j - 1])
            {
               // Append count of
               // str[j-1] to temp
               tmp += cnt + 0;

               // Append str[j-1]
               tmp += arr[j - 1];

               // Reset count
               cnt = 1;
            }

            // If matches, then increment
            // count of matching characters
            else cnt++;
         }

         // Update str
         str = tmp;
      }

      return str;
   }

   //4,3,2,1
   private static int[] plusOne( int[] digits )
   {
      for (int i = digits.length - 1; i >= 0; i--) {
         if (digits[i] != 9) {
            digits[i]++;
            break;
         } else {
            digits[i] = 0;
         }
      }
      if (digits[0] == 0) {
         int[] rst = new int[digits.length + 1];
         rst[0] = 1;
         return rst;
      }
      return digits;
   }

   private static boolean isSymmetric( TreeNode root )
   {
      return isMirror(root, root);
   }

   /*      1
         /   \
          2   2
         / \ / \
         3  4 4  3*/
   private static boolean isMirror( TreeNode node1, TreeNode node2 )
   {
      // if both trees are empty, then they are mirror image
      if (node1 == null && node2 == null)
         return true;

      // For two trees to be mirror images, the following three
      // conditions must be true
      // 1 - Their root node's key must be same
      // 2 - left subtree of left tree and right subtree
      //      of right tree have to be mirror images
      // 3 - right subtree of left tree and left subtree
      //      of right tree have to be mirror images
      if (node1 != null && node2 != null && node1.val == node2.val)
         return (isMirror(node1.left, node2.right)
                 && isMirror(node1.right, node2.left));

      // if neither of the above conditions is true then
      // root1 and root2 are mirror images
      return false;
   }

   private static TreeNode generateSymmetricTree()
   {
      TreeNode node = new TreeNode( 1, new TreeNode( 2 ), new TreeNode( 2 ) );
      TreeNode left = node.left;
      left.left = new TreeNode( 3 );
      left.right = new TreeNode( 4 );
      TreeNode right = node.right;
      right.left = new TreeNode( 4 );
      right.right = new TreeNode( 3 );
      return node;

   }

   private static int climbStairs( int n )
   {
      int curr,prev1=1,prev2=1;
      for(int i=1;i<n;i++){
         // There are 2 ways to reach this step; take 1 step from previous or 2 steps from 2 steps below
         curr=prev1+prev2;
         prev2=prev1;
         prev1=curr;
      }
      return prev1;
   }

   private static List<List<Integer>> pascalTriangleRecursion( int numRows )
   {
      List<List<Integer>> result = new ArrayList<>();
      if (numRows > 0) {
         generate(numRows, result);
      }
      return result;
   }

   private static List<Integer> generate( int numRows, List<List<Integer>> result )
   {
      if (numRows == 1) {
         List<Integer> list = Arrays.asList(1);
         result.add(list);
         return list;
      }
      List<Integer> tmp = generate(numRows - 1, result);
      List<Integer> nextList = next(tmp);
      result.add(nextList);
      return nextList;
   }

   private static List<Integer> next(List<Integer> previous) {
      List<Integer> result = new ArrayList<>(previous.size() + 1);
      result.add(1);
      for (int i = 1; i < previous.size(); i++) {
         int val = previous.get(i) + previous.get(i - 1);
         result.add(val);
      }
      result.add(1);
      return result;
   }

   private static List<List<Integer>> pascalTriangle( int numRows )
   {
      List<List<Integer>> finalList = new ArrayList<>(  );
      if(numRows <= 0)
      {
         return finalList;
      }
      List<Integer> pre = new ArrayList<>(  );
      pre.add( 1 );
      for (int i = 2; i<=numRows; i++)
      {
         List<Integer> cur = new ArrayList<>(  );
         cur.add( 1 );
         for( int j =0; j<pre.size()-1; j++)
         {
            cur.add( pre.get( j ) + pre.get( j+1 ));
         }
         cur.add( 1 );
         finalList.add( cur );
         pre = cur;
      }

      return finalList;

   }

   private static boolean happyNumber( int n )
   {
      //19 1^2 + 9^2
      Set<Integer> set = new HashSet<>(  );
      while(!set.contains( n ))
      {
         set.add( n );
         n = getSum(n);

         if (n==1)
            return true;
      }
      return false;
   }

   private static int getSum( int n )
   {
      String number = String.valueOf( n );
      int sum = 0;
      for (int i = 0; i< number.length(); i++)
      {

            sum += Integer.parseInt( Character.toString( number.charAt( i ) )  ) * Integer.parseInt( Character.toString( number.charAt( i ) )  );
      }
      return sum;
   }

   private static LinkedNode intersectListRecursive( LinkedNode l1, LinkedNode l2 )
   {
      if (l1 == null)
         return l2;
      if (l2 == null)
         return l1;

      // start with the linked list
      // whose head data is the least
      if (l1.getValue() < l2.getValue()) {
         LinkedNode next = intersectListRecursive(l1.getNext(), l2);
         l1.setNext(next);
         return l1;
      }
      else {
         LinkedNode next = intersectListRecursive(l1, l2.getNext());
         l2.setNext(next);
         return l2;
      }
   }

   private static LinkedNode intersectList( LinkedNode l1, LinkedNode l2 )
   {
      LinkedNode l = new LinkedNode( 0 );

      LinkedNode tail = l;

      while(true)
      {
         if(l1 == null)
         {
            tail.setNext( l2 );
            break;
         }
         if(l2 == null)
         {
            tail.setNext( l1 );
            break;
         }
         if(l1.getValue()<= l2.getValue())
         {
            tail.setNext( l1 );
            l1 = l1.getNext();
         }
         else
         {
            tail.setNext( l2 );
            l2 = l2.getNext();
         }
         tail = tail.getNext();
      }
      return l.getNext();
   }

   private static int[] intersect( int[] nums1, int[] nums2 )
   {
      List<Integer> resultList = new ArrayList<>(  );
      Map<Integer, Integer> set1 = new HashMap<>(  );
      for(int i: nums1){
         set1.put( i, set1.getOrDefault( i, 0 )+1 );
      }

      for(int i: nums2){
         if(set1.containsKey( i )){
            Integer rem = set1.get( i );
            if(rem==1)
            {
               set1.remove( i );
               resultList.add( i );
            }
            else
            {
               set1.put( i, rem-1 );
               resultList.add( i );
            }
         }
      }


      int i=0;
      int[] result = new int[resultList.size()];
      for(int n: resultList){
         result[i++] = n;
      }

      return result;
   }

   private static int missingNumbers( int[] nums )
   {
      int sum=0;
      for( int num : nums )
      {
         sum += num;
      }

      int n=nums.length;
      return n*(n+1)/2-sum;
   }

   private static TreeNode sortedArrayToBST( int[] num )
   {
      if (num.length == 0)
         return null;

      return sortedArrayToBST(num, 0, num.length - 1);

   }
   public static TreeNode sortedArrayToBST(int[] num, int start, int end) {
      if (start > end)
         return null;

      int mid = (start + end) / 2;
      TreeNode root = new TreeNode(num[mid]);
      logger.debug( "root: {}", root );
      root.left = sortedArrayToBST(num, start, mid - 1);
      logger.debug( "root left: {}", root.left );
      root.right = sortedArrayToBST(num, mid + 1, end);
      logger.debug( "root right: {}", root.right );


      return root;
   }

   private static int firstUniqChar1( String s )
   {
      if (s == null || s.length() == 0) {
         return -1;
      }

      int[] charCounts = new int[26];

      for (int i = 0; i < s.length(); i++) {
         charCounts[s.charAt(i) - 'a']++;
      }

      for (int i = 0; i < s.length(); i++) {
         if (charCounts[s.charAt(i) - 'a'] == 1) {
            return i;
         }
      }

      return -1;

   }

   private static int firstUniqChar( String s )
   {
      Map <Character, Integer> uniqMap = new HashMap<>(  );
      for (int i=0; i<s.length(); i++)
      {
         uniqMap.put( s.charAt( i ), uniqMap.getOrDefault( s.charAt( i ), 0 )+1 );
      }

      for (int i=0; i<s.length(); i++)
      {
         int count = uniqMap.get( s.charAt( i ) );
         if(count == 1)
         {
            return i;
         }
      }
      return -1;
   }

   private static boolean isAnagram1( String s, String t )
   {
      if(s==null || t==null)
         return false;

      if(s.length()!=t.length())
         return false;

      int[] arr = new int[26];
      for(int i=0; i<s.length(); i++){
         arr[s.charAt(i)-'a']++;
         arr[t.charAt(i)-'a']--;
      }

      for(int i: arr){
         if(i!=0)
            return false;
      }

      return true;
   }

   private static Boolean isAnagram( String s, String t )
   {
      if(s.length() != t.length())
      {
         return false;
      }
      char [] sCharArray = s.toCharArray();
      char [] tCharArray = t.toCharArray();
      Map<String, Integer> anagramMap = new HashMap<>(  );
      for (char initial : sCharArray )
      {
         anagramMap.put( String.valueOf( initial ), anagramMap.getOrDefault(String.valueOf( initial ), 0) +1 );

      }

      for (char anagram : tCharArray)
      {
         if(anagramMap.containsKey( String.valueOf( anagram ) ))
         {
            Integer value = anagramMap.get( String.valueOf( anagram ) );
            if(value == 1)
            {
               anagramMap.remove( String.valueOf( anagram ) );
            }
            else
            {
               anagramMap.put( String.valueOf( anagram ), value-1 );
            }
         }
         else
         {
            return false;
         }
      }
      return true;
   }

   private static int getMaxProfitMultiple( int[] prices )
   {
      int diff = 0;
      for(int i = 1; i<prices.length; i++){
         if(prices[i]>prices[i-1]){
            diff += prices[i]-prices[i-1];
         }
      }
      return diff;
   }

   private static int getMaxProfit( int[] prices )
   {
      if(prices == null || prices.length == 0) return 0;
      int min = prices[0];
      int max = Integer.MIN_VALUE;

      for( int price : prices )
      {
         int money = price - min;
         if( money > max )
         {
            max = money;
         }
         if( price < min )
         {
            min = price;
         }
      }

      return max;

   }

   private static int getRomanToInteger( String s )
    {
        Map<String, Integer> romanIntMap = new HashMap<>(  );
        int result = 0;
        char[] stringArray = s.toCharArray();
        romanIntMap.put( "I", 1 );
        romanIntMap.put( "V", 5 );
        romanIntMap.put( "X", 10 );
        romanIntMap.put( "L", 50 );
        romanIntMap.put( "C", 100 );
        romanIntMap.put( "D", 500 );
        romanIntMap.put( "M", 1000 );

        for(int i =0; i<stringArray.length; i++)
        {
            if( i <= stringArray.length-2 && romanIntMap.get( String.valueOf( stringArray[i+1] ) ) > romanIntMap.get( String.valueOf( stringArray[i] ))  )
            {
                result += (romanIntMap.get( String.valueOf( stringArray[i+1] ) ) - romanIntMap.get( String.valueOf( stringArray[i] )));
                i++;
            }
            else {
                result += romanIntMap.get( String.valueOf( stringArray[i] ));
            }

        }
        return result;





    }

    private static int getMajorityElement1( int[] nums )
    {
        int result = 0, count = 0;

        for(int i = 0; i<nums.length; i++ ) {
            if(count == 0){
                result = nums[ i ];
                count = 1;
            }else if(result == nums[i]){
                count++;
            }else{
                count--;
            }
        }

        return result;
    }

    private static int getMajorityElement( int[] ints )
    {
        int result = 0;
        Map<Integer, Integer> majorityMap = new HashMap<>(  );
        for(int i: ints)
        {
            majorityMap.put( i, majorityMap.getOrDefault(i, 0)+1 );
            if(majorityMap.get( i )>ints.length/2)
            {
                return i;
            }
        }
        return result;
    }

    private static int getExcelColumnNumber( String s )
    {

        int result = 0;
        for (char c : s.toCharArray()) {
            result = result * 26 + (c - 'A') + 1;
        }
        return result;
    }

    //aaabcc
    private static String runLengthEncode( String input )
    {
        char [] charArray = input.toCharArray();
        StringBuilder s = new StringBuilder(  );
        char previous =0;
        int counter = 0;
        for( char c : charArray)
        {

            if(c == previous)
            {
               counter++;
            }
            else if(counter > 0 && previous !=0)
            {
                s.append( counter ).append( c );
                counter = 0;
            }
            if(counter == 0 && previous != 0)
            {
                s.append( 1 ).append( c );
                counter = 0;
            }
            previous = c;


        }
        if(counter == 0)
        {
            s.append( 1 ).append( previous );
        }
        else {
            s.append( counter ).append( previous );
        }
        return s.toString();
    }

    private static int singleNumber( int[] nums )
    {
        int x = 0;
        for (int a : nums) {
            x = x ^ a;
        }
        return x;

    }

    private static List<Integer> cellCompete( int[] states, int n )
    {
       List<Integer> current = Arrays.stream(states).boxed().collect( Collectors.toList());
       for(int i=0; i<n; i++ )
       {
          List<Integer> listAfterEachIteration = new ArrayList<>(  );
          for (int k=0; k<current.size();k++ )
          {
             Integer leftState;
             Integer rightState;
             if(k==0)
             {
                leftState = 0;
                rightState = current.get( k+1 );
             }
             else if(k==current.size()-1)
             {
                leftState = current.get( k-1 );
                rightState = 0;
             }else {
                leftState = current.get( k-1 );
                rightState = current.get( k+1 );

             }

             if (leftState.equals( rightState )) {
                listAfterEachIteration.add(0);
             } else {
                listAfterEachIteration.add(1);
             }

          }
          current = listAfterEachIteration;

       }

       return current;
    }

    private static void findJumbledNubers(int num)
    {
        for(int i =10; i< num; i++)
        {
            //456
            String n = String.valueOf( i );


                if (n.length()<3)
                {
                    int length = n.length();
                    int diff = Math.abs( Integer.valueOf( n.charAt( length -2 ) ) - Integer.valueOf( n.charAt( length -1 ) ) );
                    if(diff <= 1)
                    {
                        logger.debug( i );
                    }
                }
                else
                {
                    int length = n.length();
                    int diff = Math.abs(Integer.valueOf( n.charAt( length -2 ) ) - Integer.valueOf( n.charAt( length -1 ) ));
                    int diff2 = Math.abs(Integer.valueOf( n.charAt( length -3 ) ) - Integer.valueOf( n.charAt( length -2 ) ));
                    if(diff <= 1 && diff2 <= 1)
                    {
                        logger.debug( i );
                    }
                }





        }

    }

    private static Integer findFibonacciIterativeEvenSum(  )
    {

        int result =1;
        int lastNum = 0;
        int evenSum = 0;
        int temp;
        while( result < 4000000 )
        {
            temp = result;
            result = temp+lastNum;
            if(result%2 ==0)
            {
                evenSum += result;
            }
            lastNum = temp;
        }
        return evenSum;
    }

    private static Integer multiplesThreeAndFive( int num )
    {
        int i = 1;
        int sum = 0;
        if(num <= 0)
        {
            return 0;
        }
        while( i < num )
        {
            if( i%3 == 0 || i%5 == 0)
            {
                sum += i;

            }
            i++;
        }
        return sum;
    }

    private static Integer highestAvg( String[][] scores )
    {
        Map <String, List<Integer>> map = new HashMap<>(  );
        for( String[] score : scores )
        {

                String name = score[0];
                map.computeIfAbsent( name, k -> new ArrayList<>() );
                map.get( name ).add(  Integer.valueOf( score[1] )   );

        }
        List<Integer> avg = new ArrayList<>(  );
        map.forEach( (key, value) -> {
            int sum = value.stream().mapToInt( Integer::intValue ).sum();
            avg.add( sum/value.size() );
        } );
        return Collections.max( avg );
    }

    private static int robHouses( int[] nums )
    {
        int result = 0;
        List<Integer> list1 = new ArrayList<>(  );
        List<Integer> list2 = new ArrayList<>(  );
        for(int i= 0; i<= nums.length-1; i++)
        {

            if(i%2 == 0)
            {
                list1.add( nums[i] );
            }else
            {
                list2.add( nums[i] );
            }
            Integer list1Sum = list1.stream().reduce( 0, Integer::sum );
            Integer list2Sum = list2.stream().reduce( 0, Integer::sum );
            result = list1Sum>list2Sum? list1Sum:list2Sum;

        }
        return result;
    }

    private static String reverseStringRecursive( String string )
    {

        if(string.length() == 0) {
            return "";
        }

        return reverseStringRecursive(string.substring( 1 ) )+ string.charAt( 0 );
    }

    private static int findFibonacciRecursive( int num )
    {
        if( num < 2)
        {
            return num;
        }
        return findFibonacciRecursive( num-1 ) + findFibonacciRecursive( num - 2 );
    }

    //0, 1, 1, 2, 3, 5
    private static Integer findFibonacciIterative( int num )
    {
        /*List<Integer> arr = new ArrayList<>( num );
        arr.add( 0 );
        arr.add( 1 );
        for( int i = 2; i < num+1; i++)
        {
            arr.add( arr.get(i-1) + arr.get( i-2 ) );
        }

        return arr.get( num );*/
        if(num == 0)
        {
            return 0;
        }
        int result =1;
        int lastNum = 0;
        int temp;
        for ( int i=1; i<num; i++)
        {
            temp = result;
            result = temp+lastNum;
            lastNum = temp;
        }
        return result;

    }

    private static Integer findFactorialIterative( int num )
    {
        int fact = 1;
        if(num == 2)
        {
            return 2;
        }
        for( int i=2; i<= num; i++)
        {
            fact = fact * i;
        }
        return fact;
    }

    private static Integer findFactorialRecursive( int i )
    {
        if(i == 2)
        {
            return 2;
        }
        return i * findFactorialRecursive( i-1 );

    }

    private static int dups( int[] nums )
    {
        Map<Integer, Integer> map = new HashMap<>(  );
        for(int i = 0; i< nums.length; i++)
        {

            if(map.containsKey( nums[i] ))
            {
                return nums[i];
            }

            map.put( nums[i], i );

        }
        return -1;
    }

    private static int [] move( int[] nums )
    {
        int count = 0;
        for(int i= 0; i< nums.length; i++)
        {
            if(0 != nums[i])
            {
                nums[count++] = nums[i];
            }

        }
        while( count < nums.length )
        {
            nums[count++] = 0;
        }
        return nums;
    }

    private static int contagious( int[] nums )
    {
        //[-2,1,-3,4,-1,2,1,-5,4]
        if (nums.length ==1)
        {
            return nums[0];
        }
        int sum = 0;
        int max = nums[0];

        for(int i=0; i<nums.length ; i++)
        {
            sum = Math.max( nums[i], sum+nums[i] );
            max = Math.max( sum, max );
        }
        return max;
    }

    private static int[] twoSum( int[] nums, int target )
    {
        int [] result = new int[2];
        Map<Integer, Integer> resultMap = new HashMap<>(  );
        //[2, 7, 11, 5]
        for(int i=0; i< nums.length; i++)
        {
            int compliment = target-nums[i];
            if (resultMap.containsKey( compliment ))
            {
                return new int[]{ resultMap.get( compliment ), i};
            }
            else
            {
                resultMap.put( nums[i], i );
            }

        }



        return result;
    }

    private static int[] sortArray( int[] nums1, int[] nums2 )
    {
        int intsLength = nums1.length;
        int ints1Length = nums2.length;

        int [] merged = new int[ints1Length+intsLength];

        int intsPosition, ints1Position, mergedPosition;
        intsPosition = ints1Position = mergedPosition = 0;

        while( intsPosition < intsLength && ints1Position < ints1Length)
        {
            if(nums1[intsPosition] < nums2[ints1Position])
                merged[mergedPosition++] = nums1[intsPosition++];
            else
                merged[mergedPosition++] = nums2[ints1Position++];
        }

        while(intsPosition < ints1Length)
        {
            merged[mergedPosition++] = nums1[intsPosition++];
        }

        while( ints1Position < ints1Length )
        {
            merged[mergedPosition++] = nums2[ints1Position++];
        }

        return merged;
    }

    private static String reverseString( String str )
    {
        String result = "";
        for(int i = str.length()-1; i >= 0 ; i--)
        {
            result += str.charAt( i );
        }
        return result;
    }

    public static List<String> topKFrequent1(String[] words, int k) {
        List<String> res = new LinkedList<>();
        Map<String, Integer> map = new HashMap<>();

        for (String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
              (a, b)-> a.getValue().equals(b.getValue()) ? b.getKey().compareTo(a.getKey()) : a.getValue().compareTo(b.getValue()));

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            pq.add(entry);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        while (!pq.isEmpty()) {
            res.add(0, pq.poll().getKey());   // add bigger one at 0
        }
        return res;
    }

   static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;

      TreeNode(int x) {
         val = x;
      }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }

      @Override
      public String toString()
      {
         return new ToStringBuilder( this ).append( "val", val )
                                           .append( "left", left )
                                           .append( "right", right )
                                           .toString();
      }
   }

}
