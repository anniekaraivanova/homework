import java.util.Scanner;

public class third
{
    public static void main(String [] args)
    {
        System.out.println("Въведете число");
        Scanner number1=new Scanner(System.in);
        double number=number1.nextDouble();

        System.out.println("Въведете степен");
        Scanner extend=new Scanner(System.in);
        double number2=extend.nextDouble();

        double result=Math.pow(number,number2);

        System.out.println(result);

    }
}
