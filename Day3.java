import java.util.*;
public class Day3 {
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array size");
        int size= sc.nextInt();
        sc.close();
        int [] money = new int[size];

        for(int i=0;i<size;i++){
            money[i]=sc.nextInt();
            System.out.println(money[i]);
            
        } 
}
