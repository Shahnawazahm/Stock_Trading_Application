package com.shahprojects.stocktrading.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "trade_details")
public class TradeDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "trade_Details_id")
    private Long tradeDetailsId;

    @Column(name = "trade_date_time")
    private LocalDateTime tradeDateTime;

    @Column(name = "stock_name")
    private String stockName;

    @Column(name = "listing_price")
    private double listingPrice;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "type")
    private String type; //buy or sell

    @Column(name = "price_per_unit")
    private double pricePerUnit;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tradeDetails")
    private List<OrderMaster> orderMasters;

//    @PrePersist
//    public void prePersist() {
//        this.tradeDateTime = LocalDateTime.now(); // Set the current date and time when persisting the entity
//    }
}
