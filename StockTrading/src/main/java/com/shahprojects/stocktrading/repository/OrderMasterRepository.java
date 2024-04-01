package com.shahprojects.stocktrading.repository;

import com.shahprojects.stocktrading.entity.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderMasterRepository extends JpaRepository<OrderMaster, Long>{
}
