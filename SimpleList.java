public class SimpleList {
  private int [] list;
  private int count;

  public SimpleList() {
    this.list = new int [10];
    this.count = 0;
  }

  public void add (int num) {
    int [] newList = (this.count == this.list.length)
      ? new int [this.list.length * 3 / 2]
      : this.list;
    for (int i = this.count - 1; i > 0; i--)
      newList[i] = this.list[i - 1];
    newList[0] = num;
    this.list = newList;
    this.count++;
  }

  public void append (int num) {
    int [] newList = this.list;
    if (this.count == this.list.length) {
      newList = new int [this.list.length * 3 / 2];
      for (int i = 0; i < this.count; i++)
        newList[i] = this.list[i];
    }
    newList[this.count++] = num;
    this.list = newList;
  }

  public void remove (int num) {
    int minElements = Math.max(this.list.length * 3/4, 1);

    for (int i = 0; i < this.count; i++)
      if (this.list[i] == num) {
        int [] newList = this.list;
        if (this.count <= minElements) {
          newList = new int [minElements];
          for (int j = 0; j < i; j++)
            newList[j] = this.list[i];
        }
        for (i = i + 1; i < this.count; i++)
          newList[i - 1] = this.list[i];
        newList[--this.count] = 0;
        this.list = newList;
      }
  }

  public int count() { return this.count; }
  public int size() { return this.list.length; }
  public int first() { return this.count == 0 ? -1 : this.list[0]; }
  public int last() { return this.count == 0 ? -1 : this.list[this.count - 1]; }

  public String toString() {
    if (this.count == 0)
      return "";
    String s = "" + this.list[0];
    for (int i = 1; i < this.count; i++)
      s += " " + this.count;
    return s;
  }

  public int search(int num) {
    for (int i = 0; i < this.count; i++)
      if (this.list[i] == num)
        return i;
        return -1;
  }
}
