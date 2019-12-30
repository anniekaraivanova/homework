import java.util.IllegalFormatCodePointException;
import java.util.Scanner;
import java.io.InputStreamReader;

public class Currency
{
    public static void main(String [] args)
    {


        System.out.println("Въведи стойност");
        Scanner Famount= new Scanner(System.in);
        int amount =Famount.nextInt();

        System.out.println("Избери валута за обмяна  BGN , EUR , GBP");
        Scanner exchange= new Scanner(System.in);
        String valuta =exchange.nextLine();



            double BGN1= amount*1.754;
        double EUR1 = amount*0.8963;
        double GBP1 = amount*0.7737;



        switch (valuta){
            case "BGN":
                System.out.println(BGN1);
                break;
            case "EUR":
                System.out.println(EUR1);
                break;
            case "GBP":
                System.out.println(GBP1);
                break;



        }





    }


}


