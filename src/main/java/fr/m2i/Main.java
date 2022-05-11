package fr.m2i;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nbOne;
        int nbTwo;
        int nbThree;
        System.out.print("Entrer le premier nombre : ");
        nbOne = scanner.nextInt();
        System.out.print("Entrer le deuxieme nombre : ");
        nbTwo = scanner.nextInt();
        scanner.close();
        nbThree = nbOne * nbTwo;
        String resultToFormat = "Résultat : %d * %d = %d";
        String result = String.format(resultToFormat, nbOne, nbTwo, nbThree);

        System.out.println(result);
    }




}

