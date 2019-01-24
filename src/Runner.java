public class Runner {
    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(3);
        bt.add(7);
        bt.add(8);
        bt.add(1);
        bt.add(2);
        bt.add(9);
        bt.add(5);


        System.out.print(bt.containsNode(6));
        System.out.print("\n");
        bt.delete(6);
        System.out.print(bt.containsNode(6));
        System.out.print("\n");
        bt.add(6);
        System.out.print(bt.containsNode(6));
        System.out.print("\n");
        bt.traverseInOrder(bt.root);
        System.out.print("\n");
        bt.traversePreOrder(bt.root);
        System.out.print("\n");
        bt.traversePostOrder(bt.root);
        System.out.print("\n");

    }


}
