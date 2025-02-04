public class VarArg {
    public static int varargs(int ... args){
        System.out.println("Argument length: "+args.length);
        int sum=0;
        for(int i:args){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int sum1=varargs(1,2);
        System.out.println("Sum of 1 and 2: "+sum1);
        System.out.println("Sum of 40 and 60 and 100: "+varargs(40,60,100));
        System.out.println("Sum of 1 2 3 4 5 6 7 8 and 9: "+varargs(1,2,3,4,5,6,7,8,9));
    }
}
