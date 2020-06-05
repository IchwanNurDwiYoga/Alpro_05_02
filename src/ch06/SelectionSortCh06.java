package ch06;
public class SelectionSortCh06 {
    public static void main(String[] args) {
        int i,j,temp, imin;
        int array[]={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        //menampilkan array
        System.out.print("Array: ");
        for(i = 0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        System.out.println("-------------------------------------------");
        System.out.println("Selection Sort Turun:");
        for( i=0;i<array.length-1;i++){
            imin=i;
            for( j=i+1;j<array.length;j++){
                if(array[j]>array[imin]){
                     imin=j;
                }
            }
            temp=array[i];
            array[i]=array[imin];
            array[imin]=temp;
        }
        for(i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        System.out.println("-------------------------------------------");
        System.out.println("Selection Sort Naik:");
        for( i=0;i<array.length-1;i++){
            imin=i;
            for( j=i+1;j<array.length;j++){
                if(array[j]<array[imin]){
                     imin=j;
                }
            }
            temp=array[i];
            array[i]=array[imin];
            array[imin]=temp;
        }
        for(i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}

