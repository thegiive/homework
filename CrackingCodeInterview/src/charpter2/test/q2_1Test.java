package charpter2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import charpter2.LinkedListNode;
import charpter2.q2_1;

public class q2_1Test {

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
		LinkedListNode a9 = new LinkedListNode(2);
		LinkedListNode a10= new LinkedListNode(10);
		LinkedListNode a11= new LinkedListNode(11);


		a1.next = a2 ; 
		a2.next = a3 ; 
		a3.next = a4 ; 
		a4.next = a5 ; 
		a5.next = a6 ; 
		a6.next = a7 ; 
		a7.next = a8 ; 
		a8.next = a9 ; 
		a9.next = a10;
		a10.next = a11; 
		
		q2_1.deleteRepeat1(a1); 
		
		LinkedListNode l = a1; 
		String c = ""; 
		while(l.hasNext()){
			c += l.value;
			l = l.next ; 
		}
		c+= l.value; 
		assertEquals( "123456781011" , c);
	}
	
	@Test
	public void test1() {
		LinkedListNode a1 = new LinkedListNode(1);
		LinkedListNode a2 = new LinkedListNode(2);
		LinkedListNode a3 = new LinkedListNode(2);
		LinkedListNode a4 = new LinkedListNode(4);
		LinkedListNode a5 = new LinkedListNode(5);
		LinkedListNode a6 = new LinkedListNode(6);
		LinkedListNode a7 = new LinkedListNode(7);
		LinkedListNode a8 = new LinkedListNode(8);
		LinkedListNode a9 = new LinkedListNode(2);
		LinkedListNode a10= new LinkedListNode(10);
		LinkedListNode a11= new LinkedListNode(11);


		a1.next = a2 ; 
		a2.next = a3 ; 
		a3.next = a4 ; 
		a4.next = a5 ; 
		a5.next = a6 ; 
		a6.next = a7 ; 
		a7.next = a8 ; 
		a8.next = a9 ; 
		a9.next = a10;
		a10.next = a11; 
		
		q2_1.deleteRepeat1(a1); 
		
		LinkedListNode l = a1; 
		String c = ""; 
		while(l.hasNext()){
			c += l.value;
			l = l.next ; 
		}
		c+= l.value; 
		assertEquals( "12456781011" , c);
	}

	@Test
	public void test2() {
		LinkedListNode a1 = new LinkedListNode(1);
		LinkedListNode a2 = new LinkedListNode(2);
		LinkedListNode a3 = new LinkedListNode(2);
		LinkedListNode a4 = new LinkedListNode(4);
		LinkedListNode a5 = new LinkedListNode(5);
		LinkedListNode a6 = new LinkedListNode(1);
		LinkedListNode a7 = new LinkedListNode(7);
		LinkedListNode a8 = new LinkedListNode(8);
		LinkedListNode a9 = new LinkedListNode(2);
		LinkedListNode a10= new LinkedListNode(10);
		LinkedListNode a11= new LinkedListNode(11);


		a1.next = a2 ; 
		a2.next = a3 ; 
		a3.next = a4 ; 
		a4.next = a5 ; 
		a5.next = a6 ; 
		a6.next = a7 ; 
		a7.next = a8 ; 
		a8.next = a9 ; 
		a9.next = a10;
		a10.next = a11; 
		
		q2_1.deleteRepeat1(a1); 
		
		LinkedListNode l = a1; 
		String c = ""; 
		while(l.hasNext()){
			c += l.value;
			l = l.next ; 
		}
		c+= l.value; 
		assertEquals( "1245781011" , c);
	}

	@Test
	public void test3() {
		LinkedListNode a1 = new LinkedListNode(1);
		LinkedListNode a2 = new LinkedListNode(2);
		LinkedListNode a3 = new LinkedListNode(3);
		LinkedListNode a4 = new LinkedListNode(1);
		LinkedListNode a5 = new LinkedListNode(5);
		LinkedListNode a6 = new LinkedListNode(1);
		LinkedListNode a7 = new LinkedListNode(7);
		LinkedListNode a8 = new LinkedListNode(8);
		LinkedListNode a9 = new LinkedListNode(2);
		LinkedListNode a10= new LinkedListNode(10);
		LinkedListNode a11= new LinkedListNode(11);


		a1.next = a2 ; 
		a2.next = a3 ; 
		a3.next = a4 ; 
		a4.next = a5 ; 
		a5.next = a6 ; 
		a6.next = a7 ; 
		a7.next = a8 ; 
		a8.next = a9 ; 
		a9.next = a10;
		a10.next = a11; 
		
		q2_1.deleteRepeat1(a1); 
		
		LinkedListNode l = a1; 
		String c = ""; 
		while(l.hasNext()){
			c += l.value;
			l = l.next ; 
		}
		c+= l.value; 
		assertEquals( "1235781011" , c);
	}

	@Test
	public void test4() {
		LinkedListNode a1 = new LinkedListNode(1);
		LinkedListNode a2 = new LinkedListNode(2);
		LinkedListNode a3 = new LinkedListNode(2);
		LinkedListNode a4 = new LinkedListNode(4);
		LinkedListNode a5 = new LinkedListNode(5);
		LinkedListNode a6 = new LinkedListNode(1);
		LinkedListNode a7 = new LinkedListNode(7);
		LinkedListNode a8 = new LinkedListNode(8);
		LinkedListNode a9 = new LinkedListNode(2);
		LinkedListNode a10= new LinkedListNode(10);
		LinkedListNode a11= new LinkedListNode(11);


		a1.next = a2 ; 
		a2.next = a3 ; 
		a3.next = a4 ; 
		a4.next = a5 ; 
		a5.next = a6 ; 
		a6.next = a7 ; 
		a7.next = a8 ; 
		a8.next = a9 ; 
		a9.next = a10;
		a10.next = a11; 
		
		q2_1.deleteRepeat1(a1); 
		
		LinkedListNode l = a1; 
		String c = ""; 
		while(l.hasNext()){
			c += l.value;
			l = l.next ; 
		}
		c+= l.value; 
		assertEquals( "1245781011" , c);
	}

	@Test
	public void test5() {
		
		LinkedListNode a1 = new LinkedListNode(1);
		LinkedListNode a2 = new LinkedListNode(2);
		LinkedListNode a3 = new LinkedListNode(2);
		LinkedListNode a4 = new LinkedListNode(2);
		LinkedListNode a5 = new LinkedListNode(5);
		LinkedListNode a6 = new LinkedListNode(1);
		LinkedListNode a7 = new LinkedListNode(7);
		LinkedListNode a8 = new LinkedListNode(8);
		LinkedListNode a9 = new LinkedListNode(2);
		LinkedListNode a10= new LinkedListNode(10);
		LinkedListNode a11= new LinkedListNode(11);


		a1.next = a2 ; 
		a2.next = a3 ; 
		a3.next = a4 ; 
		a4.next = a5 ; 
		a5.next = a6 ; 
		a6.next = a7 ; 
		a7.next = a8 ; 
		a8.next = a9 ; 
		a9.next = a10;
		a10.next = a11; 
		
		q2_1.deleteRepeat1(a1); 
		
		LinkedListNode l = a1; 
		String c = ""; 
		while(l.hasNext()){
			c += l.value;
			l = l.next ; 
		}
		c+= l.value; 
		assertEquals( "125781011" , c);
	}

	@Test
	public void test6() {
		
		LinkedListNode a1 = new LinkedListNode(1);
		LinkedListNode a2 = new LinkedListNode(2);
		LinkedListNode a3 = new LinkedListNode(2);
		LinkedListNode a4 = new LinkedListNode(2);
		LinkedListNode a5 = new LinkedListNode(2);
		LinkedListNode a6 = new LinkedListNode(1);
		LinkedListNode a7 = new LinkedListNode(7);
		LinkedListNode a8 = new LinkedListNode(8);
		LinkedListNode a9 = new LinkedListNode(2);
		LinkedListNode a10= new LinkedListNode(10);
		LinkedListNode a11= new LinkedListNode(11);


		a1.next = a2 ; 
		a2.next = a3 ; 
		a3.next = a4 ; 
		a4.next = a5 ; 
		a5.next = a6 ; 
		a6.next = a7 ; 
		a7.next = a8 ; 
		a8.next = a9 ; 
		a9.next = a10;
		a10.next = a11; 
		
		q2_1.deleteRepeat1(a1); 
		
		LinkedListNode l = a1; 
		String c = ""; 
		while(l.hasNext()){
			c += l.value;
			l = l.next ; 
		}
		c+= l.value; 
		assertEquals( "12781011" , c);
	}

}
