package com.shahprojects.stocktrading.service.impl;

import com.shahprojects.stocktrading.entity.OrderMaster;
import com.shahprojects.stocktrading.entity.TradeDetails;
import com.shahprojects.stocktrading.payload.OrderMasterDTO;
import com.shahprojects.stocktrading.payload.TradeDetailsDTO;
import com.shahprojects.stocktrading.repository.OrderMasterRepository;
import com.shahprojects.stocktrading.service.OrderMasterService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.List;
@Service
public class OrderMasterServiceImplementation implements OrderMasterService {
  @Autowired
   private OrderMasterRepository orderMasterRepository;
   @Autowired
   private ModelMapper modelMapper;
    @Override
    public OrderMasterDTO createOrderMaster(OrderMasterDTO orderMasterDTO) {

       OrderMaster orderMaster= new OrderMaster();

       orderMaster.setStatus(orderMasterDTO.getStatus());
       orderMasterRepository.save(orderMaster);
        return orderMasterDTO ;
    }
    @Override
    public OrderMasterDTO getOrdrerMasterById(Long order_id){
        OrderMaster orderMaster = orderMasterRepository.findById(order_id).orElse(null);

        OrderMasterDTO orderMasterDTO = new OrderMasterDTO();

        modelMapper.map(orderMasterDTO,orderMaster);
        OrderMaster savedOrder = orderMasterRepository.save(orderMaster);
        OrderMasterDTO orderMasterDTO1 = modelMapper.map(savedOrder, OrderMasterDTO.class);
        return orderMasterDTO1 ;

    }
    @Override
    public List<OrderMaster> getAllOrderMaster(){
        return  orderMasterRepository.findAll();

    }
    @Override
    public void deleteOrderMaster(Long order_id){
        orderMasterRepository.deleteById(order_id);
    }
}
