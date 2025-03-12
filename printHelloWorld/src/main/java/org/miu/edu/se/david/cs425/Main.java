package org.miu.edu.se.david.cs425;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");

        int [] Array = {1,35,3,4,5,6,7,8,9,10};


        printHelloWorld(Array);

        findSecondBiggest(Array);

    }



    public static void printHelloWorld(int[] array) {
        for(int i = 0; i<array.length; i++){
            if(array[i]%5 == 0){
                System.out.print("Value " + array[i] + " is Hello \n");
            }
            if(array[i]%7 == 0){
                System.out.print("Value " + array[i] + " is World \n");
            }
            if((array[i]%5==0) && (array[i]%7==0)){
                System.out.print("Value " + array[i] + " is Hello World \n ");
            }
        }
    }

    public static void findSecondBiggest(int[] array) {
        int max = array[0];
        int secondBiggest = array[0];
        int maxIndex = 0;
        for(int i = 0; i<array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
            for(int k = 0; k<array.length; k++){
               // System.out.println("Value of K " + k);
                secondBiggest = array[0];

                if(secondBiggest<array[k]){
                    secondBiggest = array[k];

                }
            }

        System.out.println("The biggest integer is " + max + " and SecondBiggest is " +secondBiggest);

    }
}