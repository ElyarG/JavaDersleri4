package sample;


import java.util.Scanner;

import static java.lang.String.*;

public class Main  {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your rating");
        int rating = scanner.nextInt();

        if (rating > 2500)
               System.out.println("Your title is GM");
        else if (rating > 2400 && rating < 2500)
               System.out.println("Your title is IM");
        else if (rating > 2300 && rating < 2400)
               System.out.println("Your title is FM");
        else
              System.out.println("You are a club player");




}}
