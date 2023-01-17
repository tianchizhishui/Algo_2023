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

    // judge if a tree is symmetric
    public boolean isSymmetric(MyTreeNodes root) {
        if (root == null) {
            return true;
        }
        return isSymmetricHelper(root.left, root.right);
    }

    private boolean isSymmetricHelper(MyTreeNodes left, MyTreeNodes right) {
        if (left == null && right == null) return true;

        if (left == null || right == null) return false;

        if (left.value != right.value) return false;

        return isSymmetricHelper(left.left,right.right) && isSymmetricHelper(left.right,right.left);
    }

    // judge if a tree is BST (binary search tree)
    public boolean isBST(MyTreeNodes root) {
        if (root == null) return true;
        return isBSTHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBSTHelper(MyTreeNodes root, int min, int max) {
        // base case
        if (root == null) return true;

        if (root.value <= min || root.value >= max) {
            return false;
        }

        return isBSTHelper(root.left, min, root.value) && isBSTHelper(root.right, root.value, max);

    }

    // LCA basic version: find the lowest common ancester of two given nodes

    public MyTreeNodes findLCA(MyTreeNodes root, int p, int q) {
        if (root == null || root.value == p || root.value == q) return root;

        MyTreeNodes left = findLCA(root.left, p, q);
        MyTreeNodes right = findLCA(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        return left == null ? right : left;
    }


}
