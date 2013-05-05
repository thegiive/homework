package charpter2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import charpter2.LinkedListNode;
import charpter2.q2_3;

public class q2_3Test {

	@Test
	public void test() {
		LinkedListNode a1 = new LinkedListNode(1);
		LinkedListNode a2 = new LinkedListNode(2);
		LinkedListNode a3 = new LinkedListNode(3);
		a1.next = a2 ; 
		a2.next = a3 ; 

		q2_3.solve(a2) ;
		
		assertEquals( 3 , a1.next.value);
	}

}
