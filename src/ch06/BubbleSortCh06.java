package ch06;
public class BubbleSortCh06 {
    public static void main(String[] args) {
        int i,j,temp;
        int array[]={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        //menampilkan array
        System.out.print("Array: ");
        for(i = 0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        System.out.println("-------------------------------------------");
        System.out.println("Bubble Sort Naik:");
        for( i=0;i<array.length;i++){
            for( j=0;j<array.length-1;j++){
                if(array[j]>array[j+1]){
                     temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for(i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        System.out.println("-------------------------------------------");
        System.out.println("Bubble Sort Turun:");
        for(i=0;i<array.length;i++){
            for( j=0;j<array.length-1;j++){
                if(array[j]<array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for(i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
