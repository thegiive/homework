package charpter1.test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import charpter1.q1_6;

public class q1_6Test {

	@Test
	public void test() {
		int[][] arr = new int[3][3];
		int[] tarr = {1,2,3} ; 
		arr[0] = tarr;
		int[] tarr1 = {4,5,6} ;
		arr[1] = tarr1;
		int[] tarr2 = {7,8,9} ;
		arr[2] = tarr2;
		
		int[][] rarr = q1_6.rotate(arr) ;
		
		assertEquals( "[7, 4, 1]" , Arrays.toString(rarr[0]));
		assertEquals( "[8, 5, 2]" , Arrays.toString(rarr[1]));
		assertEquals( "[9, 6, 3]" , Arrays.toString(rarr[2]));

	}
	
	@Test
	public void test1() {
		int[][] arr = new int[4][4];
		int[] tarr  = {1,2,3,4} ; 
		int[] tarr1 = {5,6,7,8} ;
		int[] tarr2 = {9,10,11,12} ;
		int[] tarr3 = {13,14,15,16} ;

		arr[0] = tarr;
		arr[1] = tarr1;
		arr[2] = tarr2;
		arr[3] = tarr3;
		
		int[][] rarr = q1_6.rotate(arr) ;
		
		assertEquals( "[13, 9, 5, 1]" , Arrays.toString(rarr[0]));
		assertEquals( "[14, 10, 6, 2]" , Arrays.toString(rarr[1]));
		assertEquals( "[15, 11, 7, 3]" , Arrays.toString(rarr[2]));
		assertEquals( "[16, 12, 8, 4]" , Arrays.toString(rarr[3  ]));

	}

}
