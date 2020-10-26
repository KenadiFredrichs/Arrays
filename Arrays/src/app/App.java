package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        String seniors[] = {"Rogan" , "Brandon"};
        String juniors[] = {"Bryan" , "Hamilton" , "Kenadi" , "Mason"};
        String sophomores[] = {"luke" , "Will" , "Alexis" , "Taten"};

        System.out.println("Enter a name");
        String enteredname = input.nextLine();

        for (int i = 0; i < sophomores.length; i++){
            if(enteredname.equals(sophomores[i])){
                System.out.println("Grade 10");
            }
        }
        for (int i = 0; i < juniors.length; i++){
            if(enteredname.equals(juniors[i])){
                System.out.println("Grade 11");
            }
         }
        for (int i = 0; i < seniors.length; i++){
            if(enteredname.equals(seniors[i])){
                System.out.println("Grade 12");
            }
         }
    }
}