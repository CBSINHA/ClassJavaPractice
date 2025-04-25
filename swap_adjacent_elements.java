import java.util.*;
import java.io.PrintWriter;
public class swap_adjacent_elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PrintWriter writer=new PrintWriter(System.out);
        int n=sc.nextInt();
        String[]words=new String[n];
        for(int i=0;i<n;i++){
            words[i]=sc.next();
        }
        for(int i=0;i<n-1;i+=2){
            String tmp=words[i];
            words[i]=words[i+1];
            words[i+1]=tmp;
        }
        for(String i:words){
            writer.print(i+" ");
        }
        writer.close();
    }
}
