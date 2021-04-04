public class linkedlistexample {
    Node head;

    class Node {
        int dataElement; 
        Node next;

        Node(int d) 
        { 
            data = d; 
            next = null;
    }
}

public static linkedList {
    Node newNode = new Node(data);
    newNode.next = null;

    if(list.head == null) {
        list.head = newNode;
    } 
    else {
        Node last = list.head;
        while (last.next != null) {
            last = last.next;
 }

    last.next = newNode;

    return list;
}

public static void printList {
    Node currentNode = list.head;

    System.out.print("LinkedList: ");

    while (currentNode != null) {
        System.out.print(currNode.data + " ");

    currentNode = currentNode.next;
    }
}

