import static org.junit.Assert.*;

import org.junit.Test;


public class IntStackTest {

	@Test
	public void test() {
		IntStack s = new IntStack();
		s.push(1);
		s.push(2);
		s.push(3);
		assertEquals( 3 , s.length());

		assertEquals( 3 , s.pop());
		assertEquals( 2 , s.pop());
		assertEquals( 1 , s.pop());
		assertEquals( 0 , s.length());
		assertEquals( -1 , s.pop());


	}
	
	@Test
	public void test1() {
		IntStack s = new IntStack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(1);
		assertEquals( 10 , s.length());

		s.push(2);
		s.push(3);
		assertEquals( 12 , s.length());

	}


}
