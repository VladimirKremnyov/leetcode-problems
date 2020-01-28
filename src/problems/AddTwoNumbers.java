package problems;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        int remainder = 0;
        while (l1.next != null || l2.next != null) {
            if (l1.next == null) {
                result.next = new ListNode(l2.val);
                l2 = l2.next;
            } else if (l2.next == null) {
                result.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                int twoNodesSumm = l1.val + l2.val;
                if (remainder > 0) {
                    twoNodesSumm++;
                }
                remainder = twoNodesSumm % 10;
                ListNode currentResult;
                if (twoNodesSumm > 9) {
                    currentResult = new ListNode(remainder);
                } else {
                    currentResult = new ListNode(twoNodesSumm);
                }
                result.next = currentResult;
                result = currentResult;
                l1 = l1.next;
                l2 = l2.next;
            }
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        AddTwoNumbers solution = new AddTwoNumbers();
        ListNode result = solution.addTwoNumbers(l1, l2);

        System.out.println(result);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}
