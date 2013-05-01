import static org.junit.Assert.*;

import org.junit.Test;


public class StackTest {

	@Test
	public void test() {
		Stack<Abc> s = new Stack<Abc>();
		s.push(new Abc(1));
		s.push(new Abc(2)); 
		s.push(new Abc(3)); 
		assertEquals( 3 , s.length());
		assertEquals( 3 , s.pop().a);
		assertEquals( 2 , s.pop().a);
		assertEquals( 1 , s.pop().a);
		assertEquals( 0 , s.length());

	}

}

class Abc{
	int a ; 
	public Abc(int i){
		a = i ; 
	}
}