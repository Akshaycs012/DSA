package sorting.selectionSort;

public class selectionSort {

    // Selection sort
    static void selectionsort(int[] arr){
        int len = arr.length - 1;
        
        for(int i =0;i<len;i++){
            int max = findMax(arr,len-i);
            swap(arr,max,len-i);
        }
    }

    static int findMax(int[] arr,int end){
        int start =0,index=0;
        int max = arr[start];
        while(start <= end){
            if(arr[start] > max){
                max = arr[start];
                index = start;
            }
            start++;
        }
        return index;
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
        int[] arr = {0,1};
        printarr(arr,"before:");
        selectionsort(arr);
        printarr(arr,"after:");

    }
}
