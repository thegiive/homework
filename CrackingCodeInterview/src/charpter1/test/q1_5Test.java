package charpter1.test;

import static org.junit.Assert.*;

import org.junit.Test;

import charpter1.q1_5;

public class q1_5Test {

	@Test
	public void test() {
		assertEquals( "a2b2c3" , q1_5.encode("aabbccc") ) ; 
		assertEquals( "aabbcc" , q1_5.encode("aabbcc") ) ; 
		assertEquals( "a1b4c5" , q1_5.encode("abbbbccccc") ) ; 
		assertEquals( "a1b1c12" , q1_5.encode("abcccccccccccc") ) ; 


	}

}
