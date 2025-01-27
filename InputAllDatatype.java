import java.util.Scanner;
public class InputAllDatatype{
    public static void main(String[]args)
    {
        Scanner obj =new Scanner(System.in);
        int intvalue=obj.nextInt();
        float floatvalue=obj.nextFloat();
        double doublevalue=obj.nextDouble();
        boolean booleanvalue=obj.nextBoolean();
 
        char charvalue=obj.next().charAt(0);
obj.nextLine(); //to remove extra newline(\n)
        String stringvalue=obj.nextLine();
        System.out.println("int :"+intvalue+","+"float :"+floatvalue+","+"double :"+doublevalue+","+"boolean:"+booleanvalue+","+"char :"+charvalue+","+"string :"+stringvalue);
    }
}