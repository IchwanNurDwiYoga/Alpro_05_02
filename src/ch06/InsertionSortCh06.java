package ch06;
public class InsertionSortCh06 {
     public static void main(String a[]){
        int[] array = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("Array : ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

        System.out.println("");
        System.out.println("-------------------------------------------");
        System.out.println("Insertion Sort");
        for (int j = 1; j < array.length; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}

