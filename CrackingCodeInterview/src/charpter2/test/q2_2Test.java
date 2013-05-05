package charpter2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import charpter2.LinkedListNode;
import charpter2.q2_2;

public class q2_2Test {

	@Test
	public void test() {
		LinkedListNode a1 = new LinkedListNode(1);
		LinkedListNode a2 = new LinkedListNode(2);
		LinkedListNode a3 = new LinkedListNode(3);
		LinkedListNode a4 = new LinkedListNode(4);
		LinkedListNode a5 = new LinkedListNode(5);
		LinkedListNode a6 = new LinkedListNode(6);
		LinkedListNode a7 = new LinkedListNode(7);
		LinkedListNode a8 = new LinkedListNode(8);
		LinkedListNode a9 = new LinkedListNode(9);
		LinkedListNode a10= new LinkedListNode(10);

		a1.next = a2 ; 
		a2.next = a3 ; 
		a3.next = a4 ; 
		a4.next = a5 ; 
		a5.next = a6 ; 
		a6.next = a7 ; 
		a7.next = a8 ; 
		a8.next = a9 ; 
		a9.next = a10;
		
		assertEquals( 8 , q2_2.findKNode(a1, 3));
		
		LinkedListNode l = a1; 
		while(l.hasNext()){
			System.out.println(l.value);
			l = l.next ; 
		}
		System.out.println(l.value);

	}

}
