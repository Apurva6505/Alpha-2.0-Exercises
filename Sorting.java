import java.util.Arrays;
public class Sorting{

    // Bubble Sort

    // public static void bubbleSort(int arr[]){

    //     for(int turn=0;turn<arr.length-1;turn++){
    //       int swap = 0;
    //         for(int j=0;j<arr.length-1-turn;j++){
    //             if(arr[j]>arr[j+1]){
    //                 //swap
    //                 int temp=arr[j];
    //                 arr[j]=arr[j+1];
    //                 arr[j+1]=temp;
    //                 swap++;
    //             }
                 
    //         }
    //        System.out.println("Swaps= "+swap); 

    //     }

       
    // }

    // Optimized bubble sort code 

    // public static void bubbleSort(int arr[]){
    //     int n = arr.length;

    //     for(int i=0;i<(n-1);i++){

    //         boolean swapped = false;
    //         for(int j=0;j<(n-i-1);j++){

    //             if(arr[j]>arr[j+1]){
    //                 int temp = arr[j];
    //                 arr[j]=arr[j+1];
    //                 arr[j+1]=temp;

    //                 swapped = true;
    //             }

    //         }
    //         if(!swapped)
    //         break;

    //     }
    // }
    //----------------------------------------------------------------------------------------

    // Selection Sort

    // public static void selectionSort(int arr[]){

    //     for(int i=0;i<arr.length-1;i++){
    //         int minPos = i;
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[minPos]>arr[j]){
    //                 minPos = j;
    //             }
    //         }
    //         int temp = arr[minPos];
    //         arr[minPos]=arr[i];
    //         arr[i]=temp;
    //     }
    // } 
    //----------------------------------------------------------------------------------------

    // Insertion Sort

//    public static void insertionSort(int arr[]){

//     for(int i=1;i<arr.length-1;i++){
//         int arr[curr] = i;
//         int prev = i-1;
//         //Finding correct position for insertion

//         while(prev>=0 && arr[prev]>curr){
//             arr[prev+1]=arr[prev];
//             prev--;
//         }
//          arr[prev+1]=curr;
//     }

//    }
//----------------------------------------------------------------------------------------------

// Counting Sort

public static void countingSort(int arr[]){

    int largest = Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        largest = Math.max(largest,arr[i]);
    }

    int count[] = new int[largest+1];
    for(int i=0;i<arr.length;i++){
        count[arr[i]]++;
    }
    //Sorting

    int j=0;
    for(int i=0;i<count.length;i++){
        while(count[i]>0){
            arr[j]=i;
            j++;
            count[i]--;
        }
    }
}



  //------------------------------------------------------------------------------------------
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //---------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------

    public static void main(String args[]){

      //Bubble Sort  
    //   int arr[] = {5,4,1,3,2};
    //   bubbleSort(arr);
    //   printArr(arr);
    //--------------------------------------------------------------------------------------

   // Selection Sort

  //  int arr[] = {5,4,1,3,2};
  //  selectionSort(arr);
  //  printArr(arr);
   //---------------------------------------------------------------------------------------

    // Insertion Sort

    // int arr[] = {5,4,1,3,2};
    // insertionSort(arr);
    // printArr(arr);
    //--------------------------------------------------------------------------------------

    //Inbuilt Sort

    // int arr[] = {5,4,1,3,2};
    // Arrays.sort(arr);
    // printArr(arr);

    //---------------------------------------------------------------------------------------

    // Counting Sort
    
    int arr[] = {1,4,1,3,2,4,3,7};
    //int arr[] = {5,4,1,3,2};
    countingSort(arr);
    printArr(arr);





    }
}
