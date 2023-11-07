import java.math.BigInteger;

public class Result {

  public static void main(String[] args) {
    var linked = new SinglyLinkedListNode(0);
    linked.next = new SinglyLinkedListNode(0);
    linked.next.next = new SinglyLinkedListNode(1);
    linked.next.next.next = new SinglyLinkedListNode(1);
    linked.next.next.next.next = new SinglyLinkedListNode(0);
    linked.next.next.next.next.next = new SinglyLinkedListNode(1);
    linked.next.next.next.next.next.next = new SinglyLinkedListNode(0);

    var number = getNumber(linked);

    System.out.println(number);
    System.out.println(Long.parseLong("01111111111111111111111111111111111111111111111111111111111111111", 2));
  }
  public static long getNumber(SinglyLinkedListNode binary) {
    StringBuilder binaryToDecimal = new StringBuilder();

    SinglyLinkedListNode next = binary;
    do {
      binaryToDecimal.append(next.data);
      next = next.next;
    } while(next != null);

    return Long.parseLong(binaryToDecimal.toString(), 2);
  }

}
