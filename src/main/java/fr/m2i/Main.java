package fr.m2i;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer number = null;

        while (number == null) {
            try {
                System.out.print("Entrez un nombre : ");
                number = scanner.nextInt(); // Exception potentiellement levée, donc la variable number reste à null
                scanner.close();
            } catch (InputMismatchException e) {
                System.out.println("Attention ! Vous devez entrez un nombre");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Mince une erreur s'est produite :(");
                return;
            }
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%d x %d = %d", number, i, number * i));
        }


    }
}


