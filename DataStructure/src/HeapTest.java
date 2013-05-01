import static org.junit.Assert.*;

import org.junit.Test;


public class HeapTest {

	@Test
	public void test() {
		Heap q = new Heap();
		q.add(7);
		q.add(3);
		q.add(3);
		q.add(3);
		q.add(5);
		q.add(4);
		q.add(6);
		q.add(2);
		q.add(1);

		assertEquals("1,2,3,3,5,4,6,7,3," , q.showContent() ); 
	}
	
	@Test
	public void test1() {
		Heap q = new Heap();
		q.add(7);
		q.add(8);
		q.add(5);
		q.add(4);
		q.add(6);
		q.add(2);
		q.add(1);

		assertEquals( 1, q.getMin() ); 
		assertEquals("2,5,4,8,6,7," , q.showContent() ); 
		assertEquals( 2, q.getMin() ); 
		assertEquals("4,5,7,8,6," , q.showContent() ); 
		assertEquals( 4, q.getMin() ); 
		assertEquals("5,6,7,8," , q.showContent() ); 

	}

}
