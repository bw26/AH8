class ECSource {
  public static <T> T getNodeValue(Node<T> head, int index) {
    // todo - note the return type, but don't overthink it

    //Method 1:
    // int curr = 0;
    // while (head != null) {
    //   if (curr == index)
    //     return head.val;
    //   curr++;
    //   head = head.next;
    // }
    // return null;

    //Method 2
    for(int i = 0; i < index; i++){
      if (head == null) return null;
      head = head.next;
    }
    return head.val;
  }

  public static void main(String[] args) {
    Node<String> node1 = new Node<>("banana");
    Node<String> node2 = new Node<>("mango");
    Node<String> node3 = new Node<>("kiwi");

    node1.next = node2;
    node2.next = node3;

    // banana -> mango -> kiwi

    System.out.println(ECSource.getNodeValue(node1, 4)); //mango
    System.out.println(ECSource.getNodeValue(node1, 0)); // "banana"

    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");

    a.next = b;
    b.next = c;
    c.next = d;

    // a -> b -> c -> d

    ECSource.getNodeValue(a, 7); // null
  }
}