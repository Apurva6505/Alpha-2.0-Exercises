import java.util.*;
public class loops{
    public static void main(String args[]){
        //1. Write a program that reads a set of integers,and then prints thesum of the even and odd integers

        Scanner sc = new Scanner(System.in);
        // int number;
        // int choice;
        // int evenSum = 0;
        // int oddSum = 0;

        // do{
        //     System.out.print("Enter the number: ");
        //     number = sc.nextInt();

        //     if(number%2==0){
        //         evenSum += number;
        //     }else{
        //         oddSum += number;
        //     }

        //     System.out.print("Do you want to continue? (Press 1 for yes and 0 for no.)");

        //   choice = sc.nextInt();


        // }while(choice == 1);


        //     System.out.println("Sum of even numbers: "+evenSum);
        //     System.out.println("Sum of odd numbers: "+oddSum);

           //2. Write a program to find the factorial of any number entered by the user

        //    int num = sc.nextInt();
        //    int f = 1;
        //    for(int i=1;i<=num;i++){
        //     f=f*i;
        //     }
        //    System.out.println("Factorial of a given number is: "+f);

        //3. Write a program to print the multiplication table of a number N,entered by the user
           
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" ="+n*i);
        }

        

        
    }
}