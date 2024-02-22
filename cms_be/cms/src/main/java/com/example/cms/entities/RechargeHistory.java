package com.example.cms.entities;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "recharge_history")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class RechargeHistory {
	@Column(name = "recharge_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long transactionId;

	@Column(name = "timestamp", nullable = false, unique = true)
	private LocalDateTime timeStamp;

	@Column(name = "amount_added", nullable = false)
	private int amountAdded;
}
