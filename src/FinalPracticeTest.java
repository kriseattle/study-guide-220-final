import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class FinalPracticeTest {

    /*
     * Testing SUM of ODD and EVEN indexes
     */

     // ODD indexes
     // with long linked list
    @Test
    void testOddIndexSum_oddLengthList() {
        ListNode list = new ListNode(4, new ListNode(8, new ListNode(15, new ListNode(16, new ListNode(23, new ListNode(42, new ListNode(11, new ListNode(29, new ListNode(34)))))))));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(95, actual);
    }

    // with null head
    @Test
    void testOddIndexSum_nullList() {
        ListNode list = null;
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(0, actual);    
    }

    // with single node
    @Test
    void testOddIndexSum_singleNode() {
        ListNode singleList = new ListNode(100);
        int actual = FinalPractice.oddIndexSum(singleList);
        assertEquals(0, actual);
    }

    // with 2 nodes
    @Test
    void testOddIndexSum_twoNodes() {
        ListNode twoNodeList = new ListNode(4, new ListNode(10));
        int actual = FinalPractice.oddIndexSum(twoNodeList);
        assertEquals(10, actual);

    }


    // EVEN indexes
    // with long linked list
    @Test
    void testEvenIndexSum_longEvenList() {
        ListNode list = new ListNode(4, new ListNode(8, new ListNode(15, new ListNode(16, new ListNode(23, new ListNode(42, new ListNode(11, new ListNode(29, new ListNode(34)))))))));
        int actual = FinalPractice.evenIndexSum(list); //4 + 15 + 23 + 11 + 34 = 87
        assertEquals(87, actual);
    }

    // with null list
    @Test
    void testEvenIndexSum_nullList() {
        ListNode nullList = null;
        int actual = FinalPractice.evenIndexSum(nullList);
        assertEquals(0, actual);
    }

    // with single node
    @Test
    void testEvenIndexSum_singleListNode() {
        ListNode list = new ListNode(3);
        int actual = FinalPractice.evenIndexSum(list);
        assertEquals(3, actual);
    }

    // with two nodes
    @Test
    void testEvenIndexSum_twoNodes() {
        ListNode list = new ListNode(13, new ListNode(23));
        int actual = FinalPractice.evenIndexSum(list);
        assertEquals(13, actual);
    }

    // with negative nodes
    @Test
    void testEvenIndexSum_hasNegativeListNode() {
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(-4, new ListNode(5, new ListNode(7)))));
        int actual = FinalPractice.evenIndexSum(list); // 1 + (-4) + 7
        assertEquals(4, actual);
    }

 /******************************************************************/

    /*
     * Testing for MAX of N nodes
     */
    // MAX of null list
    @Test
    void testMaxOfNullList() {
        ListNode list = null;
        int actual = FinalPractice.maxOfLastNnodes(list, 3);
        assertEquals(Integer.MIN_VALUE, actual);
    }

    // MAX of last 3 in total of 5
    @Test
    void testMax3Nodes_of5() {
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(-4, new ListNode(5, new ListNode(7)))));
        int actual = FinalPractice.maxOfLastNnodes(list, 3);
        assertEquals(7, actual);
    }

    // MAX of last 3 in total of 2
    @Test
    void testMax3Nodes_of2() {
        ListNode list = new ListNode(0, new ListNode(5));
        int actual = FinalPractice.maxOfLastNnodes(list, 3);
        assertEquals(5, actual);
    }
    
    // MAX of last 4 in total of 5
    @Test
    void testMax4Nodes_of5() {
        ListNode list = new ListNode(-1, new ListNode(3, new ListNode(10, new ListNode(30, new ListNode(5)))));
        int actual = FinalPractice.maxOfLastNnodes(list, 4);
        assertEquals(30, actual);
    }

     /******************************************************************/

     /*
     * Testing for SUM of leaf nodes with even values
     */
    // Tree:
    //                  5
    //              /       \
    //             7         6
    //              \      /  \
    //              4     11  12
    @Test
    void testSumLeafNodes_evenValues1() {
        TreeNode root = new TreeNode(5, new TreeNode(7, null, new TreeNode(4)), new TreeNode(6, new TreeNode(11), new TreeNode(12)));
        int actual = FinalPractice.sumEvenLeafNodes(root);
        assertEquals(16, actual);
    }

    /*
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
    @Test
    void testSumLeafNodes_evenValues2() {
        TreeNode root = new TreeNode(12, new TreeNode(6, new TreeNode(4, new TreeNode(3), null), new TreeNode(8)), new TreeNode(18, new TreeNode(16), new TreeNode(20, new TreeNode(22), null)));
    
        int actual = FinalPractice.sumEvenLeafNodes(root);
        assertEquals(46, actual);
    }

    // with null root for even nodes 
    @Test
    void testSumLeafNodes_evenValues3() {
        TreeNode root = null;
        int actual = FinalPractice.sumEvenLeafNodes(root);
        assertEquals(0, actual);
    }

    // with null root for odd nodes
    @Test
    void testSumLeafNodes_oddValues1() {
        TreeNode root = null;
        int actual = FinalPractice.sumOddLeafNodes(root);
        assertEquals(0, actual);
    }

    /*
    Tree:
                  12
                /   \
              6      18
            / \     /  \
           4   8  16   20
          /              \
        3                22
     */
    @Test
    void testSumLeafNodes_oddValues2() {
        TreeNode root = new TreeNode(12, new TreeNode(6, new TreeNode(4, new TreeNode(3), null), new TreeNode(8)), new TreeNode(18, new TreeNode(16), new TreeNode(20, new TreeNode(22), null)));
    
        int actual = FinalPractice.sumOddLeafNodes(root); // only leaf node with value 3
        assertEquals(3, actual);
    }

    /*
    Tree:
                      5
                  /       \
                 7         6
                  \      /  \
                  4     11  12
    */
    @Test
    void testSumLeafNodes_oddValues3() {
        TreeNode root = new TreeNode(5, new TreeNode(7, null, new TreeNode(4)), new TreeNode(6, new TreeNode(11), new TreeNode(12)));
        int actual = FinalPractice.sumOddLeafNodes(root); // only leaf node with value 11
        assertEquals(11, actual);
    }



}
