import java.util.*;

public class MyListFunctions {
    /* this class is designed for common List functions including: 1.reverse list, iterative way and recursive way */

    public MyListNodes reverseI(MyListNodes head) {
        if (head == null || head.next == null) return head;

        MyListNodes next = null;
        MyListNodes pre = null;

        while (head!= null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public MyListNodes reverseR(MyListNodes head) {
        if (head == null || head.next == null) return head;

        MyListNodes nHead = reverseR(head.next);
        head.next.next = head;
        head.next = null;

        return nHead;
    }
}
