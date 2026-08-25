package sorting.bubbleSort;

public class bubbleSort {
    
    //bubble sort
    static void BubbleSort(int[] arr){
        int temp;
        boolean swaped = false;
        for(int i = 0;i < arr.length;i++){
            for(int j=1;j < arr.length-i;j++){
                if(arr[j] < arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swaped = true;
                }
            }
            if(!swaped){
                return;
            }
        }
        
        
    }

    // print array elements
    static void printarr(int[] arr){
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n");
    }


    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        System.out.print("before: ");
        printarr(arr);
        BubbleSort(arr);
        System.out.print("\nafter: ");
        printarr(arr);
    }

}
