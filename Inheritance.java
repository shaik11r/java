 class Parent1{
    int x,y;

    Parent1(){
        x=10;
        y=20;
        System.out.println("inside the parent constructor");
    }
    Parent1(int x,int y){
        this.x=x;
        this.y=y;
        System.out.println("inside parameterized constructor");
    }
}
class  Child1 extends Parent1{
    int a,b;
    Child1(){
    //automatically calling super() which calls parent constructor
    //super default constructor
    a=100;
    b=200;
    }
    Child1(int a,int b){
        super(22,33);// if we want to execute this we have to call this explicitly
        this.a=a;
        this.b=b; 
    }
    void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
    }
    
}


public class Inheritance {
    public static void main(String args[]){
        Child1 ch=new Child1();
        ch.display();
        Child1 ch2=new Child1(30,40);
        ch2.display();
    }
}
