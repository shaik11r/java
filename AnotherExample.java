import java.util.Scanner;
abstract class Shapes{ //abstract class 
    double area;
    abstract public void input();//implemented in child 
    abstract public void compute();//will be implemented in child
    public void disp(){
        System.out.println("the area is "+area);
    }
}

class Reactangle extends Shapes{
    float length;
    float breadth;

    public void input(){
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter the length of rectangle");
        length=scan.nextFloat();
        System.out.println("enter the breadth of rectangle");
        breadth=scan.nextFloat();

    }
    public void compute(){
        area=length*breadth;
    }
}
class Cricle extends Shapes{
    float radius;
    public void input(){
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter the length of circle");
        radius=scan.nextFloat();
    }
    public void compute(){
        area=3.14*radius*radius;
    }
}
class Square extends Shapes{
    float radius;
    public void input(){
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter the l of square");
        radius=scan.nextFloat();
    }
    public void compute(){
        area=radius*radius;
    }
}
class Geomtry{
    void permit(Shapes s){
        s.input();
        s.compute();
        s.disp();
    }//polymorphism
}
public class AnotherExample {
    public static void main(String[] args) {
        Cricle c=new Cricle();
        Reactangle rec=new Reactangle();
        Square sq=new Square();
        Geomtry g=new Geomtry();
        g.permit(sq);
        g.permit(rec);
        g.permit(c);
    }
}
