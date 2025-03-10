package edu.miu.cs.cs425.studentrecordsmgmtapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    private long studentId;
    private String name;
    private LocalDate dateOfAdmission;

    public void setDateOfAdmission(String dateOfAdmission) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dateOfAdmission = LocalDate.parse(dateOfAdmission, formatter);
    }
}
