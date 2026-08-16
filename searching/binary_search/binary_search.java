package binary_search;
//import java.util.*;

public class binary_search{

    // Binary Search
    static int binarySearch(int[] arr, int key){
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while(start <= end){
            mid = start + (end - start) / 2 ;
            if(key < arr[mid]){
                end = mid - 1;
            }else if(key > arr[mid]){
                start = mid + 1;
            }else{
                return arr[mid];
            }
        }

        return -1;
    }

    // Ceiling Binary Search
    static int ceilingBinarySearch(int[] arr, int key){
        int start = 0;
        int end = arr.length -1;
        int mid;

        while(start <= end){
            mid = start + (end - start) / 2;

            if(key < arr[mid]){
                end = mid - 1;
            }else if(key > arr[mid]){
                start = mid + 1;
            }else{
                return arr[mid];
            }
        }

        return arr[start];
    }

    // floor Binary Search
    static int floorBinarySearch(int[] arr, int key){
        int start = 0;
        int end = arr.length - 1;
        int mid;

        while(start <= end){
            mid = start +(end - start) / 2;
            if(key < arr[mid]){
                end = mid - 1;
            }else if(key > arr[mid]){
                start = mid + 1;
            }else{
                return arr[mid];
            }
        }

        return arr[end];
    }

    // binary search for character array ceiling(larger than target)
    static int characterCeilingBinarySearch(char[] arr, char key){
        int start = 0;
        int end = arr.length - 1;
        int mid;

        while(start <= end){
            mid = start + (end - start) / 2;
            if(key < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return start % arr.length;
    }
    
    // find first occurance of a given number
    static int firstOccuranceOfNum(int[] arr, int key){
        int start = 0;
        int end = arr.length -1;
        int mid;
        int ans = -1;
        while(start <= end){
            mid = start + (end - start) / 2;
            if(key < arr[mid]){
                end = mid - 1;
            }else if(key > arr[mid]){
                start = mid + 1;
            }else{
                ans = mid;
                end = mid -1;
            }
        }
        if(ans != -1){
            return ans;
        }

        return -1;
    }
    
    // find last occurance of a given number
    static int lastOccuranceOfNum(int[] arr,int key){
        int start = 0;
        int end = arr.length - 1;
        int mid;
        int ans = -1;

        while(start <= end){
            mid = start + (end - start) / 2;
            if(key < arr[mid]){
                end = mid - 1;
            }else if(key > arr[mid]){
                start = mid + 1;
            }else{
                ans = mid;
                start = mid + 1;
            }
        }
        if(ans != -1){
            return ans;
        }
        return -1;
    }
    
    // find first and last occurance of a givn number
    static int[] firstAndLastOccurance(int[] arr,int key){
        int[] ans = new int[2] ;
        ans[0] = firstOccuranceOfNum(arr, key);
        ans[1]  = lastOccuranceOfNum(arr, key);
        return ans;
    }
    
    //find key in an array whose size is infinate(not given)
    static int findKeyInfinateArray(int[] arr,int key){
        int start = 0;
        int end = 1;
        int newStart,mid;
        while(key > arr[end]){
            newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        while(start <= end){
            mid = start + (end - start) / 2;
            if(key < arr[mid]){
                end = mid - 1;
            }else if(key > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }

        return -1;
    }
    
    // finding peak of an element
    static int peakOfAnMountain(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int mid,peak=-1;

        while(start < end){
            mid = start + (end - start)/2;
            if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }else if(arr[mid] > arr[mid + 1]){
                end = mid;
                peak = mid;
            }else{
                return mid;
            }
        }
        return peak;
    }

    // find pivot element from the array
    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int mid;
        if(arr[start] < arr[end]) return -1;
        while(start <= end){
            mid = start + (end - start) / 2;
            if(arr[start] < arr[mid]){
                start = mid;
            }else if(arr[start] > arr[mid]){
                end = mid - 1;
            }else{
                return mid;
            }
        }

        return -1;
    }

    // find number of rotation in an array
    static int rotation(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }

    public static void main(String[] args){

    } 
}