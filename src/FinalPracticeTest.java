import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class FinalPracticeTest {
    @Test
    void testOddIndexSum_oddLengthList() {
        ListNode list = new ListNode(4, new ListNode(8, new ListNode(15, new ListNode(16, new ListNode(23, new ListNode(42, new ListNode(11, new ListNode(29, new ListNode(34)))))))));
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(95, actual);
    }

    // TODO: Make more tests for oddIndexSum

    // Sum odd indexes
    //with null head
    @Test
    void testOddIndexSum_nullList() {
        ListNode list = null;
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(0, actual);    
    }

    //with single node
    @Test
    void testOddIndexSum_singleNode() {
        ListNode singleList = new ListNode(100);
        int actual = FinalPractice.oddIndexSum(singleList);
        assertEquals(0, actual);
    }

    //with 2 nodes
    @Test
    void testOddIndexSum_twoNodes() {
        ListNode twoNodeList = new ListNode(4, new ListNode(10));
        int actual = FinalPractice.oddIndexSum(twoNodeList);
        assertEquals(10, actual);

    }

    // TODO: Make thorough tests for ALL the questions on the study guide

    // Sum even indexes
    //with a long  even list
    @Test
    void testEvenIndexSum_longEvenList() {
        ListNode list = new ListNode(4, new ListNode(8, new ListNode(15, new ListNode(16, new ListNode(23, new ListNode(42, new ListNode(11, new ListNode(29, new ListNode(34)))))))));
        int actual = FinalPractice.evenIndexSum(list); //4 + 15 + 23 + 11 + 34 = 87
        assertEquals(87, actual);
    }

    //with null list
    @Test
    void testEvenIndexSum_nullList() {
        ListNode nullList = null;
        int actual = FinalPractice.evenIndexSum(nullList);
        assertEquals(0, actual);
    }

    //with single node
    @Test
    void testEvenIndexSum_singleListNode() {
        ListNode list = new ListNode(3);
        int actual = FinalPractice.evenIndexSum(list);
        assertEquals(3, actual);
    }

    //with two nodes
    @Test
    void testEvenIndexSum_twoNodes() {
        ListNode list = new ListNode(13, new ListNode(23));
        int actual = FinalPractice.evenIndexSum(list);
        assertEquals(13, actual);
    }

    //with negative nodes
    @Test
    void testEvenIndexSum_hasNegativeListNode() {
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(-4, new ListNode(5, new ListNode(7)))));
        int actual = FinalPractice.evenIndexSum(list); // 1 + (-4) + 7
        assertEquals(4, actual);
    }

    
}

