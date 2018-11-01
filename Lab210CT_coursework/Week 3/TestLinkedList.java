/**
 * Title:           TestLinkedList.java
 * Description:     A simple test drive program for the LinkedList class
 * Company:         ICT HKIVE(TY)
 * @author
 */
//it is given file
public class TestLinkedList {
	public static void main (String args[]) {
		LinkedListQ4 s = new LinkedListQ4(); //Week 3 Q4
		//LinkedListQ5 s = new LinkedListQ5(); //Week 3 Q5
		System.out.println(s);
		System.out.println();

		s.addToTail (new Integer(42));
		System.out.println(s);
		System.out.println();
		s.addToTail (new Character('n'));
		System.out.println(s);
		System.out.println();
		s.addToTail (new String("hello"));
		System.out.println(s);
		System.out.println();
		while (!s.isEmpty()) {
			System.out.println("removed:" + s.removeFromHead());
			System.out.println(s);
			System.out.println();
		}

		s.addToHead (new Integer(42));
		System.out.println(s);
		System.out.println();
		s.addToHead (new Character('n'));
		System.out.println(s);
		System.out.println();
		s.addToHead (new String("hello"));
		System.out.println(s);
		System.out.println();
		while (!s.isEmpty()) {
			System.out.println("removed:" + s.removeFromTail());
			System.out.println(s);
			System.out.println();
		}
	}
} // class TestLinkedList