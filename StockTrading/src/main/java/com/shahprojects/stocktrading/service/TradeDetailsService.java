package com.shahprojects.stocktrading.service;

import com.shahprojects.stocktrading.entity.TradeDetails;
import com.shahprojects.stocktrading.payload.TradeDetailsDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TradeDetailsService {
    public TradeDetailsDTO createTradeDetails(TradeDetailsDTO tradeDetailsDTO);
    public TradeDetailsDTO getTradeDetailsById(Long id);
    public List<TradeDetails> getAllTradeDetails();
    public void deleteTradeDetails(Long id);
}
