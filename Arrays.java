import java.util.*;
public class Arrays{
    // // Call By Reference
    // public static void update(int marks[],int nonChangeable){
    //     nonChangeable = 10;
    //     for(int i=0;i<marks.length;i++){
    //          marks[i]=marks[i]+1;
    //     }

    //---------------------------------------------------------------------------------------

    // public static int LinearSearch(int numbers[], int key){
    //     for(int i=0;i<numbers.length;i++){
    //         if(numbers[i]==key){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
//-----------------------------------------------------------------------------------------------
    // public static String LinearSearch(String menu[],String key){
    //     int temp=0;
    //     for(int i=0;i<menu.length;i++){
             
    //         if(menu[i].equals(key)){
    //             System.out.print("Key present in "+i+" index position");
    //             temp=temp+1;
                
    //         }
    //     }
    //     if(temp==0){
    //         System.out.print("Key not present in the list!");

    //     }
    //     return key;
    // }
//--------------------------------------------------------------------------------------------
    // public static int getLargest(int numbers[]){
    //     int largest = Integer.MIN_VALUE;
    //     int smallest = Integer.MAX_VALUE;

    //     for(int i=0;i<numbers.length;i++){
    //         if(largest<numbers[i]){
    //             largest = numbers[i];
    //         }
    //         if(smallest>numbers[i]){
    //             smallest = numbers[i];
    //         }
    //     }
    //     System.out.println("Smallest Number is "+ smallest);

    //     return largest;
    // }
//--------------------------------------------------------------------------------------------
    //Binary Search

    // public static int BinarySearch(int numbers[], int key){
    //     int start = 0; 
    //     int end = numbers.length - 1;
        

    //     while(start<=end){
    //         int mid = (start + end) / 2;
    //         if(numbers[mid]==key){
    //             return mid;
    //         }
    //         if(numbers[mid]<key){
    //             start = mid + 1;
    //         }
    //         else{
    //             end = mid - 1;
    //         }
    //     }
    //     return -1;
    // }

    //------------------------------------------------------------------------------------------

    // Reverse an Array

    // public static void reverse(int numbers[]){
    //     int first = 0;
    //     int last =numbers.length - 1;

    //     while(first<last){
    //         int temp = numbers[last];
    //         numbers[last]=numbers[first];
    //         numbers[first]=temp;

    //         first++;
    //         last--;
    //     }
    // }
    //----------------------------------------------------------------------------------------

    //Pairs in an Array

    // public static void printPairs(int numbers[]){

    //     int tp=0;

    //     for(int i=0;i<numbers.length;i++){
    //         int curr = numbers[i];//2 4 6 8 10
    //         for(int j=i+1;j<numbers.length;j++){
    //             System.out.print("("+ curr +","+numbers[j]+") ");
    //             tp++; 
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("Total Pairs = "+tp);


    // }
    //-----------------------------------------------------------------------------------------

    // Print Subarrays

    // public static void printSubarrays(int numbers[]){
    //     int ts=0;
    //     int sum=0;

    //     for(int i=0;i<numbers.length;i++){
    //         int start = i;
    //         for(int j=i;j<numbers.length;j++){
    //             int end = j;
    //             for(int k= start;k<=end;k++){ // print
    //                 System.out.print(numbers[k]+" "); // subarray
    //                 sum+=numbers[k];

    //             }
    //              ts++;
    //             System.out.println();
    //         }
    //         System.out.println();
    //     }
    //      System.out.println("Sum of subarray = "+ sum);
    //     System.out.println("Total Subarrays = "+ts);
    // }
    //---------------------------------------------------------------------------------------

    // Maximum Subarray Sum(Brute-Force)

    // public static void maxSubarraySum(int numbers[]){
    //     int currSum = 0;
    //     int maxSum = Integer.MIN_VALUE;
    //     int minSum = Integer.MAX_VALUE;

    //     for(int i=0;i<numbers.length;i++){
    //         int start = i;
    //         for(int j=i;j<numbers.length;j++){
    //             int end = j;
    //             currSum=0;
    //             for(int k=start;k<=end;k++){
    //                 //print subarray sum
    //                 currSum+=numbers[k];
    //             }
    //             System.out.println(currSum);
    //             if(maxSum<currSum){
    //                 maxSum = currSum;
    //             }
    //             if(minSum>currSum){
    //                 minSum = currSum;
    //             }
    //         }

    //     }
    //     System.out.println("Max Sum = "+maxSum);
    //     System.out.println("Min Sum = "+minSum);


    // } 
    //-----------------------------------------------------------------------------------

     // Max Subarray Sum(Prefix Sum)

    // public static void prefixSum(int numbers[]){
    //     int currSum=0;
    //     int maxSum = Integer.MIN_VALUE;
    //     int prefix[] = new int[numbers.length];

    //     // Calculate Prefix
    //     prefix[0]=numbers[0];
    //     for(int i=1;i<prefix.length;i++){
    //         prefix[i]=prefix[i-1]+numbers[i];

    //     }
    //     for(int i=0;i<numbers.length;i++){
    //        int start = i;
    //         for(int j=i;j<numbers.length;j++){
    //           int  end = j;

    //           currSum = start == 0 ? prefix[end] : prefix[end]-prefix[start-1];

    //           if(maxSum<currSum){
    //             maxSum=currSum;
    //           }

