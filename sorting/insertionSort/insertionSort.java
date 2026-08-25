package sorting.insertionSort;

public class insertionSort {
    
    //insertion sort
    static void insertionsort(int[] arr){
        int len = arr.length - 1;
        for(int i = 0;i < len;i++){
            for(int j = i+1;j > 0;j--){
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }

    // Swap two numbers
    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // print array elements
    static void printarr(int[] arr,String text){
        System.out.print(text+"  ");
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n");
    }

    public static void main(String[] args){
        int[] arr = {8,5,6,3,1,0};
        printarr(arr,"before:");
        insertionsort(arr);
        printarr(arr,"after:");

    }
}
