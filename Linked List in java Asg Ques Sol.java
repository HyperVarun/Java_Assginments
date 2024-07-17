Question 1:Q1.Given a linked list and a key‘X‘in,the task is to check if X is present in the linked list or not.Examples:Input:14->21->11->30->10,X=14 Ouptut:Yes Explanation:14 is present in the linked list.Input:6->21->17->30->10->8,X=13 Ouptut:No

Solution:
public class FindLinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }

    }

    // Insert the given data in the Linked List
    public void push(int newdata) {
        Node newNode = new Node(newdata);
        if (head == null) {
            head = new Node(newdata);
            return;
        }
        newNode.next = null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void FindLL(int x) {
        Node current = head;
        if (current.data == x) {
            System.out.println("Yes");

        } else {
            System.out.println("No");

        }

    }

    public void DisplayLL() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String args[]) {
        FindLinkedList list = new FindLinkedList();
        list.push(14);
        list.push(21);
        list.push(11);
        list.push(30);
        list.push(10);

        list.DisplayLL();
        System.out.println();

        // list.FindLL(14);
        list.FindLL(7);

    }}

    Question 2:

    Insert a
    node at
    the given
    position in
    a linked
    list.We are
    given a
    pointer to
    a node, and the new
    node is
    inserted after
    the given node.Input:LL=1->2->4->5->6 pointer=2 value=3. Output:1->2->3->4->5->6 Solution:

    public class InsertAtAnyLL {
        Node head;

        class Node {
            int data;
            Node next;

            Node(int d) {
                data = d;
                next = null;
            }

        }

        // Insert the given data in the Linked List
        public void push(int newdata) {
            Node newNode = new Node(newdata);
            if (head == null) {
                head = new Node(newdata);
                return;
            }
            newNode.next = null;
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        public void InsertAtAnyPosition(int newdata, int pos) {
            Node newNode = new Node(newdata);
            if (head == null || pos == 0) {
                newNode.next = head;
                head = newNode;
                return;
            }
            Node current = head;
            int currentpos = 0;
            while (current != null && currentpos < pos - 1) {
                current = current.next;
                currentpos++;
            }

            if (current == null) {
                System.out.println("Invaild Position ");
                return;
            }
            newNode.next = current.next;
            current.next = newNode;
        }

        public void DisplayLL() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }

        public static void main(String args[]) {
            InsertAtAnyLL list = new InsertAtAnyLL();
            list.push(1);
            list.push(2);
            list.push(4);
            list.push(5);
            list.push(6);

            System.out.println("Linked List before insertion of new data :");
            list.DisplayLL();
            System.out.println();
            list.InsertAtAnyPosition(3, 2);
            System.out.println("Linked List after insertion at any position :");
            list.DisplayLL();
        }
}

Q3.Given the
head of
a sorted
linked list, delete
all duplicates
such that
each element
appears only
once.Return the
linked list
sorted as
well.

        Q4.Given the
head of
a singly
linked list,return true if
it is
a palindrome or false otherwise
.
