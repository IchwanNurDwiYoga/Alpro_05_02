/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch05;

/**
 *
 * @author ichwannur
 */
public class Kadane {
	// Kadane algorithm
	public int kandane(int[] arrA) {
		int max_end_here = 0;
		int max_so_far = 0;
		for (int i = 0; i < arrA.length; i++) {
			max_end_here += arrA[i];
			if (max_end_here < 0) {
				max_end_here = 0;
			}
			if (max_so_far < max_end_here) {
				max_so_far = max_end_here;
			}
		}
		return max_so_far;
	}

	// Below modification will allow the program to work even if all the
	// elements in the array are negative
	public int KadaneModify(int[] arrA) {
		int max_end_here = arrA[0];
		int max_so_far = arrA[0];
		for(int i=1;i<arrA.length;i++){
			max_end_here = Math.max(arrA[i], max_end_here+arrA[i]);
			max_so_far = Math.max(max_so_far,max_end_here);
		}
		return max_so_far;
	}

	public static void main(String args[]) {
		int arrA[] = { 1, 2, -3, -4, 2, 7, -2, 3 };
		Kadane i = new Kadane();
		System.out.println("Maximum subarray is  " + i.kandane(arrA));
		int arrB[] = { -2, -3, -4, -2, -7, -2, -3,-11 };
		System.out.println("Maximum Subarray when all elements are negative : " + i.KadaneModify(arrB));
	}
}