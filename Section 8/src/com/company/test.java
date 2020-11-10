package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class test {

    public static GroceryList grocery = new GroceryList();
    public static Scanner input = new Scanner(System.in);
    public static Scanner  newone = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Do you wish to see values? Y/N");
        String c = input.nextLine();

        if(c.equals(("Y"))){
            boolean t = false;
           while(!t) {
            int token = questions();
            switch(token){
                case 0:
                    System.out.println("ka");
                    break;
                case 1:
                    grocery.lists();
                    break;
                case 2:
                    System.out.println("please enter");
                    String value = input.next();
                    grocery.add(value);
                    break;
                case 3:
                    System.out.println("please enter location ");
                    int m = input.nextInt()+1;
                    System.out.println("please enter the new name");
                    String name = input.next();
                    grocery.update(m,name);
                    break;
                case 4:
                    System.out.println("please enter name to delete");
                    grocery.remove(grocery.find(input.next()));
                    break;
                case 5:
                    System.out.println("please enter the item to be searched");
                    if(grocery.findout(input.next())) System.out.println("the value exists");
                    else System.out.println("The name is not present");
                    break;
                case 6:
                    System.out.println("quiting ");
                    t=true;
                    break;
                default:
                    System.out.println("error");
                    t= true;

            }
           }

        }
        else{ System.out.println("sorry please try again");}
             //  questions(input.nextInt); }




    }
    public static int questions(){

        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
        return input.nextInt();
    }

    }

