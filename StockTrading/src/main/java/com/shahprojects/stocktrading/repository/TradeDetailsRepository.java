package com.shahprojects.stocktrading.repository;

import com.shahprojects.stocktrading.entity.TradeDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TradeDetailsRepository extends JpaRepository<TradeDetails,Long>{
}
