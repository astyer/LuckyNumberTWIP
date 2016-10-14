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
                int x = 0;
                while(x < numberList.length)
                {
                    int w = x + 1;
                    if(!nameList[x].equals("a"))
                        {
                            System.out.println("Name " + w + ": " + nameList[x] + " ");
                        }
                    if(numberList[x] != 0)
                        {
                            System.out.println("Lucky Number " + w + ": " + numberList[x] + " ");
                            System.out.println("");
                        }
                    x++;
                }
            }

            else
            {
                System.out.println("What is your name?");
                String name = input.nextLine();

                Random numberObject = new Random();
                int luckyNumber = numberObject.perfectRandom(2);
                System.out.println("Nice to meet you " + name + "!  Your lucky number is: " + luckyNumber);

                nameList[n] = name;
                numberList[n] = luckyNumber;
                n++;
            }

            System.out.println("Press 0 to exit, 1 for a listing of names with their respective lucky numbers, and 2 to enter another name.");
            choice = inputint.nextInt();
        }

    }
}
