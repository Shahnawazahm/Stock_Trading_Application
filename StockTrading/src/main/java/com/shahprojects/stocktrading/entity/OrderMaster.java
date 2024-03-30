package com.shahprojects.stocktrading.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderMaster {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private int order_id;
   private int  trade_id;
   private int quantity;
   private float per_unit_price;
   private String status;
}
