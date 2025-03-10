package edu.miu.cs.cs425.studentrecordsmgmtapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    private int studentId;
    private String name;
    private String dateOfAdmission;
}
