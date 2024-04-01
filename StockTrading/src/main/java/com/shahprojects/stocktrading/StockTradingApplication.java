package com.shahprojects.stocktrading;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.ui.ModelMap;

@SpringBootApplication
public class StockTradingApplication {

    public static void main(String[] args)
    {
        SpringApplication.  run(StockTradingApplication.class, args);
    }
@Bean
  public  ModelMapper getModalMappedBean(){
        return new ModelMapper();
}

}
