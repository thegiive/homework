package charpter1.test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import charpter1.q1_4;

public class q1_4Test {

	@Test
	public void test() {
		String input = "abc cde                               " ;
		String result = q1_4.trans(q1_4.addSpace(input.toCharArray(), 7)); 

		assertEquals("abc%20cde" , result);
	}

	@Test
	public void test1() {
		String input = "abc c de                               " ;
		String result = q1_4.trans(q1_4.addSpace(input.toCharArray(), 8)); 

		assertEquals("abc%20c%20de" , result);
	}

	
}
