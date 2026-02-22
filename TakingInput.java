import java.util.Scanner;
public class TakingInput{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("The square of the number is : ");
        System.out.print(n*n);
    }
}