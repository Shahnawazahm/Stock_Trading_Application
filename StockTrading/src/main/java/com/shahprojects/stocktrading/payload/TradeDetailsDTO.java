package com.shahprojects.stocktrading.payload;

import com.shahprojects.stocktrading.entity.OrderMaster;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class TradeDetailsDTO {
    private String tradeDetailsId;
    private String stockName;
    private double listingPrice;
    private int quantity;
    private String type;
    private double pricePerUnit;
    private LocalDateTime tradeDateTime;
}