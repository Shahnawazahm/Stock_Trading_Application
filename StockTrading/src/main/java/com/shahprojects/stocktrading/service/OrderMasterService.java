package com.shahprojects.stocktrading.service;

import com.shahprojects.stocktrading.entity.OrderMaster;
import com.shahprojects.stocktrading.payload.OrderMasterDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface OrderMasterService {
    public OrderMasterDTO createOrderMaster(OrderMasterDTO orderMasterDTO);
    public OrderMasterDTO getOrdrerMasterById(Long id);
    public List<OrderMaster> getAllOrderMaster();
    public void deleteOrderMaster(Long id);
}
