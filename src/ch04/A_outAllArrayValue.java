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
public class A_outAllArrayValue {
    public static void main(String[] args) {
        int [] angka ={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
        for(int i = 0; i<angka.length;i++){
            System.out.println("index ke-"+i+" = "+angka[i]);
        }
    }
}
