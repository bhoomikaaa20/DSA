class LinkedList {

    public static void LLPrint(Node head) {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
            if (temp != null) {
                System.out.print("->");
            }
        }

        System.out.println("");

    }

    public static void LLlength(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Length is:" + count);

    }

    public static void LLUpdate(Node head, int index, String val) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (i == index) {
                temp.data = val;
                break;
            }
            i++;
            temp = temp.next;
        }

    }

    public static void LLSearch(Node head, String val) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data.equals(val)) {
                System.out.println("Index is:" + i);
                break;
            }
            i++;
            temp = temp.next;
        }

    }

    public static void AddingAtEnd(Node head, String val) {

        Node temp = head;
        Node newval = new Node(val);

        while (temp.next != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        temp.next = newval;

    }

    public static Node AddingAtBegin(Node head, String val) {
        Node newNode = new Node(val);

        newNode.next = head;
        head = newNode;

        return head;

    }

    public static Node AddingAtMid(Node head, String val, int index) {
        Node newNode = new Node(val);
        int i = 0;
        Node temp = head;
        if (index == 0) {
            return AddingAtBegin(head, val);
        }
        while (temp != null) {
            if (i + 1 == index) {
                Node temp2 = temp.next;
                temp.next = newNode;
                newNode.next = temp2;

            }
            temp = temp.next;
            i++;
        }
        return head;
    }

    public static Node DeleteHeadNode(Node head) {
        head = head.next;
        return head;
    }

    public static void DeleteEndNode(Node head) {

        if (head == null)
            return;

        if (head.next == null) { // single node
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    public static void DeletingAtIndex(Node head, int index) {
        Node temp = head;
        int i = 0;
        if (temp == null) {
            DeleteHeadNode(head);
        }

        while (temp != null) {
            if (i + 1 == index) {
                temp.next = temp.next.next;
            }
            temp = temp.next;
            i++;
        }

    }

    public static void main(String[] args) {
        Node n1 = new Node("A");
        Node n2 = new Node("B");
        Node n3 = new Node("C");
        n1.next = n2;
        n2.next = n3;
        System.out.println(n1.data);
        System.out.println(n1.next.data);
        System.out.println(n1.next.next.data);

        Node head = n1;

        LLPrint(head);

        LLlength(head);

        System.out.println("Searching Linked List");
        LLSearch(head, "B");

        System.out.println("Updating Linked List");
        LLUpdate(head, 2, "X");
        LLPrint(head);

        System.out.println("Adding at Ending");
        AddingAtEnd(head, "D");
        LLPrint(head);

        System.out.println("Adding at Beginning");
        head = AddingAtBegin(head, "D");
        LLPrint(head);

        System.out.println("Adding at middle");
        head = AddingAtMid(head, "Y", 0);
        LLPrint(head);

        System.out.println("Deleting node at Start");
        head = DeleteHeadNode(head);
        LLPrint(head);

        System.out.println("Deleting End node");
        DeleteEndNode(head);
        LLPrint(head);

        System.out.println("Deleting At Index");
        DeletingAtIndex(head, 1);
        LLPrint(head);

    }
}

class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        this.next = null;
    }
}