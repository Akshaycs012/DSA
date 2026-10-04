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

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(twoElementSum(arr,6));
    }

}
