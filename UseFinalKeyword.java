import java.util.Scanner;
public class UseFinalKeyword{
public static void main(String[]args)
{
final double PI=3.14159;
Scanner input=new Scanner(System.in);
System.out.println("Enter radius :");
double radius=input.nextDouble();
double area=radius*radius*PI;
System.out.println("The area is :"+area);
}
}