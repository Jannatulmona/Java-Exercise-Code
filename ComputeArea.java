import java.util.Scanner;
public class ComputeArea{
 public static void main(String[]args)
{
Scanner obj=new Scanner(System.in);
while(true)
{
System.out.println("choose a shape for computing ");
System.out.println("1.Circle");
System.out.println("2.Triangle");

System.out.println("3.Square");

System.out.println("4.Trapezium");

System.out.println("5.Rectangle");
System.out.println("6.Exit");
int choice=obj.nextInt();
switch(choice)
{
case 1:
System.out.println("Enter the radius of a circle :");
double radius=obj.nextDouble();

double area1= Math.PI*radius*radius;
System.out.println("The area is :"+area1);
break;
case 2:
System.out.println("Enter the base and height of a triangle :");
double base= obj.nextDouble();
double height=obj.nextDouble();
double area2=.5*base*height;
System.out.println("The area is :"+area2);
break;
case 3:
System.out.println("Enter side_length :");
double side_length=obj.nextDouble();
double area3=side_length*side_length;
System.out.println("The area is :"+area3);
break;
case 4:
System.out.println("Enter base1,base2,height1 :");
double base1=obj.nextDouble();
double base2=obj.nextDouble();
double height1=obj.nextDouble();

double area4=.5*(base1+base2)*height1;
System.out.println("The area is :"+area4);
break;
case 5:
System.out.println("Enter length1,width :");
double length1=obj.nextDouble();
double width=obj.nextDouble();

double area5=length1*width;
System.out.println("The area is :"+area5);
break;
case 6:
System.out.println("Exting program");
return;
default:
System.out.println("Invalid choice");
}
}
}
}














