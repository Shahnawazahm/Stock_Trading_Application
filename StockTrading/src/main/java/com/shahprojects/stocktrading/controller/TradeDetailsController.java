package com.shahprojects.stocktrading.controller;

import com.shahprojects.stocktrading.entity.TradeDetails;
import com.shahprojects.stocktrading.payload.TradeDetailsDTO;
import com.shahprojects.stocktrading.service.TradeDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/tradeDetails")
public class TradeDetailsController {

    @Autowired
    private TradeDetailsService  tradeDetailsService;

    @PostMapping("/addTrade")
    public ResponseEntity<String> addTradeDetails(@RequestBody TradeDetailsDTO tradeDetailsDTO){
        tradeDetailsService.createTradeDetails(tradeDetailsDTO);
        return new ResponseEntity<>("Trade added successfully!",HttpStatus.CREATED);
    }

    @GetMapping("getTrade")
    public ResponseEntity<?> getAllTradeDetails(){
        List<TradeDetailsDTO> allTradeDetails = tradeDetailsService.getAllTradeDetails();
        if(allTradeDetails != null && !allTradeDetails.isEmpty()){
            return new ResponseEntity<>(allTradeDetails,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }
    @GetMapping("getTradeById/{id}")
    public ResponseEntity<TradeDetailsDTO> getTradeDetailsById(@PathVariable Long id){
        TradeDetailsDTO tradeDetailsById = tradeDetailsService.getTradeDetailsById(id);
        return new ResponseEntity<>(tradeDetailsById, HttpStatus.OK);
    }
    @DeleteMapping("deleteTradeById/{id}")
    public ResponseEntity<String> deleteTradeDetails(@PathVariable Long id){
        tradeDetailsService.deleteTradeDetails(id);
        return new ResponseEntity<>("Trade Details deleted ", HttpStatus.NO_CONTENT);
    }
}
