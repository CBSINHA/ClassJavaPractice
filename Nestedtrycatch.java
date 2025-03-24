public class Nestedtrycatch {
    public static void main(String[] args) {
        try{
            int [] arr={1,2,3};
            int a=arr[10];
            try{
                int res=10/0;
            }
            catch(ArithmeticException e){
                System.out.println("Inner catch: Division by 0");
            }
        }
        catch(Exception e){
            System.out.println("Outer catch:General exception");
        }
    }
}
