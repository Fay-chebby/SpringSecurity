package demo.example.demosecurity.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;

import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter


public class Student {
    private final Integer studentId;
    private final String studentName;
    private final String studentEmail;


}
