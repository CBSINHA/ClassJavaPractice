import java.util.*;
class User_input_array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size=sc.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the "+(i+1)+" element: ");
            arr[i]=sc.nextInt();
        }
        System.out.println("The elements of this array are:");
        for(int i:arr){
            System.out.print(i+" ");
        }
        sc.close();
    }
}