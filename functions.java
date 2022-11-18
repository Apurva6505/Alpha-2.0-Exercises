import java.util.*;
public class functions{
    //1. Write a Java method to compute the average of three numbers. 

    //  public static int average(int a, int b, int c){
    //     return (a+b+c)/3;
    // } 

    //2. Write a method named isEven that accepts an int argument.The methods hould return true if the argument is even,or false otherwise. Also write a program to test your method.

    // public static boolean isEven(int num){
    //     if(num%2==0){
    //         return true;
    //     }else{
    //         return false;
    //     }
    // }

    //3. Write a Java program to check if a number is a palindrome in Java?(121 is a palindrome, 321 is not)

    // public static  boolean isPalindrome(int number){
    //     int palindrome = number;
    //     int reverse = 0;

    //     while(palindrome!=0) {
    //         int remainder = palindrome % 10;
    //         reverse = reverse * 10 + remainder;
    //         palindrome = palindrome / 10;
    //         }

    //         // if original and the reverse of number is equal means
    //         // number is palindrome in Java
    //         if(number==reverse) 
    //         {
    //             return true;
            
    //         }else{
    //             return false;
    //         }
    // }       


    //4. Write a Java method to compute the sum of the digits in an integer
    public static int sumDigits(int n){
        int sumOfDigits = 0;
        while(n>0){
           int lastDigit = n%10;
            sumOfDigits += lastDigit;
            n /= 10;
        }
        return sumOfDigits;
    }

    
    public static void main(String args[]){
       
        //1. System.out.println("average of 3 nos is: "+ average(2,3,4));

        //2. System.out.println(isEven(55));


        //3.  System.out.println("Please Enter a number :");
        // Scanner sc = new Scanner(System.in);
        // int palindrome=sc.nextInt();

        // if(isPalindrome(palindrome))
        //  {
        //     System.out.println("Number : "+palindrome+" is a palindrome");
        //  }else{
        //     System.out.println("Number : "+palindrome+" is not a palindrome");
        //     }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();

        System.out.println("The sum is "+sumDigits(number));

        //Math functions in java - study(javatpoint)








    }
}
