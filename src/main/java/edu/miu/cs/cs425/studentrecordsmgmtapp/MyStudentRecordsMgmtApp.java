package edu.miu.cs.cs425.studentrecordsmgmtapp;

import edu.miu.cs.cs425.studentrecordsmgmtapp.model.Student;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MyStudentRecordsMgmtApp {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome to our Student Records Mgmt App\n!");

//        var stundents = List.of(
//                new Student(110001,"Dave","11/18/1951"),
//                new Student(110002,"Anna", "12/07/1990"),
//                new Student(110003, "Erica", "01/31/1974"),
//                new Student(110004, "Carlos", "08/22/2009"),
//                new Student(110005, "Bob", "08/05/1994"),
//                new Student(110005,"Paul","10/23/1998")
//        );


        Student[] students = {
                new Student(110001, "Dave", LocalDate.of(9151,1,18)),
                new Student(110002, "Anna", LocalDate.of(1990,7,12)),
                new Student(110003, "Erica", LocalDate.of(1974,1,31)),
                new Student(110004, "Carlos", LocalDate.of(2009,8,22)),
                new Student(110005,"Bob", LocalDate.of(1994,7,16)),
                new Student(110005,"Paul",LocalDate.of(1998,10,23)),
                new Student(110005, "Paul", LocalDate.of(1998, 10, 23))
        };
        // Step 2: Print all students sorted by name
        System.out.println("Sorted List of Students by Name:");
        printListOfStudents(students);


        //Student.forEach(System.out::println);
        System.out.println("\nList of Platinum Alumni Students:");
        List<Student> platinumAlumni = getListOfPlatinumAlumniStudents(students);
        platinumAlumni.forEach(System.out::println);
    }



    public static void printListOfStudents(Student[] students) {
        Arrays.stream(students)
                .sorted(Comparator.comparing(Student::getName))
                .forEach(System.out::println);
    }

    public static List<Student> getListOfPlatinumAlumniStudents(Student[] students) {
        LocalDate thirtyYearsAgo = LocalDate.now().minusYears(30);
        return Arrays.stream(students)
                .filter(student -> student.getDateOfAdmission().isBefore(thirtyYearsAgo))
                .sorted(Comparator.comparing(Student::getDateOfAdmission).reversed())
                .collect(Collectors.toList());


    }
}