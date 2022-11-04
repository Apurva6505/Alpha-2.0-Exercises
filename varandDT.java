import java.util.Scanner;

public class varandDT {
    public static void main(String args[]) {
        // 1.avg of 3 nos.
        Scanner sc = new Scanner(System.in);

        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // int num3 = sc.nextInt();

        // int avg = (num1 + num2 + num3) / 3;
        // System.out.println(avg);

        // 2. side of square

        // int side = sc.nextInt();
        // int area = side * side;
        // System.out.println(area);

        // 3. Enter cost of 3 items from the user(using float datatype)-a pencil,a pen
        // and an
        // eraser.You have to output the total cost of the items back to the user as
        // their bill.

        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float bill = (float) (pencil + pen + eraser);
        System.out.println(bill);

        // Add on - with 18% tax
        float newBill = bill + (0.18f * bill);
        System.out.println(newBill);

    }
}