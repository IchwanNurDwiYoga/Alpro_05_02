/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch04;

/**
 *
 * @author ichwannur
 */
public class M_TotalSelisih {
    public static void main (String[] args){
        int [] array ={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
	System.out.print("Menampilkan semua nilai array : ");
	int i;
        for ( i=0;i<array.length;i++){
    	   System.out.print(array[i]+" ");
        }

	System.out.println();
    	int total =0;	
	int selisih;
	for ( i=0;i<array.length;i++){
	     	if(i==array.length-1){
	     	}else{
		   selisih = array[i]-array[i+1];
                   total=total+selisih;
		   System.out.println("Selisih "+array[i]+" - "+array[i+1]+" = "+selisih);
	   }
	}
        System.out.println("Total dari seisih tiap bilangan adalah = "+total);
    }
}
