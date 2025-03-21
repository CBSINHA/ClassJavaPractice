//Non static nestd cls to print area of circle
import java.util.Scanner;
public class CircleArea{
    class InnerClass{
        public void Area(){
        Scanner sc=new Scanner(System.in);
        double radius=sc.nextDouble();
        System.out.println("The area of the circle is: "+Math.PI*radius*radius);
        }
    }
    public static void main(String[] args) {
        CircleArea obj=new CircleArea();
        CircleArea.InnerClass obj1=obj.new InnerClass();
        obj1.Area();
    }
}