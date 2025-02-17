class Car{
    void fuel(){
        System.out.println("The car will have some fuel.");
    }

}
class Hatchback extends Car{
    void fuel(){
        System.out.println("The Hatchback has 40L fuel capacity");
    }
}
class Sedan extends Hatchback{
    void fuel(){
        System.out.println("The sedan has 90L fuel storage tank capacity.");
    }
}
public class Overriding {
    public static void main(String[] args) {
    Car car1,car2,car3;
    car1=new Car();
    car2=new Hatchback();
    car3=new Sedan();
    car1.fuel();
    car2.fuel();
    car3.fuel();
}}
