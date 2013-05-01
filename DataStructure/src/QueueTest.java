import static org.junit.Assert.*;

import org.junit.Test;


public class QueueTest {

	@Test
	public void test() {
		IntQueue q = new IntQueue();
		q.push(1);
		q.push(2);
		q.push(3);
		assertEquals(3, q.length());

		assertEquals(1 , q.pop());
		assertEquals(2 , q.pop());
		assertEquals(3 , q.pop());
		assertEquals(0, q.length());

	}
	
	@Test
	public void test1() {
		Queue<Integer> q = new Queue<Integer>();
		q.push(new Integer(1));
		q.push(new Integer(2));
		q.push(new Integer(3));
		assertEquals(3, q.length());

		assertEquals(1 , q.pop().intValue());
		assertEquals(2 , q.pop().intValue());
		assertEquals(3 , q.pop().intValue());
		assertEquals(0, q.length());

	}


}
