package com.shahprojects.stocktrading.payload;

import com.shahprojects.stocktrading.entity.TradeDetails;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderMasterDTO {
    private Long id;
    private String status;
    private Long tradeDetailsId;
}