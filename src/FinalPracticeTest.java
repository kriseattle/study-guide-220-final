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

    // Sum odd index with null head
    @Test
    void testOddIndexSum_nullHead() {
        ListNode list = null;
        int actual = FinalPractice.oddIndexSum(list);
        assertEquals(0, actual);    
    }

    // Sum odd index with single node
    @Test
    void testOddIndexSum_singleListNode() {
        ListNode singleList = new ListNode(100);
        int actual = FinalPractice.oddIndexSum(singleList);
        assertEquals(0, actual);
    }

    // Sum odd index with 2 nodes
    @Test
    void testOddIndexSum_twoNode() {
        ListNode twoNodeList = new ListNode(4, new ListNode(10));
        int actual = FinalPractice.oddIndexSum(twoNodeList);
        assertEquals(10, actual);

    }


    // TODO: Make thorough tests for ALL the questions on the study guide
}
