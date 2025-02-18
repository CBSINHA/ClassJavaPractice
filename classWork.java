import java.util.*;
public class classWork {
    public static void main(String[] args) {
    int[]arr;
    String str="This is a sample string!";
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the length of the array: ");
    int n=sc.nextInt();
    arr=new int[n];
    System.out.println("Enter the elements of the array to get its length too.");
    for(int i=0;i<n;i++)arr[i]=sc.nextInt();
    System.out.print("The entered array: ");
    for(int i:arr)System.out.print(i+" ");
    System.out.println();
    System.out.println("Length of the array= "+arr.length);
    System.out.println("Length of "+str+"= "+str.length());
    }
}
