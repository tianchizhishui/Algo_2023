public class Main {
    public static void main(String[] args) {
        MyTreeNodes n1 = new MyTreeNodes(5);
        MyTreeNodes n2 = new MyTreeNodes(3);
        MyTreeNodes n3 = new MyTreeNodes(8);
        MyTreeNodes n4 = new MyTreeNodes(2);
        MyTreeNodes n5 = new MyTreeNodes(4);
        MyTreeNodes n6 = new MyTreeNodes(6);
        MyTreeNodes n7 = new MyTreeNodes(9);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;



        MyTreeFunctions  test = new MyTreeFunctions();

        //System.out.println(test.getHeight(n1));
        System.out.println(test.findLCA(n1,2,3).value );

    }
}