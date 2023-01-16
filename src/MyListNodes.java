import java.util.*;

public class MyListNodes {
    // this is a single list node, the default Java ListNode class a double linkedlist node
    int value;
    MyListNodes next;

    public MyListNodes(int value) {
        this.value = value;
        this.next = null;
    }

    public int get() {
        return this.value;
    }

    public void setValue(int value1) {
        this.value = value1;
    }
}
