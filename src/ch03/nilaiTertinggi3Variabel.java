package ch03;

import java.util.Scanner;
public class nilaiTertinggi3Variabel{
	public static void main(String [] args){
		Scanner input = new Scanner (System.in);

		int x;
		int y;
		int z;

		System.out.print("Masukkan nilai X : ");
		x=input.nextInt();
		System.out.print("Masukkan nilai Y : ");
		y=input.nextInt();
		System.out.print("Masukkan nilai Z : ");
		z=input.nextInt();

		if(x>y&&x>z){
			System.out.println("X adalah variabel dengan nilai terbesar");
		}else if (y>x&&y>z){
			System.out.println("Y adalah variabel dengan nilai terbesar");
		}else if(z>x&&z>y){
			System.out.println("Z adalah variabel dengan nilai terbesar");
		}else{
			System.out.println("");}
	}
}
