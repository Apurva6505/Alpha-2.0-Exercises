import java.util.*;
public class conditionals{
    public static void main(String args[]){

        //1. Write a Javaprogram to get a number from the user and print whether it is positive or negative .

        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        //  if(num > 0){
        //     System.out.println(num +"is a positive number.");
        //  }
        //  else{
        //     System.out.println(num +"is a negative number.");
        //  }

        //2. Finish the following codes othat it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever.

        // double temp = 103.5;
        // if(temp > 100){
        //     System.out.println("You have fever.");
        // }else{
        //     System.out.println("You don't have fever.");
        // }

        //3. Write a Java program to input week number (1-7) and print day of week name using switch case.

        // System.out.println("Enter week number(1-7): ") ;
        // int day = sc.nextInt();
        // switch(day){
        //     case 1: {System.out.println("Monday"); break;}
        //     case 2: {System.out.println("Tuesday"); break;}
        //     case 3: {System.out.println("Wednesday"); break;}
        //     case 4: {System.out.println("Thursday"); break;}
        //     case 5: {System.out.println("Friday"); break;}
        //     case 6: {System.out.println("Saturday"); break;}
        //     case 7: {System.out.println("sunday"); break;}
        //     default: {System.out.println("Invalid Input! Please enter week number between 1 to 7.");}

        // }

        //4. What will be the value of x & y in thefollowing program:public class Solution{public static void main(String args[]) {int a=63,b=36;boolean x= (a<b)?true:false;int y= (a>b)?a:b;}

        // x = false;
        // y = 63;

        //5. Write a Java program that takes a year from the user and print whether that year is a leap year or not.

        // System.out.println("Enter the year: ");
        // int year = sc.nextInt();

        // boolean x = (year % 4)==0;
        // boolean y = (year%100)!=0;
        // boolean z = ((year%100==0) && (year%400==0));

        // if(x && (y||z)){
        //     System.out.println(year+" is a leap year.");
        // }else{
        //     System.out.println(year+" is not a leap year.");
        // }

        // * Prime Number Check


        // int count=0;
        // int num = sc.nextInt();

        // for(int i=1;i<=num;i++){
        //     if(num % i== 0){
        //         count++;
        //     }
        // }
        // if(count==2){
        //     System.out.println(num+ " is a prime number.");
        // }
        // else{
        //     System.out.println(num+ " is not a prime number.");
        // }

        int n = sc.nextInt();
        
        if(n==2){
            System.out.println(n+" is a prime number");
        }else{
            boolean isPrime = true;
            for(int i=2;i<=n-1;i++){
                if(n%i==0){
                    isPrime = false;
                }
            }
            if(isPrime==true){
                System.out.println(n+" is a prime number");
            }else{
                System.out.println(n+" is not a prime number");
            }


        }








    }
}