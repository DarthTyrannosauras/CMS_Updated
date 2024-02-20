package com.example.cms.entities;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "orders")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id", nullable = false, unique = true)
	private Long orderId;

	private LocalDateTime time;

	@Column(name = "quantity")
	private int netQty;

	@Column(name = "net_amount", nullable = false)
	private int netAmount;

	@Column(name = "payment_method", nullable = false)
	private PaymentMethod paymentMethod;

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "transaction_id", nullable = false, unique = true)
	private String transactionId;

	@Column(name = "items_served", nullable = false)
	private int itemsServed;

	@Enumerated(EnumType.STRING)
	@Column(name = "order_status", nullable = false)
	private OrderStatus orderStatus;

	@Column(name = "discount_percentage", nullable = true)
	private int discountPercentage;

}
