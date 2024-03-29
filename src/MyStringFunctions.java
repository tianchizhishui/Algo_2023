import java.util.*;

public class MyStringFunctions {
    /* this class is designed for common String functions including: 1.reverse string */

    public String reverse(String str) {
        //corner case, null or empty string
        if (str == null || str.length() == 0) {
            return str;
        }

        str = str.trim();
        char[] array = str.toCharArray();
        int start = 0;
        int end = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0 && array[i] != ' ') {
                start = i;
                continue;
            }

            if (array[i] != ' ' && array[i - 1] == ' ') {
                start = i;
            }

            if (array[i] == ' ' && array[i - 1] != ' ') {
                end = i;
                reverseCharArray2(array, start, end - 1);
            }

            if (i == array.length - 1 && array[i] != ' ') {
                end = i + 1;
                reverseCharArray2(array, start, i);
            }
        }

        reverseCharArray2(array, 0, array.length - 1);
        return String.valueOf(array);
    }

    private String reverseCharArray(char[] array, int left, int right) {
        while (left <= right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(array);
    }

    private void reverseCharArray2(char[] array, int left, int right) {
        while (left <= right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    // remove extra space in the sentence
    public String removeExtraSpace(String s) {
        if (s == null || s.length() == 0) return s;

        int end = 0;
        char[] array = s.toCharArray();

        for (int i = 0; i < array.length; i++) {
            // three cases: 1. array[i] != ' ', copy to end, and end++;
            // 2. array[i] == ' ', check array[end - 1] ? do not copy if ' '.
            if (array[i] != ' ' || (end != 0 && array[end - 1] != ' ')) {
                array[end++] = array[i];
                continue;
            }
            if (end == 0 || array[end - 1] == ' ') continue;

        }
        //conner case, no tailing space.
        if (end == 0 || array[end - 1] != ' ') end++;

        return String.valueOf(array, 0, end - 1);
    }

    // min steps to remove a parentheses
    public String minRemoveToMakeValid(String s) {
        // corner case 1 if the string is null
        if (s == null || s.length() == 0) return "";

        // main logic
        int left = 0, right = 0;
        // slow is the one to keep the valid string.
        int slow = 0, i = 0;
        //String doesn't have remove
        char[] array = s.toCharArray();

        while (i < array.length) {
            if (array[i] == '(') {
                left++;
            }

            if (array[i] == ')') {
                if (left == 0) {
                    i++;
                    continue;
                }
                left--;
            }
            array[slow++] = array[i++];
        }

        if (left == 0 && right == 0) return String.valueOf(array, 0, slow);

        i = slow - 1;
        int start = i;

        while (i >= 0) {
            if (array[i] == '(' && left != 0) {
                left--;
                i--;
                continue;
            }
            array[start--] = array[i--];
        }

        return String.valueOf(array, start + 1, slow - start - 1);
    }


































}
