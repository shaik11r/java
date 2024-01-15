class Parent{
    public void run(){
        System.out.println("parent is running");
    }
}
class Child1 extends Parent{
    public void run(){
        System.out.println("child1 is running");
    }
    public void stopped(){
        System.out.println("child1 is stopped");
    }
}
class Child2 extends Parent{
    public void run(){
        System.out.println("child2 is running");
    }
    public void stopped(){
        System.out.println("child2 is stopped");
    }
}
public class PolyMorphism2 {
    public static void main(String[] args) {
        Parent p=new Child1();//parent method temporarily change into  child type
        p.run();
        ((Child1)p).run();
    }
}
