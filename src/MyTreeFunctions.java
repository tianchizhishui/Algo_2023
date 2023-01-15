import java.util.*;

public class MyTreeFunctions {
    /* this class is designed for common tree functions including: 1.getHeight */


    // get Height function

    public int getHeight(MyTreeNodes root) {
        if (root == null) {
            return 0;
        }

        int left = getHeight(root.left);
        int right = getHeight(root.right);

        return Math.max(left, right) + 1;
    }
}
