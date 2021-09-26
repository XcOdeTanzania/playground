package com.qlicue.loans;

import com.qlicue.loans.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}

	@GetMapping
	public List<Student> hello(){
		return  List.of( new Student(
				1L,
				"Mariam",
				"maria.james@gmail.com",
				LocalDate.of(2002,4, 16),21
		));
	}
}
