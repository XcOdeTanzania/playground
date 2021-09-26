package com.qlicue.loans.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
        return  List.of( new Student(
                1L,
                "Mariam",
                "maria.james@gmail.com",
                LocalDate.of(2002,4, 16),21
        ));
    }
}
