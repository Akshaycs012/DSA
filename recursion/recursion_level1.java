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

    //predict output
    static void fun(int n){
        if(n == 0){
            return;
        }
        System.out.print(n+" ");
        fun(n-1);
        System.out.print(n+" ");
    }

    // recursion for sum digit
    static int sumDigits(int n){
        if(n % 10 == 0){
            return 0;
        }
        System.out.println(n+" "+n%10);
        return sumDigits(n/10) + n % 10;

    }

    // recursion for counting digits
    static int countDigits(int n){
        if(n % 10 == 0){
            return 0;
        }

        return countDigits(n-1) + 1;
    }

    // reverse a number
    static int reverseNumber(int n,int rev){
        if(n % 10 == 0){
            return rev;
        }

        int lasdig = n % 10;
        int nexdig = rev * 10 + lasdig;

        return reverseNumber(n-1,nexdig);
    }

    // recursion function for palindrome number by reversing the number
    static boolean palindrome(int original,int n,int rev){
        if(n == 0 ){
            return rev == original;
        }
        int last = n % 10;
        int first = rev * 10 + last;
        return palindrome(original,n/10,first);
    }


    public static void main(String[] args) {
        System.out.println();
    }
}