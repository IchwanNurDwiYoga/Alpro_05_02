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
public class G_KelipatanLima {
    public static void main(String[] args) {
        System.out.println("Program Menampilkan Nilai Berkelipatan 5 Dari:");
        int [] array ={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        for(int x=0;x<array.length;x++){
            System.out.print(array[x]+", ");
        }
        
        System.out.println("\n\nNilai yang berkelipatan 5 adalah:");
        for(int i = 0; i<array.length;i++){
            if(array[i]%5==0){
                System.out.print(array[i]+", ");
            }
        }
        System.out.println("");
    }
}