    //        }
    //     }
    //     System.out.println("max sum = "+maxSum);

    // }
    //---------------------------------------------------------------------------------------

    //Max Subarray Sum(Kadane's Algorithm)

    // public static void kadanes(int numbers[]){

    //     int ms=Integer.MIN_VALUE;
    //     int cs=0;
        
    //       for(int i=0;i<numbers.length;i++){
    //         cs=cs+numbers[i];
            
    //         // if(cs<0){
    //         //     cs=0;
    //         // }
    //         // ms=Math.max(cs,ms);

    //         //For array with all negative values....[-1,-2,-3,-4]

    //         if(ms<cs){
    //             ms = cs;
    //         }
    //         cs = Math.max(cs,0);
                
            
    //     }
    //     System.out.println("Max Subarray Sum = "+ms);
    //   }
    //-------------------------------------------------------------------------------------
    
    // Trapping Rainwater Problem

    // public static int trappedRainwater(int height[]){

    //     int n = height.length;

    // // Calc left max bounary ................Auxiliary/Helper Arrays
    // int leftMax[] = new int[n];
    // leftMax[0] = height[0];
    // for(int i=1;i<n;i++){
    //     leftMax[i] = Math.max(height[i], leftMax[i-1]);
    // }
    // // Calc right max bounary
    // int rightMax[] = new int[n];
    // rightMax[n-1] = height[n-1];
    // for(int i=n-2;i>=0;i--){
    //     rightMax[i] = Math.max(height[i], rightMax[i+1]);
    // }

    // int trappedWater = 0;
    // //loop
    // for(int i=0;i<n;i++){
    //     // Calc water level = min(leftmax boundary, rightmax boundary)
    //     int waterLevel = Math.min(leftMax[i],rightMax[i]);

    //   // Trapped Water = (Waterlevel - height[i])*width
    //     trappedWater += waterLevel - height[i];
    // }
    // return trappedWater;
   
    // }

//--------------------------------------------------------------------------------------------

// Buy and Sell Stocks Problem

public static int buyAndSellStocks(int prices[]){
    int buyPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for(int i=0;i<prices.length;i++){
        if(buyPrice<prices[i]){ //Profit
          int profit = prices[i]-buyPrice;//Today's Profit
          maxProfit = Math.max(maxProfit, profit);//overall profit

        }else{
            buyPrice=prices[i];
        }
    }
    return maxProfit;
}


//-----------------------------------------------------------------------------------------
 //----------------------------------------------------------------------------------------      
    
    public static void main(String args[]){
        // Call By Reference
        // int marks[]={ 97,98,99};
        // int nonChangeable = 5;
        // update(marks,nonChangeable);
        // ln(nonChangeable);

        // //To print marks
        // for(int i=0;i<marks.length;i++){
        //     System.out.print(marks[i]+" ");
        // }
  
  //----------------------------------------------------------------------------------------- 

       //  Linear Search
        // int numbers[]={2,4,6,8,10,12,14};
        // int key = 10;

        // int index = LinearSearch(numbers,key);
        // if(index==-1){
        //     System.out.print("Not Found!");
        // }else{
        //     System.out.print("Key is at index"+index);
        // }
//-----------------------------------------------------------------------------------------
        // Canteen Menu Problem Challenge

    //     String menu[] = {"Idli","Vada","Dosa","Samosa","Poha","Pulav"};
    //     String key = "Samosa";
     
     
    //    String result = LinearSearch(menu,key);
//------------------------------------------------------------------------------------------
    //Q. Find the largest number in an array

    // int numbers[] = {1,2,6,3,5};
    // System.out.println("Largest Number is "+ getLargest(numbers));

    

//--------------------------------------------------------------------------------------------
// Binary Search
//   int numbers[] = {2,4,6,8,10,12,14};
//   int key = 10;
 
//  System.out.println("Index for key is "+BinarySearch(numbers,key));

 //------------------------------------------------------------------------------------------

 // Reverse an Array
//  int numbers[] = {2,4,6,8,10};

//  reverse(numbers);
//  for(int i=0;i<numbers.length;i++){
//     System.out.print(numbers[i]+" ");
//  }
//-----------------------------------------------------------------------------------------

//Pairs in an Array

// int numbers[] = {2,4,6,8,10};
// printPairs(numbers);
//-----------------------------------------------------------------------------------------

// Print Subarrays

// int numbers[]={2,4,6,8,10};
// printSubarrays(numbers);
//-------------------------------------------------------------------------------------------

// Maximum Subarray Sum(Brute-Force)

// int numbers[]={1,-2,6,-1,3};
// maxSubarraySum(numbers);

//-----------------------------------------------------------------------------------------

// Max Subarray Sum(Prefix Sum)

//  int numbers[]={1,-2,6,-1,3};
//  prefixSum(numbers);

 //-----------------------------------------------------------------------------------------

//Max Subarray Sum(Kadane's Algorithm)

// // int numbers[] = {-1,-2,-3,-4};
// int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
// kadanes(numbers);
//------------------------------------------------------------------------------------------

// Trapping Rainwater Problem

// int height[] = {4,2,0,6,3,2,5};
// System.out.println(trappedRainwater(height));
//------------------------------------------------------------------------------------------

// Buy and Sell Stocks Problem

int prices[] = {7,1,5,3,6,4};
System.out.println(buyAndSellStocks(prices));


}

}
