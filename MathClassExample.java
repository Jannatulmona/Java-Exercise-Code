import java.util.Scanner;
public class MathClassExample{
public static void main(String[]args){
Scanner obj=new Scanner(System.in);
System.out.println("Enter input for absolute value :");
int input=obj.nextInt();
System.out.println("The absolute of value of input :"+Math.abs(input));
System.out.println("Enter range for max and min value :");

int a=obj.nextInt();
int b=obj.nextInt();
System.out.println("The max value between "+a+"and "+b+" : "+Math.max(a,b));
System.out.println("The min value between "+a+"and "+b+" : "+Math.min(a,b));
System.out.println("Enter root for square root value :");

int root=obj.nextInt();
System.out.println("The square root of : "+Math.sqrt(root));
System.out.println("The random value between 0.0 and 1.0 : "+Math.random());
System.out.println("The Euler's value is : "+Math.E);
System.out.println("Enter value for exponential :");
int value=obj.nextInt();

System.out.println("e^"+value+" :"+Math.exp(value));
System.out.println("The value of Ln("+value+")"+Math.log(value));
obj.close();
}
}





