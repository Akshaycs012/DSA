package Bitwise_operations_and_number_system;

/* 
    Bit manipulation:
    AND (& with 1 it will give itself)
    OR 
    XOR (exclusive OR)(XOR with 1 give complement, XOR with 0 give itself)
    Complement ~ 
    
    Decimal (0,1,2,3,4,5,6,7,8,9) ex:(10)base 10
    Binary (0,1) ex:(1010)base 2
    Octal (0,1,2,3,4,5,6,7)
    Hexadecimal (0-9, A-F) base 16

    Decimal to base b:
    keep diving by base b, take remainders write it opposite
    
    base b to decimal:
    multiply and add to the power of base b with digit
    (digit * base ^ position) + ...

    Left Shift Operator (<<):
    a << 1 == 2a
    a << b == a * 2^b

    Right Shift Operator (>>):
    a >> b == a / 2^b

    Negative of given number
    2's complement: add 1 to the complement

    Range of numbers for n bits:
    -2^(n - 1) to 2^(n-1) - 1
    
*/


public class bitwise_operations {

    // number is odd or even (bit operator)
    static boolean oddeven(int n){
        return (n & 1) == 1; // AND
    }

    // in an array every number appears twice only one appears once find the number
    // using XOR
    static int uniquenumber(int[] arr){
        int unique = 0;
        for(int n: arr){
            unique ^= n; // XOR
        }
        return unique;
    }

    // find i th bit of number
    static int bitNumber(int n,int i){
        return n & (1 << (n-i));
    }


    public static void main(String[] args){
        

    }
}
