package edu.miu.cs.cs425.studentrecordsmgmtapp;

import edu.miu.cs.cs425.studentrecordsmgmtapp.model.Student;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        var stundents = List.of(
                new Student(110001,"Dave","11/18/1951"),
                new Student(110002,"Anna", "12/07/1990"),
                new Student(110003, "Erica", "01/31/1974"),
                new Student(110004, "Carlos", "08/22/2009"),
                new Student(110005, "Bob", "08/05/1994"),
                new Student(110005,"Paul","10/23/1998")
        );
        stundents.forEach(System.out::println);

    }
}