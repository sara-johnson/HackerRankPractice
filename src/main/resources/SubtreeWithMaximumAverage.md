Subtree with Maximum Average - New Grad
https://algo.monster/problems/subtree_with_maximum_average

Given a M-ary tree, find the subtree with the maximum average. Return the root of the subtree.

A subtree of a tree is any node of that tree plus all its descendants. The average value of a subtree is the sum of its values, divided by the number of nodes.

NOTE: The answer may be 0, i.e. removing the entire string.

Examples
Example 1:
Input:


Output: 13
Example 2:
Input:


Output: 21
Explanation: For the node with value = 1 we have an average of (- 5 + 21 + 5 - 1) / 5 = 4.

For the node with value = -5 we have an average of (-5 / 1) = -5.

For the node with value = 21 we have an average of (21 / 1) = 21.

For the node with value = 5 we have an average of (5 / 1) = 5.

For the node with value = -1 we have an average of (-1 / 1) = -1.

So the subtree of 21 is the maximum.

(tips: do you know in Java, the value of Double.MIN_VALUE is actually positive? )



