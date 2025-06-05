public class FinalPractice {
    public static void main(String[] args) {
        // Feel free to call your methods here to experiment

        // YOU MUST ALSO MAKE THOROUGH TESTS FOR EVERY METHOD 
    }

    /**
     * Return the sum of the values at odd indexes in a linked list.
     * 
     * Assumes head is at index 0.
     * 
     * If passed a null head, returns 0.
     * 
     * @param head the head of the linked list
     * @return the sum of the values at odd indexes
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

    // TODO: implement the rest of the study guide AND MAKE GOOD UNIT TESTS
}
