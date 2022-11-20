public class advPatterns{
    //Hollow Rectangle

    // public static void hollow_rectangle(int rows,int cols){
    //     for(int i=1;i<=rows;i++){
    //         for(int j=1;j<=cols;j++){
    //             if(i==1||i==rows||j==1||j==cols){
    //                 System.out.print("*");
    //             }else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }

    // }

    // Inverted and rotated half pyramid

    // public static void inverted_and_rotated_half_pyramid(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=i;j<=n;j++){
    //             System.out.print(" ");

    //         }
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }

    // }

    // Inverted half pyramid with numbers

    // public static void inverted_half_pyramid_with_numbers(int n){
        
    //     for(int i=n;i>=1;i--){
    //         for(int j=1;j<=i;j++){
    //             System.out.print(j);
              
    //         }
    //         System.out.println();
            
    //     }
    // }

    // Floyd's Triangle

    // public static void floydsTriangle(int n){
    //     int num = 1;
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=i;j++){
    //             System.out.print(num+" ");
    //             num++;
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void zero_one_Triangle(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=i;j++){
    //             if((i+j)%2==0){
    //                 System.out.print("1");
    //             }else{
    //                 System.out.print("0");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

//     public static void butterfly(int n){
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             for(int j=1;j<=2*(n-i);j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
// //----------------------------------------------------------------------------------------
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             for(int j=1;j<=2*(n-i);j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

// Solid Rhombus

    // public static void solidRhombus(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=(n-i);j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=n;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
            
    // }

    // Hollow Rhombus

    // public static void hollow_rhombus(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=(n-i);j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=n;j++){
    //             if(i==1||i==n||j==1||j==n){
    //                 System.out.print("*");
    //             }else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    // Diamond

    public static void diamond(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //---------------------------------------------------------------
        for(int i=n;i>=1;i--){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){

        // hollow_rectangle(4,5);

        // inverted_and_rotated_half_pyramid(4);

        // inverted_half_pyramid_with_numbers(5);

        // floydsTriangle(5);

        // zero_one_Triangle(5);

        // butterfly(4);

        // solidRhombus(5);

        // hollow_rhombus(5);

        diamond(4);
    }
}