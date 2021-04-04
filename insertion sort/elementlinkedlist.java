public class elementlinkedlist {
    
    if (priorNode == null)
    {
        System.out.println("Prior node cannot be null");
        return;
    }

    Node newNode = new Node(new_element); //place the new element

    newNode.next = priorNode.next; //establish next of newNode as priorNode next

    priorNode.next = newNode;
}


public void place(int newElement) {
    Node newNode = new Node(newElement);

    newNode.next = head;

    head = newNode;
}


public void appendNode (int newElement)
{
    Node newNode = new Node(newElement);

    newNode.next = null;

    Node end = head;
    while (end.next != null)
        end = end.next;

    end.next = newNode;
    return;
}