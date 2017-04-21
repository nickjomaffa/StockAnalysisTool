package com.stock.analysis.main.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stock.analysis.model.Stock;
import com.stock.analysis.util.PriceUtil;

@RestController
public class DataController {
	
    @RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE, value="/")
    public Stock index() {
        return new Stock("TEST", PriceUtil.toPrice(45.50));
    }
	    
}
