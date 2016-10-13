package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner inputint = new Scanner(System.in);
        int choice = 2;
        int n = 0;
        String[] nameList;
        nameList = new String[50];
        for(int i = 0; i < nameList.length; i++)
        {
            nameList[i] = "a";
        }
        int[] numberList;
        numberList = new int[50];

        while(choice == 1 || choice == 2)
        {
            if(choice == 1)
            {
                for(int i = 0; i < nameList.length; i++)
                {
                    int w = i+1;
                    if(!nameList[i].equals("a"));
                    System.out.println("Name " + w + ": " + nameList[i] + " ");
                }
                for(int d = 0; d < numberList.length; d++)
                {
                    int q = d+1;
                    if(numberList[d] != 0)
                        System.out.println("Lucky Number " + q + ": " + numberList[d] + " ");
                }
            }

            else
            {
                System.out.println("What is your name?");
                String name = input.nextLine();

                Random thing = new Random(name);
                int luckyNumber = thing.perfectRandom(2);
                System.out.println(luckyNumber);

                nameList[n] = name;
                numberList[n] = luckyNumber;
            }

            n++;
            System.out.println("Press 0 to exit, 1 for a listing of names with lucky numbers, and 2 to enter another name.");
            choice = inputint.nextInt();
        }

    }
}
