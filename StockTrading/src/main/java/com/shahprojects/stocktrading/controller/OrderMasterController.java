package com.shahprojects.stocktrading.controller;

import com.shahprojects.stocktrading.entity.OrderMaster;
import com.shahprojects.stocktrading.payload.OrderMasterDTO;
import com.shahprojects.stocktrading.service.OrderMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orderDetails")
public class OrderMasterController {
    @Autowired
    private OrderMasterService orderMasterService;

    @PostMapping("/addOrder")
    public ResponseEntity<String> addOrderMaster(
            @RequestBody OrderMasterDTO orderMasterDTO,
            @RequestParam Long tradeId){
        orderMasterService.createOrderMaster(orderMasterDTO, tradeId);
        return new ResponseEntity<>("Order added successfully!", HttpStatus.CREATED);
    }

    @GetMapping("/getOrder")
    public ResponseEntity<?> getAllOrderMaster(){
        List<OrderMasterDTO> allOrderMasterDTO = orderMasterService.getAllOrderMaster();
        if(!allOrderMasterDTO.isEmpty())
            return new ResponseEntity<>(allOrderMasterDTO,HttpStatus.OK);

        else
            return new ResponseEntity<>("No Order Master stored yet!", HttpStatus.NOT_FOUND);
    }

    @GetMapping("/getOrderById/{id}")
    public ResponseEntity<OrderMasterDTO> getOrderMasteryById(@PathVariable Long id){
        OrderMasterDTO orderMasterById = orderMasterService.getOrderMasterById(id);
        return new ResponseEntity<>(orderMasterById, HttpStatus.OK);
    }

    @DeleteMapping("/deleteOrderById{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id){
        orderMasterService.deleteOrderMaster(id);
        return new ResponseEntity<>("Order Master deleted",HttpStatus.NO_CONTENT);
    }

}
