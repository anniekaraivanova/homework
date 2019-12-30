import java.util.Scanner;

public class First
{


   public static void main(String [] args)
   {
       System.out.println("Въведи стойност");
       Scanner Fcurrency= new Scanner(System.in);
       int currency =Fcurrency.nextInt();




       double BGN1= currency*1.754;
       double EUR1 = currency*0.8963;
       double GBP1 = currency*0.7737;

       System.out.println("В Лева  "+BGN1 );
       System.out.println("В Евро "+EUR1 );
       System.out.println("Е Паунди "+GBP1 );

       System.out.println("Избери валута за обмяна  BGN , EUR , GBP");
       Scanner exchange= new Scanner(System.in);
       String valuta =exchange.nextLine();

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
