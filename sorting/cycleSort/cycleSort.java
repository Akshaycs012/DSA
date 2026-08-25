package sorting.cycleSort;

public class cycleSort {
    
    // Cycle sort 
    static void cyclesort(int[] arr){
        int i = 0,correct;
        while(i < arr.length){
            correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
            
        }
    }

    // Swap function
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
        int[] arr = {5,3,4,1,2,6,7,8};
        printarr(arr,"before:");
        cyclesort(arr);
        printarr(arr,"after:");

    }
}
