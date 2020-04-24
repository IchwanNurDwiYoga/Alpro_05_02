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
public class C_BilanganGanjil {
    public static void main(String[] args) {
        System.out.println("Menentukan Nilai Ganjil Dari:");
        //deklarasi array
        int [] array ={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        //menampilkan semua isi array
        for(int x=0;x<array.length;x++){
            System.out.print(array[x]+" ");
        }
        
        //menampilkan nilai ganjil dalam array
        System.out.println("\n\nNilai ganjilnya yaitu:");
        for(int i=0;i<array.length;i++){
            if(array[i]%2==1){
                System.out.print(array[i]+", ");
            }
        }
        System.out.println("");
    }
}
