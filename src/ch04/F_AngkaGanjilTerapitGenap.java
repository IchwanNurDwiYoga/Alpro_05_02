package ch04;
public class F_AngkaGanjilTerapitGenap {
    public static void main (String[] args){
        int [] array ={82, 12, 41, 1, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        
	System.out.println("Menampilkan semua nilai array : ");

	for (int i=0;i<array.length;i++){
	   System.out.print(array[i]+" ");  
        }
	System.out.println("\n");

	System.out.print("Bilangan ganjil yang diapit bilangan genap : ");
	for (int i=0;i<array.length;i++){
	   if (array[i]%2==0){
	       }else{
	         System.out.print(array[i]+", ");
	   }
	}
    }
}