import java.util.Scanner;

public class ArrayExamples {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50,60};
        Scanner scan=new Scanner(System.in);
        boolean flag=false;
        int key=scan.nextInt();
        for(int x:arr){
            if(x==key){
                System.out.println("key is found "+x);
                flag=true;
                break;
            }
        }
        if(flag==false){
            System.out.println("not found");
        }

    }
}
