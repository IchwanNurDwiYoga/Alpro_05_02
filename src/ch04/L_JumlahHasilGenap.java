package ch04;

/**
 *
 * @author ichwannur
 */
public class L_JumlahHasilGenap {
    public static void main (String[] args){
        int [] array ={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
	System.out.print("Menampilkan semua nilai array : ");
	
        for (int i=0;i<array.length;i++){
    	   System.out.print(array[i]+" ");
        }

	System.out.println();
    		
	int jumlah = array[0]+array[1];
	for (int i=0;i<array.length;i++){
	   if(array[i]%2==0){
	      jumlah = array[i]+array[i+1];
	         if(jumlah%2==0){
	         System.out.println(array[i]+" + "+array[i+1]+" = "+jumlah);
	      }
	   }
	}
    }
}