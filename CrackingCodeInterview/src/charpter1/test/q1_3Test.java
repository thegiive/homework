package charpter1.test;

import static org.junit.Assert.*;

import org.junit.Test;

import charpter1.q1_3;

public class q1_3Test {

	@Test
	public void test() {
		assertEquals( true , q1_3.checkIfReorderString("lala", "alal")) ; 
		assertEquals( false , q1_3.checkIfReorderString("lala", "alaa")) ; 

	}

}
