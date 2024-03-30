package com.shahprojects.stocktrading.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TradeDetailsDTO {
    private Date trade_data_time;
    private String stock_name;
    private float listing_price;
    private int quantity;
    private String type;
    private float price_per_unit;
}
