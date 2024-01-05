import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
    int [] arr={10,222,30,99,69,70,9,12};
    for(int i=0;i<arr.length;i++){
        for(int j=1;j<arr.length-i;j++){
            if(arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
        }
    }
    }
}
//last element will be sorted in every iteration 5 4 3 2 1
/**
 * 5 4 3 2 1 arr[j]<arr[j-1] so j=1 here and after each iteration remove i form arr.length-i
 * 4 5 3 2 1
 * 4 3 5 2 1
 * 4 3 2 5 1
 * 4 3 2 1 5
 * 1st iteration 
 * 4 3 2 1 "5"
 * 3 4 2 1
 * 3 2 4 1
 * 3 2 1 "4"
 * 2 3 1
 * 2 1 "3"
 * 1 "2"
 * 1 O(n^2)
 */
