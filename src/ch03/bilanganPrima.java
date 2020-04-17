package ch03;

import java.util.Scanner;
import java.lang.Math;

public class bilanganPrima{
	public static void main(String [] args){
		Scanner nilai = new Scanner(System.in);
		int bilangan, faktor, pembagi;
		faktor=0;
		System.out.print("Masukkan nilai yang akan dicek : ");
		bilangan=nilai.nextInt();
		for(pembagi = 1; pembagi<=bilangan; pembagi++){
			if(bilangan%pembagi==0){
				faktor=faktor+1;
			}
		}
		if(faktor == 2){
			System.out.println("Ini adalah bilangan prima");
		}else{
			System.out.println("Ini bukan bilangan prima");
		}
	}
}
