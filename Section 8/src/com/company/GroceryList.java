package com.company;

import java.util.ArrayList;

public class GroceryList {
    private static ArrayList<String> grocery = new ArrayList();
   // private static ArrayList<Integer> test= new ArrayList();
    public static void main(String[] args){



    }
    public void add(String input){
        grocery.add(input);
    }
    public void lists(){
        if(grocery.isEmpty()){
            System.out.println("the list is empty so nothing to show");
        }else{
        for(int i=0;i<grocery.size();i++){
            System.out.println(grocery.get(i));
        }
    }}
    public void remove(int input){
        grocery.remove(input);
    }
    public  void update(int index, String input){
        grocery.set(index, input);
    }
    public  boolean findout(String input){
        if(grocery.get(grocery.indexOf(input)).equals(input)){
        return  true;}
        else return false;
    }
    public int find(String name){
      return  grocery.indexOf(name);
    }
}
