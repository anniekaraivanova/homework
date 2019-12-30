import java.util.Scanner;

public class Seconds
{

        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Въведете секунди: ");
            int seconds = in.nextInt();

            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;

            System.out.print( minutes +  ":" + remainingSeconds);

        }

}
