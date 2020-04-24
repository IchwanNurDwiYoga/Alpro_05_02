package ch04;

/**
 *
 * @author ichwannur
 */
public class N_JumlahAngkaSebelumnya {
    public static void main (String[] args){
        int [] array ={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
	System.out.print("Menampilkan semua nilai array : ");

        for (int i=0;i<array.length;i++){
    	   System.out.print(array[i]+" ");
        }
	
	System.out.println();

	System.out.println();
	
	int jumlah = 0;
	for (int i=0;i<array.length;i++){
	   for(int angka:array){
	      if(array[i]<array.length){
	      jumlah=array.length-array[i];
	      }
	   }
    	System.out.println("Jumlah angka sebelum "+array[i]+" : "+jumlah);
        }
    }
}