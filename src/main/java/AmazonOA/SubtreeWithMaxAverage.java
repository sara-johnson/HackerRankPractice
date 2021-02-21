package AmazonOA;

import java.util.ArrayList;
import java.util.List;

public class SubtreeWithMaxAverage {

    private double maxAverage = Double.MIN_VALUE;
    private Node rootNodeWithMaxAvg = null;

    public int subtreeMaxAvg(Node root) {

        findRootNodeWithMaxAvg(root);

        return rootNodeWithMaxAvg.val;

    }

    //this method will recursively iterate through each node in the tree to find the
    //node with the max average value.
    private double[] findRootNodeWithMaxAvg(Node root) {
        //check to see if the root is null first
        if (root == null) {
            return new double [] {0,0};
        }

        int countOfNodes = 0;
        double currentTotal = root.val;

        //As long as the node has children nodes
        if(root.children != null) {
            for (Node childNode : root.children) {
                //recursively get the child nodes and calculate the count and total values
                double[] currentNode = findRootNodeWithMaxAvg(childNode);
                currentTotal += currentNode[0];
                countOfNodes += currentNode[1];
            }
        }

        double averageOfNodeChildren = currentTotal / countOfNodes;
        if (averageOfNodeChildren > maxAverage && countOfNodes > 1)
            maxAverage = averageOfNodeChildren;
            rootNodeWithMaxAvg = root;

            return new double[]{currentTotal, countOfNodes};
    }




    class Node {
        public int val;
        public List<Node> children;

        public Node(int val) {
            this(val, new ArrayList<>());
        }

        public Node(int val, List<Node> children) {
            this.val = val;
            this.children = children;
        }
    }

}
