package com.galvanize;

public class Application {

    public static void main(String[] args) {
<<<<<<< HEAD
        String helloWorld = "Hello World";
        System.out.println(helloWorld);

        int input = 91;
        if (input < 0 || input >100){
            return;
        }

        if(input <= 100 && input >= 90){
            System.out.println("A");
        } else if (input <90 && input >= 80) {
            System.out.println("B");
        } else if (input < 80 && input >= 70) {
            System.out.println("C");
        } else if (input < 70 && input >=60) {
            System.out.println("D");
        }else{
            System.out.println("F");
        }
=======

        System.out.println("hello world");
>>>>>>> d8f61845d297c31339158b781e41ef1847d90723
    }

}