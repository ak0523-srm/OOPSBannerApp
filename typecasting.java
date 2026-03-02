import java.util.Scanner;
public class typecasting{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x=sc.nextInt();
        double y=(double)x;
        System.out.print("The half of the number is: ");
        System.out.print(y/2);
    }
}