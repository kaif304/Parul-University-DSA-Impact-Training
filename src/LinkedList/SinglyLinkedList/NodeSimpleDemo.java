package LinkedList.SinglyLinkedList;

public class NodeSimpleDemo {
    public static void main(String[] args) {
        SingleNode node = new SingleNode(10);

        System.out.println("Node value: "+node.data); // node data - 10
        System.out.println(node.nextNode); // node next  - null
    }
}

class SingleNode{
    int data;
    SingleNode nextNode;
    public SingleNode(int data){
        this.data = data;
        this.nextNode = null;
    }
}
