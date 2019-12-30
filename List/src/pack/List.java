package pack;

import java.text.Collator;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class List
{
    public static void main(String[] args) {
        LinkedList<String> words = new LinkedList<>();

        System.out.println("commands: {add <word>}, {remove <word>}, {sort}, {print}, {end}");

        Scanner scanner = new Scanner(System.in);

        String command;

        while(!(command = scanner.nextLine()).equals("end")){
            String[] parameters = command.split(" ");

            if(parameters.length == 2 && parameters[0].equals("add")){
                words.add(parameters[1]);

                System.out.println("<Added>");
            } else if(parameters.length == 2 && parameters[0].equals("remove")){
                boolean isRemoved = words.removeFirstOccurrence(parameters[1]);

                if(isRemoved){
                    System.out.println("<Removed>");
                } else{
                    System.out.println("<Not Found>");
                }
            } else if(parameters.length == 1 && parameters[0].equals("sort")){
                Collections.sort(words, new Comparator<String>() {
                    @Override
                    public int compare(String first, String next) {
                        return Collator.getInstance().compare(first, next);
                    }
                });

                System.out.println("<Sorted>");
            } else if(parameters.length == 1 && parameters[0].equals("print")) {
                if(words.size() == 0){
                    System.out.println("<Empty>");
                }

                for (int i = 0; i < words.size(); i++) {
                    System.out.println(words.get(i));
                }
            }
        }
    }
}
