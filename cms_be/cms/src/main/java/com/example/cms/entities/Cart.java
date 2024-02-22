package com.example.cms.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "carts")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cart_id", nullable = false, unique = true)
	private Long cartId;

	@OneToOne
	@JoinColumn(name = "item_id")
	private ItemDaily item;

	@Column(name = "qty_ordered", nullable = false)
	private int qtyOrdered;

	@Column(name = "net_price", nullable = false)
	private int netPrice;
}
