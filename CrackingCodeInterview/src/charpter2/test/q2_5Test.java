package charpter2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import charpter2.LinkedListNode;
import charpter2.q2_5;

public class q2_5Test {

	@Test
	public void test() {
		LinkedListNode a1 = new LinkedListNode(7);
		LinkedListNode a2 = new LinkedListNode(1);
		LinkedListNode a3 = new LinkedListNode(6);
		
		LinkedListNode a4 = new LinkedListNode(5);
		LinkedListNode a5 = new LinkedListNode(9);
		LinkedListNode a6 = new LinkedListNode(2);
		
		a1.next = a2 ; a2.next = a3 ; 
		a4.next = a5 ; a5.next = a6 ;
		
		assertEquals( 912 , q2_5.solve(a1, a4)); 

	}

	@Test
	public void test1() {
		LinkedListNode a1 = new LinkedListNode(7);
		LinkedListNode a2 = new LinkedListNode(1);
		LinkedListNode a3 = new LinkedListNode(6);
		
		LinkedListNode a4 = new LinkedListNode(5);
		LinkedListNode a5 = new LinkedListNode(9);
		LinkedListNode a6 = new LinkedListNode(2);
		LinkedListNode a7 = new LinkedListNode(1);
		
		a1.next = a2 ; a2.next = a3 ; 
		a4.next = a5 ; a5.next = a6 ; a6.next = a7 ; 
		
		assertEquals( 1912 , q2_5.solve(a1, a4)); 

	}
}
