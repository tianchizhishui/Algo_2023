public class Main {
    public static void main(String[] args) {
        MyTreeNodes n1 = new MyTreeNodes(1);
        MyTreeNodes n2 = new MyTreeNodes(2);
        MyTreeNodes n3 = new MyTreeNodes(3);
        MyTreeNodes n4 = new MyTreeNodes(4);
        MyTreeNodes n5 = new MyTreeNodes(5);
        MyTreeNodes n6 = new MyTreeNodes(6);
        MyTreeNodes n7 = new MyTreeNodes(7);

        n1.right = n2;



        MyTreeFunctions  test = new MyTreeFunctions();

        System.out.println(test.getHeight(n1));

    }
}