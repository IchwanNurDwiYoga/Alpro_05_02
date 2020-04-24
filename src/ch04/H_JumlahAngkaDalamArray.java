package ch04;

public class H_JumlahAngkaDalamArray {
    public static void main (String[] args){
        int [] array ={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
	System.out.print("Menampilkan semua nilai array : ");

        for (int i=0;i<array.length;i++){
    	   System.out.print(array[i]+" ");
        }

    	System.out.println("\nJumlah data dalam array : "+array.length);
        int total=0;
        for (int i:array){
            total = total+i;
        }
        System.out.println("Total angka di dalam array = "+total);
    }
}