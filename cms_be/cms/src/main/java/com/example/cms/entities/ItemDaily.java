package com.example.cms.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "item_daily")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ItemDaily {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sr_no")
	private Long id;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "item_id")
	@MapsId
	private ItemMaster item;

	@Column(name = "init_qty", nullable = false)
	private int initialQty;

	@Column(name = "sold_qty", nullable = false)
	private int soldQty;

}
