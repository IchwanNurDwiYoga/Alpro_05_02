package ch03;

import java.util.Scanner;
public class nilaiTertinggi2Variabel{
	public static void main(String [] args){
		Scanner nilai = new Scanner (System.in);
		int x;
		int y;

		System.out.print("Masukkan nilai X :");
		x = nilai.nextInt();
		System.out.println("");
		System.out.print("Masukkan nilai Y :");
		y = nilai.nextInt();

		if(x>y){
			System.out.println("X lebih besar dari Y");
		}else if(y>x){
			System.out.println("Y lebih besar dari X");
		}else{
			System.out.println("Nilai yang dimasukkan sama besar");}
	}
}
