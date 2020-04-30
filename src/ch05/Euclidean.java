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
import java.util.Scanner;
public class Euclidean {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil1;
        int bil2;
        
        System.out.print("Masukkan Bilangan Pertama : ");
        bil1 = input.nextInt();
        System.out.println("Masukkan Bilangan Kedua : ");
        bil2 = input.nextInt();
        int faktor;
        
        if (bil1 > bil2) {
            faktor = bil1 % bil2;
            while (faktor != 0) {
                bil2 = bil1;
                bil1 = faktor;
                faktor = bil2 % bil1;
            }
            System.out.println(bil1);
        } else {
            faktor = bil2 % bil1;
            while (faktor != 0) {
                bil1 = bil2;
                bil2 = faktor;
                faktor = bil1 % bil2;
            }
            System.out.println(bil2);
        }
    }
}

