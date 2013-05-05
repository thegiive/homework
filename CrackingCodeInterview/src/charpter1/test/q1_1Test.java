package charpter1.test;

import static org.junit.Assert.*;

import org.junit.Test;

import charpter1.q1_1;

public class q1_1Test {

	@Test
	public void test() {
		assertEquals( true , q1_1.checkIfRepeat("lala") ) ;
		assertEquals( false , q1_1.checkIfRepeat("la") ) ; 
		assertEquals( false , q1_1.checkIfRepeat("la123") ) ; 
		assertEquals( true , q1_1.checkIfRepeat("la123laa") ) ; 


	}

}
