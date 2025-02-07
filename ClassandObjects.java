class Car{
    private String brand,model;
    private int year;
    public Car(String brand,String model,int year){
        this.brand=brand;
        this.model=model;
        this.year=year;
    }
    public void display(){
        System.out.printf("Brand: %s Model: %s Year: %d",brand,model,year);
    }
}
public class ClassandObjects {
    public static void main(String arg[]){
    Car car=new Car("Totoya","Enova",6090);
    car.display();
    }
}
