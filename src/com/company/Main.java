package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner inputint = new Scanner(System.in);
        int choice = 2;
        int n = 0;
        int g =0;

        while(choice == 1 || choice == 2)
        {
            String[] nameList = {"a", "b"};
            int[] numberList = {0, 0, 0};

            if(choice == 1)
            {
                /*for(int i = 0; i < nameList.length(); i++)
                {
                    System.out.println(nameList[i] + " ");
                }
                for(int d = 0; d < numberList.length(); d++)
                {
                    System.out.println(nameList[d] + " ");
                }*/
            }

            else
            {
                System.out.println("What is your name?");
                String name = input.nextLine();

                Random thing = new Random(name);
                int luckyNumber = thing.perfectRandom(2);
                System.out.println(luckyNumber);

                nameList[n] = name;
                numberList[g] = luckyNumber;
            }

            n++;
            System.out.println("Press 0 to exit, 1 for a listing of names with lucky numbers, and 2 to enter another name.");
            choice = inputint.nextInt();
        }

    }
}
