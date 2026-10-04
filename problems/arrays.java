package problems;
// import java.util.*;


public class arrays {
    
    // Two pointers: sum of two elements is equal to target
    static int twoElementSum(int[] arr,int target){
        int left = 0;
        int right = arr.length - 1;
        int sum,count=0;

        if(arr[right] + arr[right-1] < target){
            System.out.println("no match fount for "+target);
            return -1;
        };

        while(left < right){
            sum = arr[left] + arr[right];
            if(sum == target){
                System.out.println(arr[left]+"+"+arr[right]+" = "+sum);
                count++;
                left++;
                right--;
            }else if(sum < target){
                left++;
            }else{
                right--;
            }
        }

        return count;
    }

    // Prefix sum / Cumulative sum
    static int prefixSum(int[] arr,int target){
        int n = arr.length;
        int[] prefix = new int[n+1];
        prefix[0] = 0;
        int count = 0;

        for(int i=0;i<n;i++){
            prefix[i+1] = prefix[i]+arr[i];
        }

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(prefix[j+1]-prefix[i] == target){
                    System.out.println(i+" to "+j+" gives "+target);
                    count++;
                }
            }
        }


        return count;
    }

    // Move all zeros to the end
    static void moveZero(int[] arr){
        int left = 0;
        int right = 1;
        printarr("Before: ",arr);
        while(left < right && right < arr.length){
            if(arr[left] == 0 && arr[right] != 0){
                arr[left] = arr[right];
                arr[right] = 0;
                left++;
                right++; 
            }else if(arr[left] == 0 && arr[right] == 0){
                right++;
            }else{
                left++;
                right++;
            }
        }
        printarr("After: ",arr);
    }
    
    static int secondLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int seclargest = Integer.MIN_VALUE;
        for(int i=0;i < arr.length;i++){
            if(arr[i] > largest){
                seclargest = largest;
                largest = arr[i];
            }else if(arr[i] > seclargest && arr[i] != largest){
                seclargest = arr[i];
            }
        }

        return seclargest;
    }

    // Remove duplicate characters
    static StringBuilder removeDuplicate(String name){
        StringBuilder n = new StringBuilder(name);
        for(int i=0;i < n.length();i++){
            for(int j=i+1;j < n.length();){
                if(n.charAt(i) == n.charAt(j)){
                    n.deleteCharAt(j);
                }else{
                    j++;
                }
            }
        }
        return n;
    }



    // print integer array with custom text 
    static void printarr(String text, int[] arr){
        System.out.print(text);
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args){

        String name = "banaaaa";
        System.out.println(removeDuplicate(name));

    }

}
