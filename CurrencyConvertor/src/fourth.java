import java.util.Scanner;

public class fourth
{
    public static void main(String[]args)
    {
        System.out.println("Въведи ден от седмицата");
        Scanner Day1= new Scanner(System.in);
        int day=Day1.nextInt();

        int DAY =(day + 10)%7;

        switch (DAY) {
            case 1:
                System.out.println("Понеделник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Сряда");
                break;
            case 4:
                System.out.println("Четвъртък");
                break;
            case 5:
                System.out.println("Петък");
                break;
            case 6:
                System.out.println("Събота");
                break;
            case 0:
                System.out.println("Неделя");
                break;
        }

    }
}
