public class Stack {
  
  /* class constants */
  public final int DEFAULT_MAXIMUM_ITEMS = 100;
  public final int DEFAULT_INDEX = -1;

  /* instance fields */
  private Object[] stack;
  private int index;

  /* constructors */
  public Stack() {
    stack = new Object[DEFAULT_MAXIMUM_ITEMS];
    index = DEFAULT_INDEX;
  }

  public Stack(int maximum) {
    if (maximum < 1) {
      maximum = DEFAULT_MAXIMUM_ITEMS;
    }

    stack = new Object[maximum];
    index = DEFAULT_INDEX;
  }

  /* accessors */
  public int getSize() {
    return index + 1;
  }

  public Object[] getStack() {
    return stack;
  }

  public Object peek() {
    if (this.isEmpty()) return null;
    return stack[index];
  }

  public Object pop() {
    if (this.isEmpty()) return null;
    return stack[index--];
  }

  /* mutators */
  public void push(Object data) {
    if (data == null) return;
    stack[++index] = data;
  }

  /* other methods */
  public boolean isEmpty() {
    return this.getSize() == 0;
  }

  public boolean isFull() {
    return this.getSize() == stack.length;
  }

}