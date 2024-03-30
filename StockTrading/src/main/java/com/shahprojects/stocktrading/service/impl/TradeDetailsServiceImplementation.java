package com.shahprojects.stocktrading.service.impl;

import com.shahprojects.stocktrading.entity.TradeDetails;
import com.shahprojects.stocktrading.payload.TradeDetailsDTO;
import com.shahprojects.stocktrading.repository.TradeDetailsRepository;
import com.shahprojects.stocktrading.service.TradeDetailsService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.List;

@Service
public class TradeDetailsServiceImplementation implements TradeDetailsService {
    @Autowired
    private TradeDetailsRepository tradeDetailsRepository;
    @Autowired
    private ModelMapper modelMapper;

    //creating Trade Details
@Override
    public TradeDetailsDTO createTradeDetails(TradeDetailsDTO tradeDetailsDTO) {

         TradeDetails tradeDetails= new TradeDetails();
       modelMapper.map(tradeDetailsDTO,tradeDetails);

      TradeDetails savedTrade=tradeDetailsRepository.save(tradeDetails);
        TradeDetailsDTO tradeDetailsDTO1 = modelMapper.map(savedTrade, TradeDetailsDTO.class); // map(entity, dto)
        return tradeDetailsDTO1 ;
    }
    @Override
    public TradeDetailsDTO getTradeDetailsById(Long id){
        TradeDetails tradeDetails = tradeDetailsRepository.findById(id).orElse(null);

        TradeDetailsDTO tradeDetailsDTO = new TradeDetailsDTO();
          //tradeDetailsDTO.setTrade_data_time(tradeDetails.getTrade_data_time());
          tradeDetailsDTO.setQuantity(tradeDetails.getQuantity());
          tradeDetailsDTO.setStock_name(tradeDetails.getStock_name());
          tradeDetailsDTO.setListing_price(tradeDetails.getListing_price());
          tradeDetailsDTO.setPrice_per_unit(tradeDetails.getPrice_per_unit());


        return tradeDetailsDTO ;
    }
    @Override
    public List<TradeDetails> getAllTradeDetails(){
        return  tradeDetailsRepository.findAll();

    }
    @Override
    public void deleteTradeDetails(Long id){
     tradeDetailsRepository.deleteById(id);
    }
}
