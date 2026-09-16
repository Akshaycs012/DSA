package recursion;
import java.util.*;

public class recursion_level1{

    // basic recursion to print from 1 to 5
    static void print1to5(int n){
        if(n <= 0){
            return;
        }
        print1to5(n-1);
        System.out.println(n);
    }

    // basic recursion to print from 5 to 1
    static void print5to1(int n){
        if(n <= 0){
            return;
        }
        System.out.println(n);
        print5to1(n-1);
    }

    // recursion function to print from 1 to n
    static void printNumbers(int n){
        if(n <= 1){
            System.out.println(1);
            return ;
        }
        printNumbers(n-1);
        System.out.println(n);
    }

    // recursion function to print even numbers from 1 to n
    static void evenOdd(int n){
        if(n <= 1){
            return;
        }
        evenOdd(n-1);
        if(n % 2 == 0){
            System.out.println("even: "+n);
        }else{
            System.out.println("odd: "+n);
        }
    }

    // recursion function to print sum of numbers
    static int sumOfNum(int n){
        if(n <= 1){
            return 1;
        }
        return sumOfNum(n-1) + n;
    }
    // recursion function to print factorial numbers
    static int factOfNum(int n){
        if(n <= 0){
            return 1;
        }

        return factOfNum(n-1) * n;
    }

    // recursion function to print power
    static int powerOfNum(int a,int b){
        if(b <= 1){
            return a;
        }
        return powerOfNum(a,b-1) * a;
    }

    public static void main(String[] args) {
        System.out.println(powerOfNum(2,5));
    }
}