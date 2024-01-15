class Plane{
    public void takeoff(){
        System.out.println("plane is taking off");
    }
    public void landing(){
        System.out.println("plane is landing");
    }
    public void fly(){
        System.out.println("plane is flying");
    }
}
class CargoPlane extends Plane{
    public void fly(){
        System.out.println("cargo is flying");
    }
}
class PassengerPlane extends Plane{
    public void fly(){
        System.out.println("PassengerPlane is flying");
    }
}
class AirPort{
    public void permit(Plane plane){
        plane.takeoff();
        plane.fly();
        plane.landing();
    }
}
public class PolyMorphism {
    public static void main(String[] args) {
       CargoPlane cp =new CargoPlane();
       PassengerPlane pp=new PassengerPlane();
       AirPort ap=new AirPort();
       ap.permit(pp);//reference Plane plane Plane is parent class
       ap.permit(cp);
    }
}
//directly using parent type ref you cannot call child class specilaized method
