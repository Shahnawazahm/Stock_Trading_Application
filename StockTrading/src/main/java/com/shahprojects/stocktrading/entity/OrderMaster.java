package com.shahprojects.stocktrading.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order_master")
public class OrderMaster {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   @Column(name = "status")
   private String status; //created, confirmed, etc.
   @ManyToOne
   @JoinColumn(name = "trade_details_id")
   private TradeDetails tradeDetails;
}