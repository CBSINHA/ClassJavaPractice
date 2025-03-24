public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            int[]n={1,2,3};
            System.out.println(n[3]);
        }
        catch(Exception e){
            System.out.println("Out of bounds element accessed");
        }
        finally{
            System.out.println("Execution completion");
        }
    }
}
