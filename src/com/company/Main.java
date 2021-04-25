package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    System.out.println("Hello IntelliJ");

    Title title = new Title();

    System.out.println("The name as you know is : "+ title.getCall()+"."+title.getName());

    title.setCall("Mr.");
    title.setName("Venki");

        System.out.println("The name as you know is : "+ title.getCall()+"."+title.getName());




    }


}
