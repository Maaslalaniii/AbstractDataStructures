public class LinkedList {

  /* instance fields */
  private Node head;

  /* constructors */
  public LinkedList() {
    head = null;
  }

  public LinkedList(Node head) {
    this.head = head;
  }

  /* accessors */
  public Node getHead() {
    return head;
  }

  public Node getTail() {
    Node current = head;

    while (current != null) {
      current = current.getNext();
    }

    return current;
  }

  /* mutators */
  public void setHead(Node head) {
    this.head = head;
  }

  /* other methods */
  public Node contains(int integer) {
    Node current = head;

    while (current != null) {
      if (current.getData() == integer) {
        return current;
      }
      current = current.getNext();
    }

    return null;
  }

  public void insert(Node entrant, Node insertionPoint) {
    if (entrant == null) return;

    if (insertionPoint == null) {
      head = entrant;
    }

    entrant.setNext(insertionPoint.getNext());
    insertionPoint.setNext(entrant);
  }

  public void insert(int integer, Node insertionPoint) {
    Node entrant = new Node(null, integer);
    insert(entrant, insertionPoint);
  }

  public void delete(Node target) {
    // target is head
    if (head.equals(target)) {
      head = head.getNext();
      return;
    }

    // find the target's previous node
    Node previous = null;
    Node current = head;

    while (current != null) {
      if (current.equals(target)) {
        previous.setNext(current.getNext());
      }

      previous = current;
      current = current.getNext();
    }
  }

  public boolean isEmpty() {
    return this.head == null;
  }

}