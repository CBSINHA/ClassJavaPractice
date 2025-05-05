import java.util.*;
public class Electricity {
    public static void main(String[] args) {
   int n=sc.nextInt();
   Double cost=0.0;
   if(n<=50)cost=n*0.5;
   if(n>50&&n<=150)cost=50*0.5+(n-50)*0.75;
   if(n>150&&n<=250)cost=50*0.5+100*0.75+(n-150)*1.2;
   if(n>250)cost=50*0.5+100*0.75+100*1.2+(n-250)*1.5;
   System.out.printf("%.2f",1.2*cost);
    }
}
