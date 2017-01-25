public class Node {

  /* instance fields */
  private Node next;
  private int data;

  /* constructors */
  public Node() {
    next = null;
    data = 0;
  }

  public Node(Node next, int data) {
    this.next = next;
    this.data = data;
  }

  /* accessors */
  public Node getNext() {
    return next;
  }

  public int getData() {
    return data;
  }

  /* mutators */
  public void setNext(Node next) {
    this.next = next;
  }

  public void setData(int data) {
    this.data = data;
  }
  
}