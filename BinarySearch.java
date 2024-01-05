import java.util.Scanner;

public class BinarySearch {
 public static void main(String[] args) {
    int [] arr={10,20,30,40,50,60,70,80,90,100};
    Scanner scan=new Scanner(System.in);
    int key=scan.nextInt();
    int low=0;
    int high=arr.length-1;
    boolean flag=false;
    while (low<=high) {
        int mid=(low+high)/2;
        if(arr[mid]==key){
            System.out.println(key+" found on index "+mid);
            flag=true;
            break;
        }
        else if(arr[mid]>key){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
    }
    if(flag==false)System.out.println("not found");
 }   
}
