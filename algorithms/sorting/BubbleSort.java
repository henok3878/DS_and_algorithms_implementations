package algorithms.sorting;

import java.util.List;

public class BubbleSort {

    int[] sort(int[] unsortedArray){
        for(int i = 0; i < unsortedArray.length ; i++){
            boolean isThereSwap = false;
            for(int j = 0; j < unsortedArray.length - i - 2 ; j++){
                int currentInt = unsortedArray[j];
                int nextInt = unsortedArray[j+1];
                if(currentInt > nextInt){
                    unsortedArray[j] = nextInt;
                    unsortedArray[j+1] = currentInt;
                    isThereSwap = true;
                }

            }
            if(!isThereSwap){
                return unsortedArray;
            }
        }
        return unsortedArray;
        
    }

    public static void main(String[] args){
        int[] unsortedArray = {5,1,4,2,8};
        BubbleSort bubbleSort = new BubbleSort();
        int[] sortedArray = bubbleSort.sort(unsortedArray);

        for(int elem : sortedArray){
            System.out.print(elem+" , ");
        }
        

    }

}
