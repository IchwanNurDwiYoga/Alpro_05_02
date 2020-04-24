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
import java.util.Scanner;
public class B_MencariNilai {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Disediakan Angka\n================");
        int [] array ={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        for(int x=0;x<array.length;x++){
            System.out.println("No. "+(x+1)+" index ke-"+x+" = "+array[x]+" ");
        }
        
        boolean jumpa=false;
        int i=0;
        
        System.out.print("\nMasukkan nilai yang akan dicari : ");
        int cari = scan.nextInt();
        for (i = 0; i<array.length;i++){
            if(array[i]==cari){
                jumpa=true;
                break;
            }
        }
        if(jumpa){
                System.out.println("Penacrian berhasil, nilai "+cari+" berada di:\nNo."+(i+1)+" index ke-"+i);
        }else{
            System.out.println("Data tidak ditemukan");
        }
    }
}
