class Hello{

    public static void main(String args[]){
        System.out.println("helloooo");
        Namskar x=new Namskar();
        int y=x.add(1,2,3);
        System.out.println(y);
    }
}
class Namskar{

    int add(int a,int b,int c){
        return a+b+c;
    }
}