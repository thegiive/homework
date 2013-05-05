package charpter1.test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import charpter1.q1_7;

public class q1_7Test {

	@Test
	public void test() {
		int[][] arr = new int[4][4];
		int[] tarr  = {1,2,3,4} ; 
		int[] tarr1 = {5,6,7,8} ;
		int[] tarr2 = {9,10,11,12} ;
		int[] tarr3 = {13,14,15,16} ;

		arr[0] = tarr;
		arr[1] = tarr1;
		arr[2] = tarr2;
		arr[3] = tarr3;
		
		int[][] rarr = arr = q1_7.solve(arr); 
		assertEquals( "[1, 2, 3, 4]" , Arrays.toString(rarr[0]));
		assertEquals( "[5, 6, 7, 8]" , Arrays.toString(rarr[1]));
		assertEquals( "[9, 10, 11, 12]" , Arrays.toString(rarr[2]));
		assertEquals( "[13, 14, 15, 16]" , Arrays.toString(rarr[3  ]));
	}
	
	@Test
	public void test1() {
		int[][] arr = new int[4][4];
		int[] tarr  = {1,2,3,4} ; 
		int[] tarr1 = {5,6,0,8} ;
		int[] tarr2 = {9,10,11,12} ;
		int[] tarr3 = {13,14,15,16} ;

		arr[0] = tarr;
		arr[1] = tarr1;
		arr[2] = tarr2;
		arr[3] = tarr3;
		
		int[][] rarr = arr = q1_7.solve(arr); 
		assertEquals( "[1, 2, 0, 4]" , Arrays.toString(rarr[0]));
		assertEquals( "[0, 0, 0, 0]" , Arrays.toString(rarr[1]));
		assertEquals( "[9, 10, 0, 12]" , Arrays.toString(rarr[2]));
		assertEquals( "[13, 14, 0, 16]" , Arrays.toString(rarr[3  ]));
	}
	
	@Test
	public void test2() {
		int[][] arr = new int[4][4];
		int[] tarr  = {1,2,3,4} ; 
		int[] tarr1 = {5,6,0,8} ;
		int[] tarr2 = {9,0,11,12} ;
		int[] tarr3 = {13,14,15,16} ;

		arr[0] = tarr;
		arr[1] = tarr1;
		arr[2] = tarr2;
		arr[3] = tarr3;
		
		int[][] rarr = arr = q1_7.solve(arr); 
		assertEquals( "[1, 0, 0, 4]" , Arrays.toString(rarr[0]));
		assertEquals( "[0, 0, 0, 0]" , Arrays.toString(rarr[1]));
		assertEquals( "[0, 0, 0, 0]" , Arrays.toString(rarr[2]));
		assertEquals( "[13, 0, 0, 16]" , Arrays.toString(rarr[3  ]));
	}


}
