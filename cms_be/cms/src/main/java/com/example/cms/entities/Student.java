package com.example.cms.entities;

import java.time.LocalDate;
import java.util.List;

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

	@Column(length = 60, name = "name", nullable = false)
	private String name;

	@Column(length = 40, name = "email", unique = true, nullable = false)
	private String email;

	@Column(length = 20, name = "password", nullable = false)
	private String password;

	@Column(length = 10, name = "mobile_no", unique = true, nullable = false)
	private String mobileNo;

	@Column(name = "balance", nullable = false)
	private int balance;

	@Column(name = "dob")
	private LocalDate dob;

	@Column(name = "course_name")
	private Course courseName;
	
	@OneToMany
	@JoinColumn(name = "student_id")
	private List<Order> orders;
	
	@OneToMany
	@JoinColumn(name = "student_id")
	private List<RechargeHistory> rechargeHis;

}
