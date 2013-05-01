import static org.junit.Assert.*;

import org.junit.Test;


public class BestCowLineTest {

	@Test
	public void test() {		
 		assertEquals( true, Main.whoIsWin("ABC".toCharArray()) ) ; 
 		assertEquals( false, Main.whoIsWin("ZBC".toCharArray()) ) ; 
 		assertEquals( true, Main.whoIsWin("ABA".toCharArray()) ) ; 


 		assertEquals( true, Main.whoIsWin("ABCA".toCharArray()) ) ; 
 		assertEquals( false, Main.whoIsWin("ACBA".toCharArray()) ) ; 

	}
		
	@Test
	public void test1() {		
 		assertEquals( "ABC" , Main.rearrange("ABC".toCharArray())) ; 
 		assertEquals( "ABAC" , Main.rearrange("ABAC".toCharArray())) ; 
		assertEquals( "ABC" , Main.rearrange("ACB".toCharArray())) ; 
		assertEquals( "ABCBCD" , Main.rearrange("ACDBCB".toCharArray())) ; 

	}
	
	@Test
	public void test2() {		
 		assertEquals( "ABC" , Main.re("ABC".toCharArray())) ; 
 		assertEquals( "ABAC" , Main.re("ABAC".toCharArray())) ; 
		assertEquals( "ABC" , Main.re("ACB".toCharArray())) ; 
		assertEquals( "ABCBCD" , Main.re("ACDBCB".toCharArray())) ; 

	}

}
