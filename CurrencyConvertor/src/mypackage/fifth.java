package mypackage;

import java.util.Scanner;

public class fifth
{
    public static void main(String[] args)
    {

        System.out.println("Въведете дума");
        Scanner one=new Scanner(System.in);
        String str=one.nextLine();

        if (isPalindrome (str))
            System.out.print("Yes");
        else
            System.out.print("No");
    }

    public static boolean isPalindrome(String str)
    {
        int i = 0, j = str.length() - 1;

        while (i < j) {


            if (str.charAt(i) != str.charAt(j))
                return false;


            i++;
            j--;
        }

        return true;
    }
}
