package com.example.cms.entities;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "students")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Student {
	@Id
	@Column(name = "student_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long studentId;

	@Column(length = 20, name = "name")
	private String name;

	@Column(length = 40, name = "email")
	private String email;

	@Column(length = 20, name = "password")
	private String password;

	@Column(length = 10, name = "mobile_no")
	private String mobileNo;

	@Column(length = 20, name = "balance")
	private int balance;

	@Column(length = 20, name = "dob")
	private LocalDate dob;

	@Column(length = 20, name = "course_name")
	private Course courseName;

}
