import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Tree testing
//        MyTreeNodes n1 = new MyTreeNodes(5);
//        MyTreeNodes n2 = new MyTreeNodes(3);
//        MyTreeNodes n3 = new MyTreeNodes(8);
//        MyTreeNodes n4 = new MyTreeNodes(2);
//        MyTreeNodes n5 = new MyTreeNodes(4);
//        MyTreeNodes n6 = new MyTreeNodes(6);
//        MyTreeNodes n7 = new MyTreeNodes(9);
//
//        n1.left = n2;
//        n1.right = n3;
//        n2.left = n4;
//        n2.right = n5;
//        n3.left = n6;
//        n3.right = n7;
//
//
//
//        MyTreeFunctions  test = new MyTreeFunctions();
//
//        //System.out.println(test.getHeight(n1));
//        System.out.println(test.findLCA(n1,2,3).value );

//        MyListNodes lnode1 = new MyListNodes(1);
//        MyListNodes lnode2 = new MyListNodes(2);
//        MyListNodes lnode3 = new MyListNodes(5);
//        MyListNodes lnode4 = new MyListNodes(4);
//        MyListNodes lnode5 = new MyListNodes(7);
//
//        lnode1.next = lnode2;
//        lnode2.next = lnode3;
//        lnode3.next = lnode4;
//        lnode4.next = lnode5;
//
//        MyListNodes oHead = lnode1;
//        while (oHead != null) {
//            System.out.print(oHead.value + "-->");
//            oHead = oHead.next;
//        }
//
//        MyListFunctions test2 = new MyListFunctions();
//        MyListNodes nHead = test2.reverseR(lnode1);;
//
//        System.out.println("");
//
//        while (nHead != null) {
//            System.out.print(nHead.value + "-->");
//            nHead = nHead.next;
//        }

        String str1 = "(a(b(c)d)";
        System.out.println(str1);
        //System.out.printf(str1.substring(0,2));
        MyStringFunctions test = new MyStringFunctions();
        String str2 = test.minRemoveToMakeValid(str1);
        System.out.println(str2);

    }
}