package com.shahprojects.stocktrading.service;

import com.shahprojects.stocktrading.entity.OrderMaster;
import com.shahprojects.stocktrading.payload.OrderMasterDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface OrderMasterService {
    public void createOrderMaster(OrderMasterDTO orderMasterDTO, Long id);
    public OrderMasterDTO getOrderMasterById(Long id);
    public List<OrderMasterDTO> getAllOrderMaster();
    public void deleteOrderMaster(Long id);
}
