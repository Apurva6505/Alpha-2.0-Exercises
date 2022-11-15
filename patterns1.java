public class patterns1{
    public static void main(String args[]){

        //Inverted Pattern
        // for(int i=4;i>0;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();

            //Half number Pyramid

            // for(int i=1;i<=4;i++){
            //     for(int j=1;j<=i;j++){
            //         System.out.print(j);
            //     }
            //     System.out.println();
            // }

            //Half Character Pyramid

            char ch = 'A';
            for(int i=0;i<=4;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(ch);
                    ch++;
                }
                System.out.println();
            }
        }
    }
