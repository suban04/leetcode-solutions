class MyLinkedList {

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

Node dummy;
Node tail;
int size;

public MyLinkedList() {
    dummy = new Node(-1);
    tail = dummy;
    size = 0;
}

public int get(int index) {
    if (index < 0 || index >= size) {
        return -1;
    }

    Node curr = dummy.next;

    for (int i = 0; i < index; i++) {
        curr = curr.next;
    }

    return curr.val;
}

public void addAtHead(int val) {
    addAtIndex(0, val);
}

public void addAtTail(int val) {
    Node newNode = new Node(val);
    tail.next = newNode;
    tail = newNode;
    size++;
}

public void addAtIndex(int index, int val) {
    if (index < 0 || index > size) {
        return;
    }

    // Move to the node before index
    Node prev = dummy;

    for (int i = 0; i < index; i++) {
        prev = prev.next;
    }

    Node newNode = new Node(val);

    newNode.next = prev.next;
    prev.next = newNode;

    // If inserted at the end, update tail
    if (index == size) {
        tail = newNode;
    }

    size++;
}

public void deleteAtIndex(int index) {
    if (index < 0 || index >= size) {
        return;
    }

    // Move to node before index
    Node prev = dummy;

    for (int i = 0; i < index; i++) {
        prev = prev.next;
    }

    // Update tail if deleting last node
    if (prev.next == tail) {
        tail = prev;
    }

    prev.next = prev.next.next;
    size--;
}


}
