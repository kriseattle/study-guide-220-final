import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class FinalPractice {
    public static void main(String[] args) {
        // Feel free to call your methods here to experiment

        // YOU MUST ALSO MAKE THOROUGH TESTS FOR EVERY METHOD 
    }

    /**
     * Return the SUM of the values at ODD indexes in a linked list. 
     * Assumes head is at index 0.
     * If passed a null head, returns 0.
     * @param head the head of the linked list
     * @return the sum of the values at odd indexes
     * Example:
        Linked List:
        4 -> 8 -> 15 -> 16 -> 23 -> 42 -> 11 -> 29 -> 34
        Expected answer: 95
        Sum of elements at odd indexes:
        8 + 16 + 42 + 29 = 95
     */

    public static int oddIndexSum(ListNode head) {
        // TODO: implement this AND MAKE MORE UNIT TESTS FOR IT

        // Check if head is null
        if (head == null) return 0;

        // Initialize current, index, sum
        ListNode current = head;
        int index = 0;
        int sum = 0;
        
        // Run while loop to check if index is odd, therefor add index's value into sum
        while (current != null){
            if (index % 2 == 1){
                sum += current.data;
            }
            current = current.next;
            index++;
        }

        // Return final sum
        return sum; 
    }

    /******************************************************************/

    /**
     * POSSIBLE VARIATION: SUM of elements at EVEN indexes
     * Return the sum of the values at EVEN indexes in a linked list. 
     * Assumes head is at index 0.
     * If passed a null head, returns 0.
     * @param head the head of the linked list
     * @return the sum of the values at even indexes
     */

    public static int evenIndexSum(ListNode head) {

        // Initialize index, sum
        int index = 0;
        int sum = 0;

        // I made a short version of it
        // Using for-loop with current starting at head; the loop continues while current is not null
        // In each iteration, we move to the next node and increase index by 1
        // Checking if index is even number, if yes, then add the value of that index into sum
        for (ListNode current = head; current != null; current = current.next, index++) {
            if (index % 2 == 0) sum += current.data;
        }

        return sum;
    }

    /******************************************************************/

    /**
    * Given a reference to the head of a linked list, return the MAX of only the LAST n values of the list.
     * @param head the head of the linked list
     * @param n the desire numbers of nodes to be checked
     * @return the max number after the comparasion of n nodes
     * if HEAD is NULL or desire n nodes is <= 0, return Integer.MIN_VALUE
     * Example: MAX of last 3 values of the list
        Linked List:
        7 -> 3 -> 19 -> 21 -> 14 -> 33 -> 8 -> 26 -> 11 -> 5
        Expected Answer: 26
        Last 3 values are: 26  11  5, the largest of which is 26
    * POSSIBLE VARIATION: Largest of last 4 values
     */
    // This method will solve the problem for any desire n number instead of just set 3 or 4 at the beginning
    public static int maxOfLastNnodes(ListNode head, int n) {

        // Set conditions for null and n number
        if (head == null || n <= 0) return Integer.MIN_VALUE;

        // Create a new LinkedList to store the desire of n nodes
        LinkedList<Integer> nList = new LinkedList<>();
        ListNode current = head;

        // Newest node will be added to the end of the LinkedList
        while (current != null) {
            nList.addLast(current.data);

            // If there are more nodes than what we need, remove the oldest
            if (nList.size() > n) {
                nList.removeFirst();
            }
            current = current.next;
        }

        // Find the max
        int max = Integer.MIN_VALUE;
        for (int node : nList) {
            if (node > max) max = node;
        }
        
        return max;
    }

    /******************************************************************/

    /**
     * Given a reference to the root of a tree, return the sum of the leaf nodes with even values in the tree. Do not include any odd or branch nodes.
     * @param root the root of the tree node
     * @return the SUM of the LEAF nodes only with EVEN values
     * if HEAD is NULL, return 0
     * Example:
        Tree:
                  12
                /   \
              6      18
            / \     /  \
           4   8  16   20
          /              \
        3                22

        Expected Answer: 46
        The leaf nodes are 3   8   16   22, and the even ones are 8   16   22.
        The sum of the even leaf nodes is 8+16+22 = 46
     */
    public static int sumEvenLeafNodes(TreeNode root) {
        // set condition for null
        if (root == null) return 0;

        // check for only leaf nodes and even values
        if (root.left == null && root.right == null) {
            return (root.data % 2 == 0) ? root.data : 0;
        }

        // return sum of left and right of the tree node
        return sumEvenLeafNodes(root.left) + sumEvenLeafNodes(root.right);
    }

    /**
     * POSSIBLE VARIATION: Sum of leaf nodes with odd values
     
      * @param root the root of the tree nodes
      * @return the SUM of LEAF nodes only with ODD values
      * if HEAD is NULL, return 0
      */
    public static int sumOddLeafNodes(TreeNode root) {
        if (root == null) return 0;

        // check for only leaf nodes and odd values
        if (root.left == null && root.right == null) {
            return (root.data % 2 != 0) ? root.data : 0;
        }

        // return sum of left and right of the tree node
        return sumOddLeafNodes(root.left) + sumOddLeafNodes(root.right);
    }

    /******************************************************************/

    /**
     * Given a reference to the root of a tree, return the sum of the branch nodes with odd values in the tree. Do not include any even or leaf nodes.
     * Example:
        Tree:
                  15
                /    \
               9      4
              / \    /  \
            8   11 21   30
           / \       \
          2   6       23

        Expected Answer: 45
        The branch nodes are 15  9  4  8  21, and the odd ones are 15  9   21
        The sum of the odd branch nodes is 15+9+21=45
     
     * @param root the root of the tree nodes
     * @return the sum of BRANCH nodes only with ODD values
     */
    public static int sumOddBranchNodes(TreeNode root) {
        // set condition for null
        if (root == null) return 0;

        // initialize sum value
        int sum = 0;

        // if statement to check for branch only
        if (root.left != null || root.right != null) {

            // if statement to check if branch values are odd
            if (root.data % 2 != 0) {
                sum += root.data;
            }
        }

        sum += sumOddBranchNodes(root.left);
        sum += sumOddBranchNodes(root.right);

        return sum;
    }


    /** POSSIBLE VARIATION: Sum of branch nodes with EVEN values
     * @param root the root of the tree nodes
     * @return the sum of BRANCH nodes only with EVEN values
     */
    public static int sumEvenBranchNodes(TreeNode root) {
        if (root == null) return 0;
        int sum = 0;

        if (root.left != null || root.right != null) {
            if (root.data % 2 == 0) {
                sum += root.data;
            }
        }

        sum += sumEvenBranchNodes(root.left);
        sum += sumEvenBranchNodes(root.right);

        return sum;
    }

/******************************************************************/

    /**
     * Given a reference to a head node in a linked list of integers, return a Map<Integer, Integer> containing each value along with the number of times it shows up.
     * Example:
        Linked List:
        4 -> 34 -> 4 -> 16 -> 4 -> 16 -> 29 -> 8 -> 8

        Expected Return Map (order is unimportant): 
        { 
        4: 3,
        8: 2,
        16: 2,
        29: 1,
        34: 1
        } 

        Explanation
        4 shows up three times
        8 shows up two times
        16 shows up two times
        29 shows up one time
        34 shows up one time

      * @param head the head of the linked list
      * @return a map with key as list node and the value as how many times the key as appear
      */
    public static Map<Integer, Integer> countDuplicateNodes(ListNode head) {
        // Create a map
        Map<Integer, Integer> map = new HashMap<>();

        // Set condition for null head
        if (head == null) return map;

        ListNode current = head;

        // Use while loop
        while (current != null) {
            int value = current.data;

            // If map contains the value
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1); // add value and add 1
            } else {
                map.put(value, 1); // if appear once, add value and add 1
            }
            current = current.next;

        }
        return map;
    }
}
